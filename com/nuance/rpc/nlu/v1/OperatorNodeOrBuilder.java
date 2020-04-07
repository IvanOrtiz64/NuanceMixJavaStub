// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: multi-intent-interpretation.proto

package com.nuance.rpc.nlu.v1;

public interface OperatorNodeOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nuance.nlu.v1.OperatorNode)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Type of operator.
   * </pre>
   *
   * <code>.nuance.nlu.v1.EnumOperator operator = 1;</code>
   * @return The enum numeric value on the wire for operator.
   */
  int getOperatorValue();
  /**
   * <pre>
   * Type of operator.
   * </pre>
   *
   * <code>.nuance.nlu.v1.EnumOperator operator = 1;</code>
   * @return The operator.
   */
  com.nuance.rpc.nlu.v1.EnumOperator getOperator();

  /**
   * <pre>
   * Range of the literal text this operator applies to.
   * </pre>
   *
   * <code>.nuance.nlu.v1.TextRange text_range = 2;</code>
   * @return Whether the textRange field is set.
   */
  boolean hasTextRange();
  /**
   * <pre>
   * Range of the literal text this operator applies to.
   * </pre>
   *
   * <code>.nuance.nlu.v1.TextRange text_range = 2;</code>
   * @return The textRange.
   */
  com.nuance.rpc.nlu.v1.TextRange getTextRange();
  /**
   * <pre>
   * Range of the literal text this operator applies to.
   * </pre>
   *
   * <code>.nuance.nlu.v1.TextRange text_range = 2;</code>
   */
  com.nuance.rpc.nlu.v1.TextRangeOrBuilder getTextRangeOrBuilder();

  /**
   * <pre>
   * Repeated. Child nodes for this operator. An operator node always has children.
   * </pre>
   *
   * <code>repeated .nuance.nlu.v1.InterpretationNode children = 5;</code>
   */
  java.util.List<com.nuance.rpc.nlu.v1.InterpretationNode> 
      getChildrenList();
  /**
   * <pre>
   * Repeated. Child nodes for this operator. An operator node always has children.
   * </pre>
   *
   * <code>repeated .nuance.nlu.v1.InterpretationNode children = 5;</code>
   */
  com.nuance.rpc.nlu.v1.InterpretationNode getChildren(int index);
  /**
   * <pre>
   * Repeated. Child nodes for this operator. An operator node always has children.
   * </pre>
   *
   * <code>repeated .nuance.nlu.v1.InterpretationNode children = 5;</code>
   */
  int getChildrenCount();
  /**
   * <pre>
   * Repeated. Child nodes for this operator. An operator node always has children.
   * </pre>
   *
   * <code>repeated .nuance.nlu.v1.InterpretationNode children = 5;</code>
   */
  java.util.List<? extends com.nuance.rpc.nlu.v1.InterpretationNodeOrBuilder> 
      getChildrenOrBuilderList();
  /**
   * <pre>
   * Repeated. Child nodes for this operator. An operator node always has children.
   * </pre>
   *
   * <code>repeated .nuance.nlu.v1.InterpretationNode children = 5;</code>
   */
  com.nuance.rpc.nlu.v1.InterpretationNodeOrBuilder getChildrenOrBuilder(
      int index);

  /**
   * <pre>
   * The input literal associated with this operator.
   * </pre>
   *
   * <code>string literal = 8;</code>
   * @return The literal.
   */
  java.lang.String getLiteral();
  /**
   * <pre>
   * The input literal associated with this operator.
   * </pre>
   *
   * <code>string literal = 8;</code>
   * @return The bytes for literal.
   */
  com.google.protobuf.ByteString
      getLiteralBytes();

  /**
   * <pre>
   * Range of audio input this operator applies to. Available only when interpreting a recognition result from ASR as a Service.
   * </pre>
   *
   * <code>.nuance.nlu.v1.AudioRange audio_range = 15;</code>
   * @return Whether the audioRange field is set.
   */
  boolean hasAudioRange();
  /**
   * <pre>
   * Range of audio input this operator applies to. Available only when interpreting a recognition result from ASR as a Service.
   * </pre>
   *
   * <code>.nuance.nlu.v1.AudioRange audio_range = 15;</code>
   * @return The audioRange.
   */
  com.nuance.rpc.nlu.v1.AudioRange getAudioRange();
  /**
   * <pre>
   * Range of audio input this operator applies to. Available only when interpreting a recognition result from ASR as a Service.
   * </pre>
   *
   * <code>.nuance.nlu.v1.AudioRange audio_range = 15;</code>
   */
  com.nuance.rpc.nlu.v1.AudioRangeOrBuilder getAudioRangeOrBuilder();
}
