// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: multi-intent-interpretation.proto

package com.nuance.rpc.nlu.v1;

public final class MultiIntentInterpretationProto {
  private MultiIntentInterpretationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nuance_nlu_v1_MultiIntentInterpretation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nuance_nlu_v1_MultiIntentInterpretation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nuance_nlu_v1_InterpretationNode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nuance_nlu_v1_InterpretationNode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nuance_nlu_v1_OperatorNode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nuance_nlu_v1_OperatorNode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nuance_nlu_v1_IntentNode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nuance_nlu_v1_IntentNode_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nuance_nlu_v1_EntityNode_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nuance_nlu_v1_EntityNode_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!multi-intent-interpretation.proto\022\rnua" +
      "nce.nlu.v1\032)nuance/nlu/v1/interpretation" +
      "-common.proto\032\034google/protobuf/struct.pr" +
      "oto\"L\n\031MultiIntentInterpretation\022/\n\004root" +
      "\030\001 \001(\0132!.nuance.nlu.v1.InterpretationNod" +
      "e\"\274\001\n\022InterpretationNode\022/\n\010operator\030\001 \001" +
      "(\0132\033.nuance.nlu.v1.OperatorNodeH\000\022+\n\006int" +
      "ent\030\002 \001(\0132\031.nuance.nlu.v1.IntentNodeH\000\022+" +
      "\n\006entity\030\003 \001(\0132\031.nuance.nlu.v1.EntityNod" +
      "eH\000B\033\n\031interpretation_node_union\"\341\001\n\014Ope" +
      "ratorNode\022-\n\010operator\030\001 \001(\0162\033.nuance.nlu" +
      ".v1.EnumOperator\022,\n\ntext_range\030\002 \001(\0132\030.n" +
      "uance.nlu.v1.TextRange\0223\n\010children\030\005 \003(\013" +
      "2!.nuance.nlu.v1.InterpretationNode\022\017\n\007l" +
      "iteral\030\010 \001(\t\022.\n\013audio_range\030\017 \001(\0132\031.nuan" +
      "ce.nlu.v1.AudioRange\"\375\001\n\nIntentNode\022\014\n\004n" +
      "ame\030\001 \001(\t\022,\n\ntext_range\030\002 \001(\0132\030.nuance.n" +
      "lu.v1.TextRange\022\022\n\nconfidence\030\003 \001(\002\022)\n\006o" +
      "rigin\030\004 \001(\0162\031.nuance.nlu.v1.EnumOrigin\0223" +
      "\n\010children\030\005 \003(\0132!.nuance.nlu.v1.Interpr" +
      "etationNode\022\017\n\007literal\030\010 \001(\t\022.\n\013audio_ra" +
      "nge\030\017 \001(\0132\031.nuance.nlu.v1.AudioRange\"\325\002\n" +
      "\nEntityNode\022\014\n\004name\030\001 \001(\t\022,\n\ntext_range\030" +
      "\002 \001(\0132\030.nuance.nlu.v1.TextRange\022\022\n\nconfi" +
      "dence\030\003 \001(\002\022)\n\006origin\030\004 \001(\0162\031.nuance.nlu" +
      ".v1.EnumOrigin\0223\n\010children\030\005 \003(\0132!.nuanc" +
      "e.nlu.v1.InterpretationNode\022\026\n\014string_va" +
      "lue\030\006 \001(\tH\000\022/\n\014struct_value\030\007 \001(\0132\027.goog" +
      "le.protobuf.StructH\000\022\017\n\007literal\030\010 \001(\t\022.\n" +
      "\013audio_range\030\017 \001(\0132\031.nuance.nlu.v1.Audio" +
      "RangeB\r\n\013value_union*(\n\014EnumOperator\022\007\n\003" +
      "AND\020\000\022\006\n\002OR\020\001\022\007\n\003NOT\020\002B9\n\025com.nuance.rpc" +
      ".nlu.v1B\036MultiIntentInterpretationProtoP" +
      "\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.nuance.rpc.nlu.v1.InterpretationCommonProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        });
    internal_static_nuance_nlu_v1_MultiIntentInterpretation_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_nuance_nlu_v1_MultiIntentInterpretation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nuance_nlu_v1_MultiIntentInterpretation_descriptor,
        new java.lang.String[] { "Root", });
    internal_static_nuance_nlu_v1_InterpretationNode_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_nuance_nlu_v1_InterpretationNode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nuance_nlu_v1_InterpretationNode_descriptor,
        new java.lang.String[] { "Operator", "Intent", "Entity", "InterpretationNodeUnion", });
    internal_static_nuance_nlu_v1_OperatorNode_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_nuance_nlu_v1_OperatorNode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nuance_nlu_v1_OperatorNode_descriptor,
        new java.lang.String[] { "Operator", "TextRange", "Children", "Literal", "AudioRange", });
    internal_static_nuance_nlu_v1_IntentNode_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_nuance_nlu_v1_IntentNode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nuance_nlu_v1_IntentNode_descriptor,
        new java.lang.String[] { "Name", "TextRange", "Confidence", "Origin", "Children", "Literal", "AudioRange", });
    internal_static_nuance_nlu_v1_EntityNode_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_nuance_nlu_v1_EntityNode_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nuance_nlu_v1_EntityNode_descriptor,
        new java.lang.String[] { "Name", "TextRange", "Confidence", "Origin", "Children", "StringValue", "StructValue", "Literal", "AudioRange", "ValueUnion", });
    com.nuance.rpc.nlu.v1.InterpretationCommonProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}