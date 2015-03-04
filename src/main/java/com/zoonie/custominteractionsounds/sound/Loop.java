package com.zoonie.custominteractionsounds.sound;

import com.zoonie.custominteractionsounds.compat.BlockPos;

public class Loop
{
	public String identifier;
	public double length;
	public double timeToEnd;
	public BlockPos pos;

	public Loop(String identifier, double length, double timeToEnd, BlockPos pos)
	{
		this.identifier = identifier;
		this.length = length;
		this.timeToEnd = timeToEnd;
		this.pos = pos;
	}

}
