package de.spricom.dessert.slicing;

import de.spricom.dessert.util.Predicate;
import de.spricom.dessert.util.Sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * A concrete slice is a concrete collection of classes.
 * Hence it contains a set of {@link Clazz}.
 * The sum or difference on concrete slices
 * produce a concrete slice again.
 */
public class ConcreteSlice extends AbstractSlice implements Concrete {
    public static final ConcreteSlice EMPTY_SLICE = new ConcreteSlice(Collections.<Clazz>emptySet());

    private final Set<Clazz> entries;

    protected ConcreteSlice(Set<Clazz> entries) {
        this.entries = entries;
    }

    @Override
    public Slice combine(final Slice other) {
        if (other instanceof Concrete) {
            ConcreteSlice slice = new ConcreteSlice(Sets.union(entries, other.getClazzes()));
            return slice;
        }
        Predicate<Clazz> combined = new Predicate<Clazz>() {
            @Override
            public boolean test(Clazz sliceEntry) {
                return contains(sliceEntry) || other.contains(sliceEntry);
            }
        };
        DerivedSlice derived = new DerivedSlice(combined);
        if (other.isIterable()) {
            ClazzResolver resolver = new ClazzResolver() {
                @Override
                public Set<Clazz> getClazzes() {
                    return Sets.union(entries, other.getClazzes());
                }
            };
            return new DeferredSlice(derived, resolver);
        }
        return derived;
    }

    @Override
    public ConcreteSlice slice(Predicate<Clazz> predicate) {
        Set<Clazz> filtered = new HashSet<Clazz>();
        for (Clazz entry : entries) {
            if (predicate.test(entry)) {
                filtered.add(entry);
            }
        }
        return new ConcreteSlice(filtered);
    }

    @Override
    public boolean contains(Clazz entry) {
        return entries.contains(entry);
    }

    @Override
    public boolean isIterable() {
        return true;
    }

    public Set<Clazz> getClazzes() {
        return entries;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("slice of [");
        Iterator<Clazz> iter = entries.iterator();
        boolean first = true;
        while (iter.hasNext() && sb.length() < 60) {
            Clazz entry = iter.next();
            if (first) {
                first = false;
            } else {
                sb.append(", ");
            }
            sb.append(entry.getName());
        }
        if (iter.hasNext()) {
            sb.append(" ...");
        }
        sb.append("]");
        return sb.toString();
    }

}
