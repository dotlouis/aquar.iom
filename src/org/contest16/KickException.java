/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.contest16;

public class KickException extends AINetException {
  private long swigCPtr;

  protected KickException(long cPtr, boolean cMemoryOwn) {
    super(jainl16JNI.KickException_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(KickException obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jainl16JNI.delete_KickException(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public KickException(String what) {
    this(jainl16JNI.new_KickException__SWIG_0(what), true);
  }

  public KickException() {
    this(jainl16JNI.new_KickException__SWIG_1(), true);
  }

  public String what() {
    return jainl16JNI.KickException_what(swigCPtr, this);
  }

}
