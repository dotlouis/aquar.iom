/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.contest16;

public class Virus {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected Virus(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Virus obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jainl16JNI.delete_Virus(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setId(int value) {
    jainl16JNI.Virus_id_set(swigCPtr, this, value);
  }

  public int getId() {
    return jainl16JNI.Virus_id_get(swigCPtr, this);
  }

  public void setPosition(Position value) {
    jainl16JNI.Virus_position_set(swigCPtr, this, Position.getCPtr(value), value);
  }

  public Position getPosition() {
    long cPtr = jainl16JNI.Virus_position_get(swigCPtr, this);
    return (cPtr == 0) ? null : new Position(cPtr, false);
  }

  public Virus() {
    this(jainl16JNI.new_Virus(), true);
  }

}
