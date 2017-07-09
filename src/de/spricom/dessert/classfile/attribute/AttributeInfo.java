package de.spricom.dessert.classfile.attribute;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Set;

import de.spricom.dessert.classfile.constpool.ConstantPool;
import de.spricom.dessert.classfile.dependency.DependencyHolder;

public abstract class AttributeInfo implements DependencyHolder {
	public enum AttributeContext { CLASS, FIELD, METHOD, CODE }
	
    private final String name;
    private AttributeContext context;

	public static AttributeInfo[] readAttributes(DataInputStream is, ConstantPool constantPool, AttributeContext context) throws IOException {
		AttributeInfo[] attributes = new AttributeInfo[is.readUnsignedShort()];
		for (int i = 0; i < attributes.length; i++) {
			String name = constantPool.getUtf8String(is.readUnsignedShort());
			switch (name) {
			case "ConstantValue":
				attributes[i] = new ConstantValueAttribute(name, is, constantPool);
				break;
			case "Code":
				attributes[i] = new CodeAttribute(name, is, constantPool);
				break;
			case "RuntimeVisibleAnnotations":
				attributes[i] = new RuntimeVisibleAnnotationsAttribute(name, is, constantPool);
				break;
			case "Signature":
				attributes[i] = new SignatureAttribute(name, is, constantPool);
				break;
			default:
				attributes[i] = new UnknownAttribute(name, is);
			}
			attributes[i].context = context;
		}
		return attributes;
	}

    public AttributeInfo(String name) {
		this.name = name;
	}

	public String getName() {
        return name;
    }
	
	protected final void checkAttributeLength(DataInputStream is, int expectedLength, String name) throws IOException {
		int len;
		if ((len = is.readInt()) != expectedLength) {
			throw new IOException("Unexpected length of " + len + " for attribute " + name);
		}
	}
	
	public void addDependentClassNames(Set<String> classNames) {
	}

	public AttributeContext getContext() {
		return context;
	}
}
