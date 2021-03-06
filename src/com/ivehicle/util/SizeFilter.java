/*
 * AnBox, and an Android Blackbox application for the have-not-so-much-money's
 * Copyright (C) 2010 Yoonsoo Kim, Heekuk Lee, Heejin Sohn
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.ivehicle.util;

import java.io.File;
import java.io.FilenameFilter;

public class SizeFilter implements FilenameFilter {

	public enum Operation {
		EQUAL,
		GREATER_THAN,
		LESS_THAN,
		GREATER_THAN_OR_EQUAL,
		LESS_THAN_OR_EQUAL,
		NOT_EQUAL;
	}

	private Operation op = Operation.EQUAL;
	private long sz = 0;

	public SizeFilter(Operation operation, long size) {
		this.op = operation;
		this.sz = size;
	}

	public boolean accept(File dir, String fn) {
		long fileSize = new File(dir, fn).length();
		switch (op) {
		case EQUAL:
			return (fileSize == sz);

		case GREATER_THAN:
			return (fileSize > sz);

		case LESS_THAN:
			return (fileSize < sz);

		case GREATER_THAN_OR_EQUAL:
			return (fileSize >= sz);

		case LESS_THAN_OR_EQUAL:
			return (fileSize < sz);

		case NOT_EQUAL:
			return (fileSize != sz);
		}

		return false;
	}

}
