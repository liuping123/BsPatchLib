package com.liuping123.bspatchlib;

import android.os.Environment;

import java.io.File;

/**
 * 类说明：  	常量类
 */
public class Constants {

	public static final boolean DEBUG = true;

	public static final String PACKAGE_NAME = "com.liuping123.bspatchlib";

	public static final String PATH = Environment.getExternalStorageDirectory() + File.separator + "xdb" + File.separator;

	//合成得到的新版apk
	public static final String NEW_APK_PATH = PATH + "new.apk";

	//从服务器下载来的差分包
	public static final String PATCH_PATH = PATH + "patch.apk";
}