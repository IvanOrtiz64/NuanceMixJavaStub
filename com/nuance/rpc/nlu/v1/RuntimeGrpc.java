package com.nuance.rpc.nlu.v1;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 **
 * Interpretation service. Use the Interpret procedure to request an
 * interpretation.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.28.1-SNAPSHOT)",
    comments = "Source: runtime.proto")
public final class RuntimeGrpc {

  private RuntimeGrpc() {}

  public static final String SERVICE_NAME = "nuance.nlu.v1.Runtime";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.nuance.rpc.nlu.v1.InterpretRequest,
      com.nuance.rpc.nlu.v1.InterpretResponse> getInterpretMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Interpret",
      requestType = com.nuance.rpc.nlu.v1.InterpretRequest.class,
      responseType = com.nuance.rpc.nlu.v1.InterpretResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.nuance.rpc.nlu.v1.InterpretRequest,
      com.nuance.rpc.nlu.v1.InterpretResponse> getInterpretMethod() {
    io.grpc.MethodDescriptor<com.nuance.rpc.nlu.v1.InterpretRequest, com.nuance.rpc.nlu.v1.InterpretResponse> getInterpretMethod;
    if ((getInterpretMethod = RuntimeGrpc.getInterpretMethod) == null) {
      synchronized (RuntimeGrpc.class) {
        if ((getInterpretMethod = RuntimeGrpc.getInterpretMethod) == null) {
          RuntimeGrpc.getInterpretMethod = getInterpretMethod =
              io.grpc.MethodDescriptor.<com.nuance.rpc.nlu.v1.InterpretRequest, com.nuance.rpc.nlu.v1.InterpretResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Interpret"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nuance.rpc.nlu.v1.InterpretRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.nuance.rpc.nlu.v1.InterpretResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RuntimeMethodDescriptorSupplier("Interpret"))
              .build();
        }
      }
    }
    return getInterpretMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RuntimeStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RuntimeStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RuntimeStub>() {
        @java.lang.Override
        public RuntimeStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RuntimeStub(channel, callOptions);
        }
      };
    return RuntimeStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RuntimeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RuntimeBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RuntimeBlockingStub>() {
        @java.lang.Override
        public RuntimeBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RuntimeBlockingStub(channel, callOptions);
        }
      };
    return RuntimeBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RuntimeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RuntimeFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RuntimeFutureStub>() {
        @java.lang.Override
        public RuntimeFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RuntimeFutureStub(channel, callOptions);
        }
      };
    return RuntimeFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   **
   * Interpretation service. Use the Interpret procedure to request an
   * interpretation.
   * </pre>
   */
  public static abstract class RuntimeImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Starts an interpretation request and returns a response. 
     * </pre>
     */
    public void interpret(com.nuance.rpc.nlu.v1.InterpretRequest request,
        io.grpc.stub.StreamObserver<com.nuance.rpc.nlu.v1.InterpretResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInterpretMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInterpretMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.nuance.rpc.nlu.v1.InterpretRequest,
                com.nuance.rpc.nlu.v1.InterpretResponse>(
                  this, METHODID_INTERPRET)))
          .build();
    }
  }

  /**
   * <pre>
   **
   * Interpretation service. Use the Interpret procedure to request an
   * interpretation.
   * </pre>
   */
  public static final class RuntimeStub extends io.grpc.stub.AbstractAsyncStub<RuntimeStub> {
    private RuntimeStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RuntimeStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RuntimeStub(channel, callOptions);
    }

    /**
     * <pre>
     * Starts an interpretation request and returns a response. 
     * </pre>
     */
    public void interpret(com.nuance.rpc.nlu.v1.InterpretRequest request,
        io.grpc.stub.StreamObserver<com.nuance.rpc.nlu.v1.InterpretResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInterpretMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   **
   * Interpretation service. Use the Interpret procedure to request an
   * interpretation.
   * </pre>
   */
  public static final class RuntimeBlockingStub extends io.grpc.stub.AbstractBlockingStub<RuntimeBlockingStub> {
    private RuntimeBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RuntimeBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RuntimeBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Starts an interpretation request and returns a response. 
     * </pre>
     */
    public com.nuance.rpc.nlu.v1.InterpretResponse interpret(com.nuance.rpc.nlu.v1.InterpretRequest request) {
      return blockingUnaryCall(
          getChannel(), getInterpretMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   **
   * Interpretation service. Use the Interpret procedure to request an
   * interpretation.
   * </pre>
   */
  public static final class RuntimeFutureStub extends io.grpc.stub.AbstractFutureStub<RuntimeFutureStub> {
    private RuntimeFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RuntimeFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RuntimeFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Starts an interpretation request and returns a response. 
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.nuance.rpc.nlu.v1.InterpretResponse> interpret(
        com.nuance.rpc.nlu.v1.InterpretRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInterpretMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_INTERPRET = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RuntimeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RuntimeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INTERPRET:
          serviceImpl.interpret((com.nuance.rpc.nlu.v1.InterpretRequest) request,
              (io.grpc.stub.StreamObserver<com.nuance.rpc.nlu.v1.InterpretResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RuntimeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RuntimeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.nuance.rpc.nlu.v1.RuntimeProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Runtime");
    }
  }

  private static final class RuntimeFileDescriptorSupplier
      extends RuntimeBaseDescriptorSupplier {
    RuntimeFileDescriptorSupplier() {}
  }

  private static final class RuntimeMethodDescriptorSupplier
      extends RuntimeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RuntimeMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RuntimeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RuntimeFileDescriptorSupplier())
              .addMethod(getInterpretMethod())
              .build();
        }
      }
    }
    return result;
  }
}
