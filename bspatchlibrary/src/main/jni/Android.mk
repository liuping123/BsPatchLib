LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE     := bspatch
LOCAL_SRC_FILES  := ./util/com_github_liuping123_bspatchlib_util_PatchUtils.c

LOCAL_LDLIBS     := -lz -llog

include $(BUILD_SHARED_LIBRARY)
