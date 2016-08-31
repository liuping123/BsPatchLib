package com.liuping123.bspatchlib;

import android.app.Activity;
import android.os.Bundle;

import com.github.liuping123.bspatch.util.PatchUtils;
import com.ping.bspatch.util.ApkUtils;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String oldApkSource = ApkUtils.getSourceApkPath(this, Constants.PACKAGE_NAME);
        int patchResult = PatchUtils.patch(oldApkSource, Constants.NEW_APK_PATH, Constants.PATCH_PATH);
        if (patchResult == 0) {
//            filePatch.delete();
            ApkUtils.installApk(MainActivity.this, Constants.NEW_APK_PATH);
        }

//        File fileNew = new File(Constants.NEW_APK_PATH);
//        if (fileNew.exists()) {
//            fileNew.delete();
//        }
//        File filePatch = new File(Constants.PATCH_PATH);
//        if (filePatch.exists()) {
//            PackageInfo packageInfo = ApkUtils.getInstalledApkPackageInfo(this, Constants.PACKAGE_NAME);
//            if (packageInfo != null) {
//                String oldApkSource = ApkUtils.getSourceApkPath(this, Constants.PACKAGE_NAME);
//                if (!TextUtils.isEmpty(oldApkSource)) {
//                    int patchResult = PatchUtils.patch(oldApkSource, Constants.NEW_APK_PATH, Constants.PATCH_PATH);
//                    if (patchResult == 0) {
//                        filePatch.delete();
//                        ApkUtils.installApk(MainActivity.this, Constants.NEW_APK_PATH);
//                    }
//                }
//            }
//        }
    }
}
