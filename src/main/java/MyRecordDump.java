package models; //add this line
import java.util.*;
import org.objectweb.asm.*;
//import org.objectweb.asm.attrs.*; //Find and Replace to comment out this line


public class MyRecordDump implements Opcodes {

public static byte[] dump () throws Exception {

ClassWriter cw = new ClassWriter(0);
FieldVisitor fv;
MethodVisitor mv;
AnnotationVisitor av0;

//find: "models/MyRecord"  
//replace: debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass()
//find: "models/MyRecord$"  
//replace: debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass() + "$"

cw.visit(V1_5, ACC_PUBLIC + ACC_SUPER, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass(), null, "java/lang/Object", new String[] { "scala/ScalaObject", "scala/Product", "scala/Serializable" });

{
av0 = cw.visitAnnotation("Lscala/reflect/ScalaSignature;", true);
av0.visit("bytes", "\u0006\u0001\u0005Mb\u0001B\u0001\u0003\u0001\u0016\u0011\u0001\"T=SK\u000e|'\u000f\u001a\u0006\u0002\u0007\u00051Qn\u001c3fYN\u001c\u0001aE\u0003\u0001\r9!r\u0003\u0005\u0002\u0008\u00195\u0009\u0001B\u0003\u0002\n\u0015\u0005!A.\u00198h\u0015\u0005Y\u0011\u0001\u00026bm\u0006L!!\u0004\u0005\u0003\r=\u0013'.Z2u!\u0009y!#D\u0001\u0011\u0015\u0005\u0009\u0012!B:dC2\u000c\u0017BA\n\u0011\u0005-\u00196-\u00197b\u001f\nTWm\u0019;\u0011\u0005=)\u0012B\u0001\u000c\u0011\u0005\u001d\u0001&o\u001c3vGR\u0004\"a\u0004\r\n\u0005e\u0001\"\u0001D*fe&\u000cG.\u001b>bE2,\u0007\u0002C\u000e\u0001\u0005+\u0007I\u0011\u0001\u000f\u0002\u0003a,\u0012!\u0008\u0009\u0003=\u0005r!aD\u0010\n\u0005\u0001\u0002\u0012A\u0002)sK\u0012,g-\u0003\u0002#G\u000911\u000b\u001e:j]\u001eT!\u0001\u0009\u0009\u0009\u0011\u0015\u0002!\u0011#Q\u0001\nu\u0009!\u0001\u001f\u0011\u0009\u0011\u001d\u0002!Q3A\u0005\u0002!\n\u0011!_\u000b\u0002SA\u0011qBK\u0005\u0003WA\u00111!\u00138u\u0011!i\u0003A!E!\u0002\u0013I\u0013AA=!\u0011!y\u0003A!f\u0001\n\u0003\u0001\u0014!\u0001>\u0016\u0003E\u0002\"a\u0004\u001a\n\u0005M\u0002\"a\u0002\"p_2,\u0017M\u001c\u0005\u0009k\u0001\u0011\u0009\u0012)A\u0005c\u0005\u0011!\u0010\u0009\u0005\u0006o\u0001!\u0009\u0001O\u0001\u0007y%t\u0017\u000e\u001e \u0015\u0009eZD(\u0010\u0009\u0003u\u0001i\u0011A\u0001\u0005\u00067Y\u0002\r!\u0008\u0005\u0006OY\u0002\r!\u000b\u0005\u0006_Y\u0002\r!\r\u0005\u0008\u0001\u0009\u0009\u0011\"\u0001A\u0003\u0011\u0019w\u000e]=\u0015\u0009e\n%i\u0011\u0005\u00087y\u0002\n\u00111\u0001\u001e\u0011\u001d9c\u0008%AA\u0002%Bqa\u000c \u0011\u0002\u0003\u0007\u0011\u0007C\u0004F\u0001E\u0005I\u0011\u0001$\u0002\u001d\r|\u0007/\u001f\u0013eK\u001a\u000cW\u000f\u001c;%cU\u0009qI\u000b\u0002\u001e\u0011.\n\u0011\n\u0005\u0002K\u001f6\u00091J\u0003\u0002M\u001b\u0006IQO\\2iK\u000e\\W\r\u001a\u0006\u0003\u001dB\u0009!\"\u00198o_R\u000cG/[8o\u0013\u0009\u00016JA\u0009v]\u000eDWmY6fIZ\u000b'/[1oG\u0016DqA\u0015\u0001\u0012\u0002\u0013\u00051+\u0001\u0008d_BLH\u0005Z3gCVdG\u000f\n\u001a\u0016\u0003QS#!\u000b%\u0009\u000fY\u0003\u0011\u0013!C\u0001/\u0006q1m\u001c9zI\u0011,g-Y;mi\u0012\u001aT#\u0001-+\u0005EB\u0005\"\u0002.\u0001\u0009\u0003Z\u0016\u0001\u00035bg\"\u001cu\u000eZ3\u0015\u0003%BQ!\u0018\u0001\u0005By\u000b\u0001\u0002^8TiJLgn\u001a\u000b\u0002;!)\u0001\r\u0001C!C\u00061Q-];bYN$\"!\r2\u0009\u000f\r|\u0016\u0011!a\u0001I\u0006\u0019\u0001\u0010J\u0019\u0011\u0005=)\u0017B\u00014\u0011\u0005\r\u0009e.\u001f\u0005\u0006Q\u0002!\u0009%[\u0001\u000eaJ|G-^2u!J,g-\u001b=\u0016\u0003)\u0004\"aB6\n\u0005\u0009B\u0001\"B7\u0001\u0009\u0003B\u0013\u0001\u00049s_\u0012,8\r^!sSRL\u0008\"B8\u0001\u0009\u0003\u0002\u0018A\u00049s_\u0012,8\r^#mK6,g\u000e\u001e\u000b\u0003IFDqa\u00198\u0002\u0002\u0003\u0007\u0011\u0006C\u0003t\u0001\u0011\u0005C/\u0001\u0005dC:,\u0015/^1m)\u0009\u0009T\u000fC\u0004de\u0006\u0005\u0009\u0019\u00013\u0008\u000f]\u0014\u0011\u0011!E\u0003q\u0006AQ*\u001f*fG>\u0014H\r\u0005\u0002;s\u001a9\u0011AAA\u0001\u0012\u000bQ8\u0003B=|\u001d]\u0001b\u0001`@\u001eSEJT\"A?\u000b\u0005y\u0004\u0012a\u0002:v]RLW.Z\u0005\u0004\u0003\u0003i(!E!cgR\u0014\u0018m\u0019;Gk:\u001cG/[8og!1q'\u001fC\u0001\u0003\u000b!\u0012\u0001\u001f\u0005\u0007;f$)%!\u0003\u0015\u0003)D\u0011\"!\u0004z\u0003\u0003%\u0009)a\u0004\u0002\u000b\u0005\u0004\u0008\u000f\\=\u0015\u000fe\n\u0009\"a\u0005\u0002\u0016!11$a\u0003A\u0002uAaaJA\u0006\u0001\u0004I\u0003BB\u0018\u0002\u000c\u0001\u0007\u0011\u0007C\u0005\u0002\u001ae\u000c\u0009\u0011\"!\u0002\u001c\u00059QO\\1qa2LH\u0003BA\u000f\u0003S\u0001RaDA\u0010\u0003GI1!!\u0009\u0011\u0005\u0019y\u0005\u000f^5p]B1q\"!\n\u001eSEJ1!a\n\u0011\u0005\u0019!V\u000f\u001d7fg!9\u00111FA\u000c\u0001\u0004I\u0014a\u0001=%a!9\u0011qF=\u0005\u0012\u0005E\u0012a\u0003:fC\u0012\u0014Vm]8mm\u0016$\u0012A\u0002");
av0.visitEnd();
}
// ATTRIBUTE ScalaSig
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "x", "Ljava/lang/String;", null, null);
fv.visitEnd();
}
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "y", "I", null, null);
fv.visitEnd();
}
{
fv = cw.visitField(ACC_PRIVATE + ACC_FINAL, "z", "Z", null, null);
fv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "tupled", "()Lscala/Function1;", "()Lscala/Function1<Lscala/Tuple3<Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;>;Lmodels/MyRecord;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass() + "$", "MODULE$", "Lmodels/MyRecord$;");
mv.visitMethodInsn(INVOKEVIRTUAL, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass() + "$", "tupled", "()Lscala/Function1;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 0);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC + ACC_DEPRECATED, "curry", "()Lscala/Function1;", "()Lscala/Function1<Ljava/lang/String;Lscala/Function1<Ljava/lang/Object;Lscala/Function1<Ljava/lang/Object;Lmodels/MyRecord;>;>;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass() + "$", "MODULE$", "Lmodels/MyRecord$;");
mv.visitMethodInsn(INVOKEVIRTUAL, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass() + "$", "curry", "()Lscala/Function1;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 0);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_FINAL + ACC_STATIC, "curried", "()Lscala/Function1;", "()Lscala/Function1<Ljava/lang/String;Lscala/Function1<Ljava/lang/Object;Lscala/Function1<Ljava/lang/Object;Lmodels/MyRecord;>;>;>;", null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass() + "$", "MODULE$", "Lmodels/MyRecord$;");
mv.visitMethodInsn(INVOKEVIRTUAL, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass() + "$", "curried", "()Lscala/Function1;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 0);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_BRIDGE, "productIterator", "()Lscala/collection/Iterator;", "()Lscala/collection/Iterator<Ljava/lang/Object;>;", null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "scala/Product$class", "productIterator", "(Lscala/Product;)Lscala/collection/Iterator;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC + ACC_BRIDGE + ACC_DEPRECATED, "productElements", "()Lscala/collection/Iterator;", "()Lscala/collection/Iterator<Ljava/lang/Object;>;", null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "scala/Product$class", "productElements", "(Lscala/Product;)Lscala/collection/Iterator;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "x", "()Ljava/lang/String;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass(), "x", "Ljava/lang/String;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "y", "()I", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass(), "y", "I");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "z", "()Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitFieldInsn(GETFIELD, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass(), "z", "Z");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy", "(Ljava/lang/String;IZ)Lmodels/MyRecord;", null, null);
mv.visitCode();
mv.visitTypeInsn(NEW, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass());
mv.visitInsn(DUP);
mv.visitVarInsn(ALOAD, 1);
mv.visitVarInsn(ILOAD, 2);
mv.visitVarInsn(ILOAD, 3);
mv.visitMethodInsn(INVOKESPECIAL, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass(), "<init>", "(Ljava/lang/String;IZ)V");
mv.visitInsn(ARETURN);
mv.visitMaxs(5, 4);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$3", "()Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass(), "z", "()Z");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$2", "()I", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass(), "y", "()I");
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "copy$default$1", "()Ljava/lang/String;", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass(), "x", "()Ljava/lang/String;");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "hashCode", "()I", null, null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "scala/runtime/ScalaRunTime$", "MODULE$", "Lscala/runtime/ScalaRunTime$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "scala/runtime/ScalaRunTime$", "_hashCode", "(Lscala/Product;)I");
mv.visitInsn(IRETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "toString", "()Ljava/lang/String;", null, null);
mv.visitCode();
mv.visitFieldInsn(GETSTATIC, "scala/runtime/ScalaRunTime$", "MODULE$", "Lscala/runtime/ScalaRunTime$;");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, "scala/runtime/ScalaRunTime$", "_toString", "(Lscala/Product;)Ljava/lang/String;");
mv.visitInsn(ARETURN);
mv.visitMaxs(2, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "equals", "(Ljava/lang/Object;)Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 1);
Label l0 = new Label();
mv.visitJumpInsn(IF_ACMPEQ, l0);
mv.visitVarInsn(ALOAD, 1);
mv.visitVarInsn(ASTORE, 2);
mv.visitVarInsn(ALOAD, 2);
mv.visitTypeInsn(INSTANCEOF, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass());
Label l1 = new Label();
mv.visitJumpInsn(IFEQ, l1);
mv.visitVarInsn(ALOAD, 2);
mv.visitTypeInsn(CHECKCAST, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass());
mv.visitVarInsn(ASTORE, 3);
mv.visitVarInsn(ALOAD, 3);
mv.visitMethodInsn(INVOKEVIRTUAL, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass(), "x", "()Ljava/lang/String;");
mv.visitVarInsn(ASTORE, 4);
mv.visitVarInsn(ALOAD, 3);
mv.visitMethodInsn(INVOKEVIRTUAL, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass(), "y", "()I");
mv.visitVarInsn(ISTORE, 5);
mv.visitVarInsn(ALOAD, 3);
mv.visitMethodInsn(INVOKEVIRTUAL, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass(), "z", "()Z");
mv.visitVarInsn(ISTORE, 6);
mv.visitVarInsn(ALOAD, 4);
mv.visitVarInsn(ASTORE, 7);
mv.visitVarInsn(ILOAD, 5);
mv.visitVarInsn(ISTORE, 8);
mv.visitVarInsn(ILOAD, 6);
mv.visitVarInsn(ISTORE, 9);
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 7);
mv.visitVarInsn(ILOAD, 8);
mv.visitVarInsn(ILOAD, 9);
mv.visitMethodInsn(INVOKESPECIAL, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass(), "gd1$1", "(Ljava/lang/String;IZ)Z");
Label l2 = new Label();
mv.visitJumpInsn(IFEQ, l2);
mv.visitVarInsn(ALOAD, 1);
mv.visitTypeInsn(CHECKCAST, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass());
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEINTERFACE, "scala/Equals", "canEqual", "(Ljava/lang/Object;)Z");
Label l3 = new Label();
mv.visitJumpInsn(GOTO, l3);
mv.visitLabel(l2);
mv.visitInsn(ICONST_0);
mv.visitJumpInsn(GOTO, l3);
mv.visitLabel(l1);
mv.visitInsn(ICONST_0);
mv.visitLabel(l3);
Label l4 = new Label();
mv.visitJumpInsn(IFEQ, l4);
mv.visitLabel(l0);
mv.visitInsn(ICONST_1);
Label l5 = new Label();
mv.visitJumpInsn(GOTO, l5);
mv.visitLabel(l4);
mv.visitInsn(ICONST_0);
mv.visitLabel(l5);
mv.visitInsn(IRETURN);
mv.visitMaxs(4, 10);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "productPrefix", "()Ljava/lang/String;", null, null);
mv.visitCode();
mv.visitLdcInsn("MyRecord");
mv.visitInsn(ARETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "productArity", "()I", null, null);
mv.visitCode();
mv.visitInsn(ICONST_3);
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 1);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "productElement", "(I)Ljava/lang/Object;", null, null);
mv.visitCode();
mv.visitVarInsn(ILOAD, 1);
mv.visitVarInsn(ISTORE, 2);
mv.visitVarInsn(ILOAD, 2);
Label l0 = new Label();
Label l1 = new Label();
Label l2 = new Label();
Label l3 = new Label();
mv.visitTableSwitchInsn(0, 2, l3, new Label[] { l0, l1, l2 });
mv.visitLabel(l3);
mv.visitTypeInsn(NEW, "java/lang/IndexOutOfBoundsException");
mv.visitInsn(DUP);
mv.visitVarInsn(ILOAD, 1);
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToInteger", "(I)Ljava/lang/Integer;");
mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "toString", "()Ljava/lang/String;");
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/IndexOutOfBoundsException", "<init>", "(Ljava/lang/String;)V");
mv.visitInsn(ATHROW);
mv.visitLabel(l0);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass(), "x", "()Ljava/lang/String;");
Label l4 = new Label();
mv.visitJumpInsn(GOTO, l4);
mv.visitLabel(l2);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass(), "z", "()Z");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToBoolean", "(Z)Ljava/lang/Boolean;");
mv.visitJumpInsn(GOTO, l4);
mv.visitLabel(l1);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass(), "y", "()I");
mv.visitMethodInsn(INVOKESTATIC, "scala/runtime/BoxesRunTime", "boxToInteger", "(I)Ljava/lang/Integer;");
mv.visitLabel(l4);
mv.visitInsn(ARETURN);
mv.visitMaxs(3, 3);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "canEqual", "(Ljava/lang/Object;)Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 1);
mv.visitTypeInsn(INSTANCEOF, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass());
mv.visitInsn(IRETURN);
mv.visitMaxs(1, 2);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PRIVATE + ACC_FINAL, "gd1$1", "(Ljava/lang/String;IZ)Z", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 1);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass(), "x", "()Ljava/lang/String;");
mv.visitVarInsn(ASTORE, 4);
mv.visitInsn(DUP);
Label l0 = new Label();
mv.visitJumpInsn(IFNONNULL, l0);
mv.visitInsn(POP);
mv.visitVarInsn(ALOAD, 4);
Label l1 = new Label();
mv.visitJumpInsn(IFNULL, l1);
Label l2 = new Label();
mv.visitJumpInsn(GOTO, l2);
mv.visitLabel(l0);
mv.visitVarInsn(ALOAD, 4);
mv.visitMethodInsn(INVOKEVIRTUAL, "java/lang/Object", "equals", "(Ljava/lang/Object;)Z");
mv.visitJumpInsn(IFEQ, l2);
mv.visitLabel(l1);
mv.visitVarInsn(ILOAD, 2);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass(), "y", "()I");
mv.visitJumpInsn(IF_ICMPNE, l2);
mv.visitVarInsn(ILOAD, 3);
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKEVIRTUAL, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass(), "z", "()Z");
mv.visitJumpInsn(IF_ICMPNE, l2);
mv.visitInsn(ICONST_1);
Label l3 = new Label();
mv.visitJumpInsn(GOTO, l3);
mv.visitLabel(l2);
mv.visitInsn(ICONST_0);
mv.visitLabel(l3);
mv.visitInsn(IRETURN);
mv.visitMaxs(2, 5);
mv.visitEnd();
}
{
mv = cw.visitMethod(ACC_PUBLIC, "<init>", "(Ljava/lang/String;IZ)V", null, null);
mv.visitCode();
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ALOAD, 1);
mv.visitFieldInsn(PUTFIELD, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass(), "x", "Ljava/lang/String;");
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ILOAD, 2);
mv.visitFieldInsn(PUTFIELD, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass(), "y", "I");
mv.visitVarInsn(ALOAD, 0);
mv.visitVarInsn(ILOAD, 3);
mv.visitFieldInsn(PUTFIELD, debug.Main$.MODULE$.namespace() + "/" + debug.Main$.MODULE$.caseclass(), "z", "Z");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESPECIAL, "java/lang/Object", "<init>", "()V");
mv.visitVarInsn(ALOAD, 0);
mv.visitMethodInsn(INVOKESTATIC, "scala/Product$class", "$init$", "(Lscala/Product;)V");
mv.visitInsn(RETURN);
mv.visitMaxs(2, 4);
mv.visitEnd();
}
cw.visitEnd();

return cw.toByteArray();
}
}