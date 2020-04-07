// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: single-intent-interpretation.proto

package com.nuance.rpc.nlu.v1;

public interface SingleIntentEntityListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nuance.nlu.v1.SingleIntentEntityList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Repeated. An entity match for the intent, for single-intent interpretation.
   * </pre>
   *
   * <code>repeated .nuance.nlu.v1.SingleIntentEntity entities = 1;</code>
   */
  java.util.List<com.nuance.rpc.nlu.v1.SingleIntentEntity> 
      getEntitiesList();
  /**
   * <pre>
   * Repeated. An entity match for the intent, for single-intent interpretation.
   * </pre>
   *
   * <code>repeated .nuance.nlu.v1.SingleIntentEntity entities = 1;</code>
   */
  com.nuance.rpc.nlu.v1.SingleIntentEntity getEntities(int index);
  /**
   * <pre>
   * Repeated. An entity match for the intent, for single-intent interpretation.
   * </pre>
   *
   * <code>repeated .nuance.nlu.v1.SingleIntentEntity entities = 1;</code>
   */
  int getEntitiesCount();
  /**
   * <pre>
   * Repeated. An entity match for the intent, for single-intent interpretation.
   * </pre>
   *
   * <code>repeated .nuance.nlu.v1.SingleIntentEntity entities = 1;</code>
   */
  java.util.List<? extends com.nuance.rpc.nlu.v1.SingleIntentEntityOrBuilder> 
      getEntitiesOrBuilderList();
  /**
   * <pre>
   * Repeated. An entity match for the intent, for single-intent interpretation.
   * </pre>
   *
   * <code>repeated .nuance.nlu.v1.SingleIntentEntity entities = 1;</code>
   */
  com.nuance.rpc.nlu.v1.SingleIntentEntityOrBuilder getEntitiesOrBuilder(
      int index);
}