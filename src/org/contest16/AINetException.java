/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.contest16;

public class AINetException extends java.lang.Exception {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected AINetException(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AINetException obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jainl16JNI.delete_AINetException(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public String getMessage() {
    return what();
  }

  public AINetException(String what) {
    this(jainl16JNI.new_AINetException(what), true);
  }

  public String what() {
    return jainl16JNI.AINetException_what(swigCPtr, this);
  }

}