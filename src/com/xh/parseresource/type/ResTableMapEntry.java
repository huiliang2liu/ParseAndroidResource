package com.xh.parseresource.type;

import com.xh.parseresource.ParseResourceUtils;

public class ResTableMapEntry extends ResTableEntry {

	public ResTableRef parent;
	public int count;

	public ResTableMapEntry(ParseResourceUtils utils) {
		super(utils);
		parent = new ResTableRef();
	}

	@Override
	public int getSize() {
		return super.getSize() + parent.getSize() + 4;
	}

	@Override
	public String toString() {
		return super.toString() + ",parent:" + parent.toString() + ",count:"
				+ count;
	}

}
