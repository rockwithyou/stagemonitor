package org.stagemonitor.core.instrument;

import java.security.ProtectionDomain;

import javassist.CtClass;

public abstract class StagemonitorJavassistInstrumenter {

	public void transformIncludedClass(CtClass ctClass) throws Exception {
	}

	public byte[] transformOtherClass(ClassLoader loader,
							   String className,
							   Class<?> classBeingRedefined,
							   ProtectionDomain protectionDomain,
							   byte[] classfileBuffer)
			throws Exception {
		return classfileBuffer;
	}
}