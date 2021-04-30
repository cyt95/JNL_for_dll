public class JNI {
    static {
        System.loadLibrary("JNI");
    }

    private native int getNumber();
    private native void printHelloWorld();

    public static void main(String[] args){
        JNI jni = new JNI();


        jni.printHelloWorld(); //JNI로 호출 한 HelloWorld!

        System.out.println(jni.getNumber()); //JNI로 호출 한 숫자 메서드
    }
}
