package de.spricom.dessert.classfile.constpool;

import java.util.Set;

class ConstantMethodref extends ConstantPoolEntry {
	public static final int TAG = 10;
	private final int classIndex;
	private final int nameAndTypeIndex;

	public ConstantMethodref(int classIndex, int nameAndTypeIndex) {
		this.classIndex = classIndex;
		this.nameAndTypeIndex = nameAndTypeIndex;
	}

	@Override
	public String dump() {
		return "methodref: " + getConstantPoolEntry(classIndex).dump() + ", "
				+ getConstantPoolEntry(nameAndTypeIndex).dump();
	}

	public int getClassIndex() {
		return classIndex;
	}

	public int getNameAndTypeIndex() {
		return nameAndTypeIndex;
	}
	
	@Override
	public void addDependentClassNames(Set<String> classNames) {
		ConstantNameAndType nameAndType = (ConstantNameAndType) getConstantPoolEntry(nameAndTypeIndex);
		ConstantUtf8 descriptor = (ConstantUtf8) getConstantPoolEntry(nameAndType.getDescriptorIndex());
		new MethodType(descriptor.getValue()).addDependentClassNames(classNames);
	}

}