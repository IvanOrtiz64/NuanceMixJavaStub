// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: interpretation-common.proto

package com.nuance.rpc.nlu.v1;

public interface TextRangeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nuance.nlu.v1.TextRange)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Inclusive, 0-based character position.
   * </pre>
   *
   * <code>uint32 start_index = 1;</code>
   * @return The startIndex.
   */
  int getStartIndex();

  /**
   * <pre>
   * Exclusive, 0-based character position.
   * </pre>
   *
   * <code>uint32 end_index = 2;</code>
   * @return The endIndex.
   */
  int getEndIndex();
}
