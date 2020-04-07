// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: runtime.proto

package com.nuance.rpc.nlu.v1;

public interface InterpretResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nuance.nlu.v1.InterpretResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Whether the request was successful. The 200 code means success, other values indicate an error.
   * </pre>
   *
   * <code>.nuance.nlu.v1.Status status = 1;</code>
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   * <pre>
   * Whether the request was successful. The 200 code means success, other values indicate an error.
   * </pre>
   *
   * <code>.nuance.nlu.v1.Status status = 1;</code>
   * @return The status.
   */
  com.nuance.rpc.nlu.v1.Status getStatus();
  /**
   * <pre>
   * Whether the request was successful. The 200 code means success, other values indicate an error.
   * </pre>
   *
   * <code>.nuance.nlu.v1.Status status = 1;</code>
   */
  com.nuance.rpc.nlu.v1.StatusOrBuilder getStatusOrBuilder();

  /**
   * <pre>
   * The result of the interpretation.
   * </pre>
   *
   * <code>.nuance.nlu.v1.InterpretResult result = 3;</code>
   * @return Whether the result field is set.
   */
  boolean hasResult();
  /**
   * <pre>
   * The result of the interpretation.
   * </pre>
   *
   * <code>.nuance.nlu.v1.InterpretResult result = 3;</code>
   * @return The result.
   */
  com.nuance.rpc.nlu.v1.InterpretResult getResult();
  /**
   * <pre>
   * The result of the interpretation.
   * </pre>
   *
   * <code>.nuance.nlu.v1.InterpretResult result = 3;</code>
   */
  com.nuance.rpc.nlu.v1.InterpretResultOrBuilder getResultOrBuilder();
}
