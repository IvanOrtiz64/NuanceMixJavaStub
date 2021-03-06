// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: single-intent-interpretation.proto

package com.nuance.rpc.nlu.v1;

public interface SingleIntentEntityOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nuance.nlu.v1.SingleIntentEntity)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Range of literal text for which this entity applies.
   * </pre>
   *
   * <code>.nuance.nlu.v1.TextRange text_range = 1;</code>
   * @return Whether the textRange field is set.
   */
  boolean hasTextRange();
  /**
   * <pre>
   * Range of literal text for which this entity applies.
   * </pre>
   *
   * <code>.nuance.nlu.v1.TextRange text_range = 1;</code>
   * @return The textRange.
   */
  com.nuance.rpc.nlu.v1.TextRange getTextRange();
  /**
   * <pre>
   * Range of literal text for which this entity applies.
   * </pre>
   *
   * <code>.nuance.nlu.v1.TextRange text_range = 1;</code>
   */
  com.nuance.rpc.nlu.v1.TextRangeOrBuilder getTextRangeOrBuilder();

  /**
   * <pre>
   * Confidence score between 0.0 and 1.0 inclusive. The higher the score, the likelier the entity detection is correct.
   * </pre>
   *
   * <code>float confidence = 3;</code>
   * @return The confidence.
   */
  float getConfidence();

  /**
   * <pre>
   * How the entity was detected.
   * </pre>
   *
   * <code>.nuance.nlu.v1.EnumOrigin origin = 4;</code>
   * @return The enum numeric value on the wire for origin.
   */
  int getOriginValue();
  /**
   * <pre>
   * How the entity was detected.
   * </pre>
   *
   * <code>.nuance.nlu.v1.EnumOrigin origin = 4;</code>
   * @return The origin.
   */
  com.nuance.rpc.nlu.v1.EnumOrigin getOrigin();

  /**
   * <pre>
   * For hierarchical entities, the child entities of the entity.
   * </pre>
   *
   * <code>map&lt;string, .nuance.nlu.v1.SingleIntentEntityList&gt; entities = 5;</code>
   */
  int getEntitiesCount();
  /**
   * <pre>
   * For hierarchical entities, the child entities of the entity.
   * </pre>
   *
   * <code>map&lt;string, .nuance.nlu.v1.SingleIntentEntityList&gt; entities = 5;</code>
   */
  boolean containsEntities(
      java.lang.String key);
  /**
   * Use {@link #getEntitiesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.nuance.rpc.nlu.v1.SingleIntentEntityList>
  getEntities();
  /**
   * <pre>
   * For hierarchical entities, the child entities of the entity.
   * </pre>
   *
   * <code>map&lt;string, .nuance.nlu.v1.SingleIntentEntityList&gt; entities = 5;</code>
   */
  java.util.Map<java.lang.String, com.nuance.rpc.nlu.v1.SingleIntentEntityList>
  getEntitiesMap();
  /**
   * <pre>
   * For hierarchical entities, the child entities of the entity.
   * </pre>
   *
   * <code>map&lt;string, .nuance.nlu.v1.SingleIntentEntityList&gt; entities = 5;</code>
   */

  com.nuance.rpc.nlu.v1.SingleIntentEntityList getEntitiesOrDefault(
      java.lang.String key,
      com.nuance.rpc.nlu.v1.SingleIntentEntityList defaultValue);
  /**
   * <pre>
   * For hierarchical entities, the child entities of the entity.
   * </pre>
   *
   * <code>map&lt;string, .nuance.nlu.v1.SingleIntentEntityList&gt; entities = 5;</code>
   */

  com.nuance.rpc.nlu.v1.SingleIntentEntityList getEntitiesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * The canonical value as a string.
   * </pre>
   *
   * <code>string string_value = 6;</code>
   * @return The stringValue.
   */
  java.lang.String getStringValue();
  /**
   * <pre>
   * The canonical value as a string.
   * </pre>
   *
   * <code>string string_value = 6;</code>
   * @return The bytes for stringValue.
   */
  com.google.protobuf.ByteString
      getStringValueBytes();

  /**
   * <pre>
   * The entity value as an object. This object may be directly converted to a JSON representation.
   * </pre>
   *
   * <code>.google.protobuf.Struct struct_value = 7;</code>
   * @return Whether the structValue field is set.
   */
  boolean hasStructValue();
  /**
   * <pre>
   * The entity value as an object. This object may be directly converted to a JSON representation.
   * </pre>
   *
   * <code>.google.protobuf.Struct struct_value = 7;</code>
   * @return The structValue.
   */
  com.google.protobuf.Struct getStructValue();
  /**
   * <pre>
   * The entity value as an object. This object may be directly converted to a JSON representation.
   * </pre>
   *
   * <code>.google.protobuf.Struct struct_value = 7;</code>
   */
  com.google.protobuf.StructOrBuilder getStructValueOrBuilder();

  /**
   * <pre>
   * The input literal associated with this entity.
   * </pre>
   *
   * <code>string literal = 8;</code>
   * @return The literal.
   */
  java.lang.String getLiteral();
  /**
   * <pre>
   * The input literal associated with this entity.
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

  public com.nuance.rpc.nlu.v1.SingleIntentEntity.ValueUnionCase getValueUnionCase();
}
