// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: interpretation-common.proto

package com.nuance.rpc.nlu.v1;

public final class InterpretationCommonProto {
  private InterpretationCommonProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nuance_nlu_v1_TextRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nuance_nlu_v1_TextRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nuance_nlu_v1_AudioRange_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nuance_nlu_v1_AudioRange_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\033interpretation-common.proto\022\rnuance.nl" +
      "u.v1\"3\n\tTextRange\022\023\n\013start_index\030\001 \001(\r\022\021" +
      "\n\tend_index\030\002 \001(\r\"8\n\nAudioRange\022\025\n\rstart" +
      "_time_ms\030\001 \001(\r\022\023\n\013end_time_ms\030\002 \001(\r*7\n\nE" +
      "numOrigin\022\013\n\007UNKNOWN\020\000\022\013\n\007GRAMMAR\020\001\022\017\n\013S" +
      "TATISTICAL\020\002B4\n\025com.nuance.rpc.nlu.v1B\031I" +
      "nterpretationCommonProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_nuance_nlu_v1_TextRange_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_nuance_nlu_v1_TextRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nuance_nlu_v1_TextRange_descriptor,
        new java.lang.String[] { "StartIndex", "EndIndex", });
    internal_static_nuance_nlu_v1_AudioRange_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_nuance_nlu_v1_AudioRange_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nuance_nlu_v1_AudioRange_descriptor,
        new java.lang.String[] { "StartTimeMs", "EndTimeMs", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
