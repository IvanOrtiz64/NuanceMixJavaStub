// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: runtime.proto

package com.nuance.rpc.nlu.v1;

public final class RuntimeProto {
  private RuntimeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nuance_nlu_v1_InterpretRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nuance_nlu_v1_InterpretRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nuance_nlu_v1_InterpretRequest_ClientDataEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nuance_nlu_v1_InterpretRequest_ClientDataEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nuance_nlu_v1_InterpretationParameters_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nuance_nlu_v1_InterpretationParameters_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nuance_nlu_v1_InterpretationParameters_PostProcessingScriptParametersEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nuance_nlu_v1_InterpretationParameters_PostProcessingScriptParametersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nuance_nlu_v1_InterpretationResource_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nuance_nlu_v1_InterpretationResource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nuance_nlu_v1_ResourceReference_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nuance_nlu_v1_ResourceReference_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nuance_nlu_v1_ResourceReference_HeadersEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nuance_nlu_v1_ResourceReference_HeadersEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nuance_nlu_v1_InterpretationInput_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nuance_nlu_v1_InterpretationInput_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nuance_nlu_v1_InterpretResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nuance_nlu_v1_InterpretResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nuance_nlu_v1_Status_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nuance_nlu_v1_Status_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rruntime.proto\022\rnuance.nlu.v1\032\032nuance/n" +
      "lu/v1/result.proto\032\031google/protobuf/any." +
      "proto\"\346\002\n\020InterpretRequest\022;\n\nparameters" +
      "\030\001 \001(\0132\'.nuance.nlu.v1.InterpretationPar" +
      "ameters\022/\n\005model\030\002 \001(\0132 .nuance.nlu.v1.R" +
      "esourceReference\0228\n\tresources\030\003 \003(\0132%.nu" +
      "ance.nlu.v1.InterpretationResource\022D\n\013cl" +
      "ient_data\030\004 \003(\0132/.nuance.nlu.v1.Interpre" +
      "tRequest.ClientDataEntry\0221\n\005input\030\n \001(\0132" +
      "\".nuance.nlu.v1.InterpretationInput\0321\n\017C" +
      "lientDataEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001" +
      "(\t:\0028\001\"\245\003\n\030InterpretationParameters\022O\n\032i" +
      "nterpretation_result_type\030\001 \001(\0162+.nuance" +
      ".nlu.v1.EnumInterpretationResultType\022\\\n!" +
      "interpretation_input_logging_mode\030\002 \001(\0162" +
      "1.nuance.nlu.v1.EnumInterpretationInputL" +
      "oggingMode\022v\n!post_processing_script_par" +
      "ameters\030\003 \003(\0132K.nuance.nlu.v1.Interpreta" +
      "tionParameters.PostProcessingScriptParam" +
      "etersEntry\022\033\n\023max_interpretations\030\014 \001(\r\032" +
      "E\n#PostProcessingScriptParametersEntry\022\013" +
      "\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"\204\001\n\026Inter" +
      "pretationResource\022>\n\022external_reference\030" +
      "\001 \001(\0132 .nuance.nlu.v1.ResourceReferenceH" +
      "\000\022\030\n\016inline_wordset\030\002 \001(\tH\000B\020\n\016resource_" +
      "union\"\333\001\n\021ResourceReference\022-\n\004type\030\001 \001(" +
      "\0162\037.nuance.nlu.v1.EnumResourceType\022\013\n\003ur" +
      "i\030\002 \001(\t\022\032\n\022request_timeout_ms\030\007 \001(\r\022>\n\007h" +
      "eaders\030\010 \003(\0132-.nuance.nlu.v1.ResourceRef" +
      "erence.HeadersEntry\032.\n\014HeadersEntry\022\013\n\003k" +
      "ey\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"`\n\023Interpret" +
      "ationInput\022\016\n\004text\030\001 \001(\tH\000\022*\n\nasr_result" +
      "\030\002 \001(\0132\024.google.protobuf.AnyH\000B\r\n\013input_" +
      "union\"j\n\021InterpretResponse\022%\n\006status\030\001 \001" +
      "(\0132\025.nuance.nlu.v1.Status\022.\n\006result\030\003 \001(" +
      "\0132\036.nuance.nlu.v1.InterpretResult\"8\n\006Sta" +
      "tus\022\014\n\004code\030\001 \001(\r\022\017\n\007message\030\002 \001(\t\022\017\n\007de" +
      "tails\030\003 \001(\t*R\n\034EnumInterpretationResultT" +
      "ype\022\r\n\tUNDEFINED\020\000\022\021\n\rSINGLE_INTENT\020\001\022\020\n" +
      "\014MULTI_INTENT\020\002*C\n\"EnumInterpretationInp" +
      "utLoggingMode\022\r\n\tPLAINTEXT\020\000\022\016\n\nSUPPRESS" +
      "ED\020\t*P\n\020EnumResourceType\022\033\n\027UNDEFINED_RE" +
      "SOURCE_TYPE\020\000\022\022\n\016SEMANTIC_MODEL\020\001\022\013\n\007WOR" +
      "DSET\020\0022Y\n\007Runtime\022N\n\tInterpret\022\037.nuance." +
      "nlu.v1.InterpretRequest\032 .nuance.nlu.v1." +
      "InterpretResponseB\'\n\025com.nuance.rpc.nlu." +
      "v1B\014RuntimeProtoP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.nuance.rpc.nlu.v1.ResultProto.getDescriptor(),
          com.google.protobuf.AnyProto.getDescriptor(),
        });
    internal_static_nuance_nlu_v1_InterpretRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_nuance_nlu_v1_InterpretRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nuance_nlu_v1_InterpretRequest_descriptor,
        new java.lang.String[] { "Parameters", "Model", "Resources", "ClientData", "Input", });
    internal_static_nuance_nlu_v1_InterpretRequest_ClientDataEntry_descriptor =
      internal_static_nuance_nlu_v1_InterpretRequest_descriptor.getNestedTypes().get(0);
    internal_static_nuance_nlu_v1_InterpretRequest_ClientDataEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nuance_nlu_v1_InterpretRequest_ClientDataEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_nuance_nlu_v1_InterpretationParameters_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_nuance_nlu_v1_InterpretationParameters_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nuance_nlu_v1_InterpretationParameters_descriptor,
        new java.lang.String[] { "InterpretationResultType", "InterpretationInputLoggingMode", "PostProcessingScriptParameters", "MaxInterpretations", });
    internal_static_nuance_nlu_v1_InterpretationParameters_PostProcessingScriptParametersEntry_descriptor =
      internal_static_nuance_nlu_v1_InterpretationParameters_descriptor.getNestedTypes().get(0);
    internal_static_nuance_nlu_v1_InterpretationParameters_PostProcessingScriptParametersEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nuance_nlu_v1_InterpretationParameters_PostProcessingScriptParametersEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_nuance_nlu_v1_InterpretationResource_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_nuance_nlu_v1_InterpretationResource_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nuance_nlu_v1_InterpretationResource_descriptor,
        new java.lang.String[] { "ExternalReference", "InlineWordset", "ResourceUnion", });
    internal_static_nuance_nlu_v1_ResourceReference_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_nuance_nlu_v1_ResourceReference_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nuance_nlu_v1_ResourceReference_descriptor,
        new java.lang.String[] { "Type", "Uri", "RequestTimeoutMs", "Headers", });
    internal_static_nuance_nlu_v1_ResourceReference_HeadersEntry_descriptor =
      internal_static_nuance_nlu_v1_ResourceReference_descriptor.getNestedTypes().get(0);
    internal_static_nuance_nlu_v1_ResourceReference_HeadersEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nuance_nlu_v1_ResourceReference_HeadersEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_nuance_nlu_v1_InterpretationInput_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_nuance_nlu_v1_InterpretationInput_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nuance_nlu_v1_InterpretationInput_descriptor,
        new java.lang.String[] { "Text", "AsrResult", "InputUnion", });
    internal_static_nuance_nlu_v1_InterpretResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_nuance_nlu_v1_InterpretResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nuance_nlu_v1_InterpretResponse_descriptor,
        new java.lang.String[] { "Status", "Result", });
    internal_static_nuance_nlu_v1_Status_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_nuance_nlu_v1_Status_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nuance_nlu_v1_Status_descriptor,
        new java.lang.String[] { "Code", "Message", "Details", });
    com.nuance.rpc.nlu.v1.ResultProto.getDescriptor();
    com.google.protobuf.AnyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
