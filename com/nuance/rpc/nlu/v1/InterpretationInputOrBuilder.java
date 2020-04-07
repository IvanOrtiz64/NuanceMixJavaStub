// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: runtime.proto

package com.nuance.rpc.nlu.v1;

public interface InterpretationInputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nuance.nlu.v1.InterpretationInput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Text input.
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The text.
   */
  java.lang.String getText();
  /**
   * <pre>
   * Text input.
   * </pre>
   *
   * <code>string text = 1;</code>
   * @return The bytes for text.
   */
  com.google.protobuf.ByteString
      getTextBytes();

  /**
   * <pre>
   * Result from ASR as a Service.
   * </pre>
   *
   * <code>.google.protobuf.Any asr_result = 2;</code>
   * @return Whether the asrResult field is set.
   */
  boolean hasAsrResult();
  /**
   * <pre>
   * Result from ASR as a Service.
   * </pre>
   *
   * <code>.google.protobuf.Any asr_result = 2;</code>
   * @return The asrResult.
   */
  com.google.protobuf.Any getAsrResult();
  /**
   * <pre>
   * Result from ASR as a Service.
   * </pre>
   *
   * <code>.google.protobuf.Any asr_result = 2;</code>
   */
  com.google.protobuf.AnyOrBuilder getAsrResultOrBuilder();

  public com.nuance.rpc.nlu.v1.InterpretationInput.InputUnionCase getInputUnionCase();
}