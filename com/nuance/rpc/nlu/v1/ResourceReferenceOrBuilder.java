// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: runtime.proto

package com.nuance.rpc.nlu.v1;

public interface ResourceReferenceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:nuance.nlu.v1.ResourceReference)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Resource type.
   * </pre>
   *
   * <code>.nuance.nlu.v1.EnumResourceType type = 1;</code>
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   * <pre>
   * Resource type.
   * </pre>
   *
   * <code>.nuance.nlu.v1.EnumResourceType type = 1;</code>
   * @return The type.
   */
  com.nuance.rpc.nlu.v1.EnumResourceType getType();

  /**
   * <pre>
   * Location or name of the resource.
   * </pre>
   *
   * <code>string uri = 2;</code>
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   * <pre>
   * Location or name of the resource.
   * </pre>
   *
   * <code>string uri = 2;</code>
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString
      getUriBytes();

  /**
   * <pre>
   * Time, in ms, to wait for a response from the hosting server. Default is 0 for the NLU server's configured setting.
   * </pre>
   *
   * <code>uint32 request_timeout_ms = 7;</code>
   * @return The requestTimeoutMs.
   */
  int getRequestTimeoutMs();

  /**
   * <pre>
   * Optional map of headers to transmit to the server hosting the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 8;</code>
   */
  int getHeadersCount();
  /**
   * <pre>
   * Optional map of headers to transmit to the server hosting the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 8;</code>
   */
  boolean containsHeaders(
      java.lang.String key);
  /**
   * Use {@link #getHeadersMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getHeaders();
  /**
   * <pre>
   * Optional map of headers to transmit to the server hosting the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 8;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getHeadersMap();
  /**
   * <pre>
   * Optional map of headers to transmit to the server hosting the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 8;</code>
   */

  java.lang.String getHeadersOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Optional map of headers to transmit to the server hosting the resource.
   * </pre>
   *
   * <code>map&lt;string, string&gt; headers = 8;</code>
   */

  java.lang.String getHeadersOrThrow(
      java.lang.String key);
}