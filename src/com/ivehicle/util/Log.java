package com.ivehicle.util;

import com.ivehicle.util.LogConfig;

public class Log {
	public static void e(String tag, String msg) {
		android.util.Log.e(tag, msg);
	}

	public static void e(String tag, String msg, Throwable tr) {
		android.util.Log.e(tag, msg, tr);
	}

	public static void w(String tag, String msg) {
		android.util.Log.w(tag, msg);
	}

	public static void w(String tag, String msg, Throwable tr) {
		android.util.Log.w(tag, msg, tr);
	}

	public static void i(String tag, String msg) {
		android.util.Log.i(tag, msg);
	}

	public static void i(String tag, String msg, Throwable tr) {
		android.util.Log.i(tag, msg, tr);
	}

	public static void d(String tag, String msg) {
		if (LogConfig.DEBUG)
			android.util.Log.d(tag, msg);
	}

	public static void d(String tag, String msg, Throwable tr) {
		if (LogConfig.DEBUG)
			android.util.Log.d(tag, msg, tr);
	}

	public static void v(String tag, String msg) {
		if (LogConfig.DEBUG)
			android.util.Log.v(tag, msg);
	}

	public static void v(String tag, String msg, Throwable tr) {
		if (LogConfig.DEBUG)
			android.util.Log.v(tag, msg, tr);
	}
}
