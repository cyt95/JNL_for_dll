#include "pch.h"
#include "JNI.h"
JNIEXPORT jint JNICALL Java_JNI_getNumber(JNIEnv *env, jobject jobj) {
	return 2020;
}

JNIEXPORT void JNICALL Java_JNI_printHelloWorld(JNIEnv *env, jobject jobj) {
	printf("Hello, My Name is Joshua.");
}