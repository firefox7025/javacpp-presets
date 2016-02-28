// Targeted by JavaCPP version 1.2-SNAPSHOT

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_imgproc.*;
import static org.bytedeco.javacpp.opencv_imgcodecs.*;
import static org.bytedeco.javacpp.opencv_videoio.*;
import static org.bytedeco.javacpp.opencv_highgui.*;

public class mxnet extends org.bytedeco.javacpp.presets.mxnet {
    static { Loader.load(); }

// Parsed from mxnet/c_api.h

/**
 *  Copyright (c) 2015 by Contributors
 * \file c_api.h
 * \brief C API of mxnet
 */
// #ifndef MXNET_C_API_H_
// #define MXNET_C_API_H_

// #ifdef __cplusplus
// #define MXNET_EXTERN_C extern "C"
// #endif

/** \brief MXNET_DLL prefix for windows */
// #ifdef _WIN32
// #ifdef MXNET_EXPORTS
// #define MXNET_DLL MXNET_EXTERN_C __declspec(dllexport)
// #else
// #define MXNET_DLL MXNET_EXTERN_C __declspec(dllimport)
// #endif
// #else
// #define MXNET_DLL MXNET_EXTERN_C
// #endif

/** \brief manually define unsigned int */
/** \brief manually define unsigned int */
// all the handles are simply void *
// will be casted internally to specific pointers types
// these typedefs are mainly used for readablity reasons
/** \brief handle to NDArray */
@Namespace @Name("void") @Opaque public static class NDArrayHandle extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public NDArrayHandle() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NDArrayHandle(Pointer p) { super(p); }
}
/** \brief handle to a mxnet narray function that changes NDArray */
@Namespace @Name("void") @Opaque public static class FunctionHandle extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public FunctionHandle() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FunctionHandle(Pointer p) { super(p); }
}
/** \brief handle to a function that takes param and creates symbol */
@Namespace @Name("void") @Opaque public static class AtomicSymbolCreator extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public AtomicSymbolCreator() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AtomicSymbolCreator(Pointer p) { super(p); }
}
/** \brief handle to a symbol that can be bind as operator */
@Namespace @Name("void") @Opaque public static class SymbolHandle extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public SymbolHandle() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SymbolHandle(Pointer p) { super(p); }
}
/** \brief handle to a AtomicSymbol */
@Namespace @Name("void") @Opaque public static class AtomicSymbolHandle extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public AtomicSymbolHandle() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AtomicSymbolHandle(Pointer p) { super(p); }
}
/** \brief handle to an Executor */
@Namespace @Name("void") @Opaque public static class ExecutorHandle extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public ExecutorHandle() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ExecutorHandle(Pointer p) { super(p); }
}
/** \brief handle a dataiter creator */
@Namespace @Name("void") @Opaque public static class DataIterCreator extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public DataIterCreator() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DataIterCreator(Pointer p) { super(p); }
}
/** \brief handle to a DataIterator */
@Namespace @Name("void") @Opaque public static class DataIterHandle extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public DataIterHandle() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DataIterHandle(Pointer p) { super(p); }
}
/** \brief handle to KVStore */
@Namespace @Name("void") @Opaque public static class KVStoreHandle extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public KVStoreHandle() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KVStoreHandle(Pointer p) { super(p); }
}
/** \brief handle to RecordIO */
@Namespace @Name("void") @Opaque public static class RecordIOHandle extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public RecordIOHandle() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RecordIOHandle(Pointer p) { super(p); }
}
/** \brief handle to MXRtc*/
@Namespace @Name("void") @Opaque public static class RtcHandle extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public RtcHandle() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RtcHandle(Pointer p) { super(p); }
}
/** \brief handle to a function that takes param and creates optimizer*/
@Namespace @Name("void") @Opaque public static class OptimizerCreator extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public OptimizerCreator() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OptimizerCreator(Pointer p) { super(p); }
}
/** \brief handle to Optimizer*/
@Namespace @Name("void") @Opaque public static class OptimizerHandle extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public OptimizerHandle() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OptimizerHandle(Pointer p) { super(p); }
}

public static class ExecutorMonitorCallback extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    ExecutorMonitorCallback(Pointer p) { super(p); }
    protected ExecutorMonitorCallback() { allocate(); }
    private native void allocate();
    public native void call(@Cast("const char*") BytePointer arg0,
                                                       NDArrayHandle arg1,
                                                       Pointer arg2);
}
public static class NativeOpInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NativeOpInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public NativeOpInfo(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NativeOpInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public NativeOpInfo position(int position) {
        return (NativeOpInfo)super.position(position);
    }

  public static class Forward_int_PointerPointer_IntPointer_PointerPointer_IntPointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Forward_int_PointerPointer_IntPointer_PointerPointer_IntPointer_Pointer(Pointer p) { super(p); }
      protected Forward_int_PointerPointer_IntPointer_PointerPointer_IntPointer_Pointer() { allocate(); }
      private native void allocate();
      public native void call(int arg0, @Cast("float**") PointerPointer arg1, IntPointer arg2, @Cast("unsigned**") PointerPointer arg3, IntPointer arg4, Pointer arg5);
  }
  public native Forward_int_PointerPointer_IntPointer_PointerPointer_IntPointer_Pointer forward(); public native NativeOpInfo forward(Forward_int_PointerPointer_IntPointer_PointerPointer_IntPointer_Pointer forward);
  public static class Backward_int_PointerPointer_IntPointer_PointerPointer_IntPointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Backward_int_PointerPointer_IntPointer_PointerPointer_IntPointer_Pointer(Pointer p) { super(p); }
      protected Backward_int_PointerPointer_IntPointer_PointerPointer_IntPointer_Pointer() { allocate(); }
      private native void allocate();
      public native void call(int arg0, @Cast("float**") PointerPointer arg1, IntPointer arg2, @Cast("unsigned**") PointerPointer arg3, IntPointer arg4, Pointer arg5);
  }
  public native Backward_int_PointerPointer_IntPointer_PointerPointer_IntPointer_Pointer backward(); public native NativeOpInfo backward(Backward_int_PointerPointer_IntPointer_PointerPointer_IntPointer_Pointer backward);
  public static class Infer_shape_int_IntPointer_PointerPointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Infer_shape_int_IntPointer_PointerPointer_Pointer(Pointer p) { super(p); }
      protected Infer_shape_int_IntPointer_PointerPointer_Pointer() { allocate(); }
      private native void allocate();
      public native void call(int arg0, IntPointer arg1, @Cast("unsigned**") PointerPointer arg2, Pointer arg3);
  }
  public native Infer_shape_int_IntPointer_PointerPointer_Pointer infer_shape(); public native NativeOpInfo infer_shape(Infer_shape_int_IntPointer_PointerPointer_Pointer infer_shape);
  public static class List_outputs_PointerPointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    List_outputs_PointerPointer_Pointer(Pointer p) { super(p); }
      protected List_outputs_PointerPointer_Pointer() { allocate(); }
      private native void allocate();
      public native void call(@Cast("char***") PointerPointer arg0, Pointer arg1);
  }
  public native List_outputs_PointerPointer_Pointer list_outputs(); public native NativeOpInfo list_outputs(List_outputs_PointerPointer_Pointer list_outputs);
  public static class List_arguments_PointerPointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    List_arguments_PointerPointer_Pointer(Pointer p) { super(p); }
      protected List_arguments_PointerPointer_Pointer() { allocate(); }
      private native void allocate();
      public native void call(@Cast("char***") PointerPointer arg0, Pointer arg1);
  }
  public native List_arguments_PointerPointer_Pointer list_arguments(); public native NativeOpInfo list_arguments(List_arguments_PointerPointer_Pointer list_arguments);
  // all functions also pass a payload void* pointer
  public native Pointer p_forward(); public native NativeOpInfo p_forward(Pointer p_forward);
  public native Pointer p_backward(); public native NativeOpInfo p_backward(Pointer p_backward);
  public native Pointer p_infer_shape(); public native NativeOpInfo p_infer_shape(Pointer p_infer_shape);
  public native Pointer p_list_outputs(); public native NativeOpInfo p_list_outputs(Pointer p_list_outputs);
  public native Pointer p_list_arguments(); public native NativeOpInfo p_list_arguments(Pointer p_list_arguments);
}

public static class NDArrayOpInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NDArrayOpInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public NDArrayOpInfo(int size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NDArrayOpInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public NDArrayOpInfo position(int position) {
        return (NDArrayOpInfo)super.position(position);
    }

  public static class Forward_int_PointerPointer_IntPointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Forward_int_PointerPointer_IntPointer_Pointer(Pointer p) { super(p); }
      protected Forward_int_PointerPointer_IntPointer_Pointer() { allocate(); }
      private native void allocate();
      public native @Cast("bool") boolean call(int arg0, @Cast("void**") PointerPointer arg1, IntPointer arg2, Pointer arg3);
  }
  public native Forward_int_PointerPointer_IntPointer_Pointer forward(); public native NDArrayOpInfo forward(Forward_int_PointerPointer_IntPointer_Pointer forward);
  public static class Backward_int_PointerPointer_IntPointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Backward_int_PointerPointer_IntPointer_Pointer(Pointer p) { super(p); }
      protected Backward_int_PointerPointer_IntPointer_Pointer() { allocate(); }
      private native void allocate();
      public native @Cast("bool") boolean call(int arg0, @Cast("void**") PointerPointer arg1, IntPointer arg2, Pointer arg3);
  }
  public native Backward_int_PointerPointer_IntPointer_Pointer backward(); public native NDArrayOpInfo backward(Backward_int_PointerPointer_IntPointer_Pointer backward);
  public static class Infer_shape_int_IntPointer_PointerPointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Infer_shape_int_IntPointer_PointerPointer_Pointer(Pointer p) { super(p); }
      protected Infer_shape_int_IntPointer_PointerPointer_Pointer() { allocate(); }
      private native void allocate();
      public native @Cast("bool") boolean call(int arg0, IntPointer arg1, @Cast("unsigned**") PointerPointer arg2, Pointer arg3);
  }
  public native Infer_shape_int_IntPointer_PointerPointer_Pointer infer_shape(); public native NDArrayOpInfo infer_shape(Infer_shape_int_IntPointer_PointerPointer_Pointer infer_shape);
  public static class List_outputs_PointerPointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    List_outputs_PointerPointer_Pointer(Pointer p) { super(p); }
      protected List_outputs_PointerPointer_Pointer() { allocate(); }
      private native void allocate();
      public native @Cast("bool") boolean call(@Cast("char***") PointerPointer arg0, Pointer arg1);
  }
  public native List_outputs_PointerPointer_Pointer list_outputs(); public native NDArrayOpInfo list_outputs(List_outputs_PointerPointer_Pointer list_outputs);
  public static class List_arguments_PointerPointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    List_arguments_PointerPointer_Pointer(Pointer p) { super(p); }
      protected List_arguments_PointerPointer_Pointer() { allocate(); }
      private native void allocate();
      public native @Cast("bool") boolean call(@Cast("char***") PointerPointer arg0, Pointer arg1);
  }
  public native List_arguments_PointerPointer_Pointer list_arguments(); public native NDArrayOpInfo list_arguments(List_arguments_PointerPointer_Pointer list_arguments);
  public static class Declare_backward_dependency_IntPointer_IntPointer_IntPointer_IntPointer_PointerPointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Declare_backward_dependency_IntPointer_IntPointer_IntPointer_IntPointer_PointerPointer_Pointer(Pointer p) { super(p); }
      protected Declare_backward_dependency_IntPointer_IntPointer_IntPointer_IntPointer_PointerPointer_Pointer() { allocate(); }
      private native void allocate();
      public native @Cast("bool") boolean call(@Const IntPointer arg0, @Const IntPointer arg1, @Const IntPointer arg2,
                                        IntPointer arg3, @Cast("int**") PointerPointer arg4, Pointer arg5);
  }
  public native Declare_backward_dependency_IntPointer_IntPointer_IntPointer_IntPointer_PointerPointer_Pointer declare_backward_dependency(); public native NDArrayOpInfo declare_backward_dependency(Declare_backward_dependency_IntPointer_IntPointer_IntPointer_IntPointer_PointerPointer_Pointer declare_backward_dependency);
  // all functions also pass a payload void* pointer
  public native Pointer p_forward(); public native NDArrayOpInfo p_forward(Pointer p_forward);
  public native Pointer p_backward(); public native NDArrayOpInfo p_backward(Pointer p_backward);
  public native Pointer p_infer_shape(); public native NDArrayOpInfo p_infer_shape(Pointer p_infer_shape);
  public native Pointer p_list_outputs(); public native NDArrayOpInfo p_list_outputs(Pointer p_list_outputs);
  public native Pointer p_list_arguments(); public native NDArrayOpInfo p_list_arguments(Pointer p_list_arguments);
  public native Pointer p_declare_backward_dependency(); public native NDArrayOpInfo p_declare_backward_dependency(Pointer p_declare_backward_dependency);
}
/**
 * \brief return str message of the last error
 *  all function in this file will return 0 when success
 *  and -1 when an error occured,
 *  MXGetLastError can be called to retrieve the error
 *
 *  this function is threadsafe and can be called by different thread
 *  @return error info
 */
public static native @Cast("const char*") BytePointer MXGetLastError();

//-------------------------------------
// Part 0: Global State setups
//-------------------------------------
/**
 * \brief Seed the global random number generators in mxnet.
 * @param seed the random number seed.
 * @return 0 when success, -1 when failure happens.
 */
public static native int MXRandomSeed(int seed);
/**
 * \brief Notify the engine about a shutdown,
 *  This can help engine to print less messages into display.
 *
 *  User do not have to call this function.
 * @return 0 when success, -1 when failure happens.
 */
public static native int MXNotifyShutdown();
//-------------------------------------
// Part 1: NDArray creation and deletion
//-------------------------------------
/**
 * \brief create a NDArray handle that is not initialized
 *  can be used to pass in as mutate variables
 *  to hold the result of NDArray
 * @param out the returning handle
 * @return 0 when success, -1 when failure happens
 */
public static native int MXNDArrayCreateNone(PointerPointer out);
/**
 * \brief create a NDArray with specified shape
 * @param shape the pointer to the shape
 * @param ndim the dimension of the shape
 * @param dev_type device type, specify device we want to take
 * @param dev_id the device id of the specific device
 * @param delay_alloc whether to delay allocation until
 *    the narray is first mutated
 * @param out the returning handle
 * @return 0 when success, -1 when failure happens
 */
public static native int MXNDArrayCreate(@Cast("const mx_uint*") IntPointer shape,
                              @Cast("mx_uint") int ndim,
                              int dev_type,
                              int dev_id,
                              int delay_alloc,
                              PointerPointer out);
public static native int MXNDArrayCreate(@Cast("const mx_uint*") IntBuffer shape,
                              @Cast("mx_uint") int ndim,
                              int dev_type,
                              int dev_id,
                              int delay_alloc,
                              PointerPointer out);
public static native int MXNDArrayCreate(@Cast("const mx_uint*") int[] shape,
                              @Cast("mx_uint") int ndim,
                              int dev_type,
                              int dev_id,
                              int delay_alloc,
                              PointerPointer out);

/**
 * \brief create a NDArray with specified shape and data type
 * @param shape the pointer to the shape
 * @param ndim the dimension of the shape
 * @param dev_type device type, specify device we want to take
 * @param dev_id the device id of the specific device
 * @param delay_alloc whether to delay allocation until
 *    the narray is first mutated
 * @param dtype data type of created array
 * @param out the returning handle
 * @return 0 when success, -1 when failure happens
 */
public static native int MXNDArrayCreateEx(@Cast("const mx_uint*") IntPointer shape,
                              @Cast("mx_uint") int ndim,
                              int dev_type,
                              int dev_id,
                              int delay_alloc,
                              int dtype,
                              PointerPointer out);
public static native int MXNDArrayCreateEx(@Cast("const mx_uint*") IntBuffer shape,
                              @Cast("mx_uint") int ndim,
                              int dev_type,
                              int dev_id,
                              int delay_alloc,
                              int dtype,
                              PointerPointer out);
public static native int MXNDArrayCreateEx(@Cast("const mx_uint*") int[] shape,
                              @Cast("mx_uint") int ndim,
                              int dev_type,
                              int dev_id,
                              int delay_alloc,
                              int dtype,
                              PointerPointer out);
/**
 * \brief create a NDArray handle that is loaded from raw bytes.
 * @param buf the head of the raw bytes
 * @param size size of the raw bytes
 * @param out the returning handle
 * @return 0 when success, -1 when failure happens
 */
public static native int MXNDArrayLoadFromRawBytes(@Const Pointer buf,
                                        @Cast("size_t") long size,
                                        PointerPointer out);
/**
 * \brief save the NDArray into raw bytes.
 * @param handle the NDArray handle
 * @param out_size size of the raw bytes
 * @param out_buf the head of returning memory bytes.
 * @return 0 when success, -1 when failure happens
 */
public static native int MXNDArraySaveRawBytes(NDArrayHandle handle,
                                    @Cast("size_t*") SizeTPointer out_size,
                                    @Cast("const char**") PointerPointer out_buf);
public static native int MXNDArraySaveRawBytes(NDArrayHandle handle,
                                    @Cast("size_t*") SizeTPointer out_size,
                                    @Cast("const char**") @ByPtrPtr BytePointer out_buf);
public static native int MXNDArraySaveRawBytes(NDArrayHandle handle,
                                    @Cast("size_t*") SizeTPointer out_size,
                                    @Cast("const char**") @ByPtrPtr ByteBuffer out_buf);
public static native int MXNDArraySaveRawBytes(NDArrayHandle handle,
                                    @Cast("size_t*") SizeTPointer out_size,
                                    @Cast("const char**") @ByPtrPtr byte[] out_buf);
/**
 * \brief Save list of narray into the file.
 * @param fname name of the file.
 * @param num_args number of arguments to save.
 * @param args the array of NDArrayHandles to be saved.
 * @param keys the name of the NDArray, optional, can be NULL
 * @return 0 when success, -1 when failure happens
 */
public static native int MXNDArraySave(@Cast("const char*") BytePointer fname,
                            @Cast("mx_uint") int num_args,
                            PointerPointer args,
                            @Cast("const char**") PointerPointer keys);
public static native int MXNDArraySave(@Cast("const char*") BytePointer fname,
                            @Cast("mx_uint") int num_args,
                            PointerPointer args,
                            @Cast("const char**") @ByPtrPtr BytePointer keys);
public static native int MXNDArraySave(String fname,
                            @Cast("mx_uint") int num_args,
                            PointerPointer args,
                            @Cast("const char**") @ByPtrPtr ByteBuffer keys);
public static native int MXNDArraySave(@Cast("const char*") BytePointer fname,
                            @Cast("mx_uint") int num_args,
                            PointerPointer args,
                            @Cast("const char**") @ByPtrPtr byte[] keys);
public static native int MXNDArraySave(String fname,
                            @Cast("mx_uint") int num_args,
                            PointerPointer args,
                            @Cast("const char**") @ByPtrPtr BytePointer keys);
public static native int MXNDArraySave(@Cast("const char*") BytePointer fname,
                            @Cast("mx_uint") int num_args,
                            PointerPointer args,
                            @Cast("const char**") @ByPtrPtr ByteBuffer keys);
public static native int MXNDArraySave(String fname,
                            @Cast("mx_uint") int num_args,
                            PointerPointer args,
                            @Cast("const char**") @ByPtrPtr byte[] keys);
/**
 * \brief Load list of narray from the file.
 * @param fname name of the file.
 * @param out_size number of narray loaded.
 * @param out_arr head of the returning narray handles.
 * @param out_name_size size of output name arrray.
 * @param out_names the names of returning NDArrays, can be NULL
 * @return 0 when success, -1 when failure happens
 */
public static native int MXNDArrayLoad(@Cast("const char*") BytePointer fname,
                            @Cast("mx_uint*") IntPointer out_size,
                            @Cast("NDArrayHandle**") PointerPointer out_arr,
                            @Cast("mx_uint*") IntPointer out_name_size,
                            @Cast("const char***") PointerPointer out_names);
public static native int MXNDArrayLoad(String fname,
                            @Cast("mx_uint*") IntBuffer out_size,
                            @ByPtrPtr PointerPointer out_arr,
                            @Cast("mx_uint*") IntBuffer out_name_size,
                            @Cast("const char***") PointerPointer out_names);
public static native int MXNDArrayLoad(@Cast("const char*") BytePointer fname,
                            @Cast("mx_uint*") int[] out_size,
                            @ByPtrPtr PointerPointer out_arr,
                            @Cast("mx_uint*") int[] out_name_size,
                            @Cast("const char***") PointerPointer out_names);
public static native int MXNDArrayLoad(String fname,
                            @Cast("mx_uint*") IntPointer out_size,
                            @ByPtrPtr PointerPointer out_arr,
                            @Cast("mx_uint*") IntPointer out_name_size,
                            @Cast("const char***") PointerPointer out_names);
public static native int MXNDArrayLoad(@Cast("const char*") BytePointer fname,
                            @Cast("mx_uint*") IntBuffer out_size,
                            @ByPtrPtr PointerPointer out_arr,
                            @Cast("mx_uint*") IntBuffer out_name_size,
                            @Cast("const char***") PointerPointer out_names);
public static native int MXNDArrayLoad(String fname,
                            @Cast("mx_uint*") int[] out_size,
                            @ByPtrPtr PointerPointer out_arr,
                            @Cast("mx_uint*") int[] out_name_size,
                            @Cast("const char***") PointerPointer out_names);
/**
 * \brief Perform a synchronize copy from a continugous CPU memory region.
 *
 *  This function will call WaitToWrite before the copy is performed.
 *  This is useful to copy data from existing memory region that are
 *  not wrapped by NDArray(thus dependency not being tracked).
 *
 * @param handle the NDArray handle
 * @param data the data source to copy from.
 * @param size the memory size we want to copy from.
 */
public static native int MXNDArraySyncCopyFromCPU(NDArrayHandle handle,
                                       @Const Pointer data,
                                       @Cast("size_t") long size);
/**
 * \brief Perform a synchronize copyto a continugous CPU memory region.
 *
 *  This function will call WaitToRead before the copy is performed.
 *  This is useful to copy data from existing memory region that are
 *  not wrapped by NDArray(thus dependency not being tracked).
 *
 * @param handle the NDArray handle
 * @param data the data source to copy into.
 * @param size the memory size we want to copy into.
 */
public static native int MXNDArraySyncCopyToCPU(NDArrayHandle handle,
                                     Pointer data,
                                     @Cast("size_t") long size);
/**
 * \brief Wait until all the pending writes with respect NDArray are finished.
 *  Always call this before read data out synchronizely.
 * @param handle the NDArray handle
 * @return 0 when success, -1 when failure happens
 */
public static native int MXNDArrayWaitToRead(NDArrayHandle handle);
/**
 * \brief Wait until all the pending read/write with respect NDArray are finished.
 *  Always call this before write data into NDArray synchronizely.
 * @param handle the NDArray handle
 * @return 0 when success, -1 when failure happens
 */
public static native int MXNDArrayWaitToWrite(NDArrayHandle handle);
/**
 * \brief wait until all delayed operations in
 *   the system is completed
 * @return 0 when success, -1 when failure happens
 */
public static native int MXNDArrayWaitAll();
/**
 * \brief free the narray handle
 * @param handle the handle to be freed
 * @return 0 when success, -1 when failure happens
 */
public static native int MXNDArrayFree(NDArrayHandle handle);
/**
 * \brief Slice the NDArray along axis 0.
 * @param handle the handle to the narraya
 * @param slice_begin The beginning index of slice
 * @param slice_end The ending index of slice
 * @param out The NDArrayHandle of sliced NDArray
 * @return 0 when success, -1 when failure happens
 */
public static native int MXNDArraySlice(NDArrayHandle handle,
                             @Cast("mx_uint") int slice_begin,
                             @Cast("mx_uint") int slice_end,
                             PointerPointer out);
/**
 * \brief Reshape the NDArray.
 * @param handle the handle to the narray
 * @param ndim number of dimensions of new shape
 * @param dims new shape
 * @param out the NDArrayHandle of reshaped NDArray
 * @return 0 when success, -1 when failure happens
 */
public static native int MXNDArrayReshape(NDArrayHandle handle,
                               int ndim,
                               IntPointer dims,
                               PointerPointer out);
public static native int MXNDArrayReshape(NDArrayHandle handle,
                               int ndim,
                               IntBuffer dims,
                               PointerPointer out);
public static native int MXNDArrayReshape(NDArrayHandle handle,
                               int ndim,
                               int[] dims,
                               PointerPointer out);
/**
 * \brief get the shape of the array
 * @param handle the handle to the narray
 * @param out_dim the output dimension
 * @param out_pdata pointer holder to get data pointer of the shape
 * @return 0 when success, -1 when failure happens
 */
public static native int MXNDArrayGetShape(NDArrayHandle handle,
                                @Cast("mx_uint*") IntPointer out_dim,
                                @Cast("const mx_uint**") PointerPointer out_pdata);
public static native int MXNDArrayGetShape(NDArrayHandle handle,
                                @Cast("mx_uint*") IntPointer out_dim,
                                @Cast("const mx_uint**") @ByPtrPtr IntPointer out_pdata);
public static native int MXNDArrayGetShape(NDArrayHandle handle,
                                @Cast("mx_uint*") IntBuffer out_dim,
                                @Cast("const mx_uint**") @ByPtrPtr IntBuffer out_pdata);
public static native int MXNDArrayGetShape(NDArrayHandle handle,
                                @Cast("mx_uint*") int[] out_dim,
                                @Cast("const mx_uint**") @ByPtrPtr int[] out_pdata);
/**
 * \brief get the content of the data in NDArray
 * @param handle the handle to the narray
 * @param out_pdata pointer holder to get pointer of data
 * @return 0 when success, -1 when failure happens
 */
public static native int MXNDArrayGetData(NDArrayHandle handle,
                               @Cast("mx_float**") PointerPointer out_pdata);
public static native int MXNDArrayGetData(NDArrayHandle handle,
                               @Cast("mx_float**") @ByPtrPtr FloatPointer out_pdata);
public static native int MXNDArrayGetData(NDArrayHandle handle,
                               @Cast("mx_float**") @ByPtrPtr FloatBuffer out_pdata);
public static native int MXNDArrayGetData(NDArrayHandle handle,
                               @Cast("mx_float**") @ByPtrPtr float[] out_pdata);
/**
 * \brief get the type of the data in NDArray
 * @param handle the handle to the narray
 * @param out_dtype pointer holder to get type of data
 * @return 0 when success, -1 when failure happens
 */
public static native int MXNDArrayGetDType(NDArrayHandle handle,
                               IntPointer out_dtype);
public static native int MXNDArrayGetDType(NDArrayHandle handle,
                               IntBuffer out_dtype);
public static native int MXNDArrayGetDType(NDArrayHandle handle,
                               int[] out_dtype);
/**
 * \brief get the context of the NDArray
 * @param handle the handle to the narray
 * @param out_dev_type the output device type
 * @param out_dev_id the output device id
 * @return 0 when success, -1 when failure happens
 */
public static native int MXNDArrayGetContext(NDArrayHandle handle,
                                  IntPointer out_dev_type,
                                  IntPointer out_dev_id);
public static native int MXNDArrayGetContext(NDArrayHandle handle,
                                  IntBuffer out_dev_type,
                                  IntBuffer out_dev_id);
public static native int MXNDArrayGetContext(NDArrayHandle handle,
                                  int[] out_dev_type,
                                  int[] out_dev_id);

//--------------------------------
// Part 2: functions on NDArray
//--------------------------------
/**
 * \brief list all the available functions handles
 *   most user can use it to list all the needed functions
 * @param out_size the size of returned array
 * @param out_array the output function array
 * @return 0 when success, -1 when failure happens
 */
public static native int MXListFunctions(@Cast("mx_uint*") IntPointer out_size,
                              @Cast("FunctionHandle**") @Const PointerPointer out_array);
public static native int MXListFunctions(@Cast("mx_uint*") IntBuffer out_size,
                              @Const @ByPtrPtr PointerPointer out_array);
public static native int MXListFunctions(@Cast("mx_uint*") int[] out_size,
                              @Const @ByPtrPtr PointerPointer out_array);
/**
 * \brief get the function handle by name
 * @param name the name of the function
 * @param out the corresponding function handle
 * @return 0 when success, -1 when failure happens
 */
public static native int MXGetFunction(@Cast("const char*") BytePointer name,
                            @Const PointerPointer out);
public static native int MXGetFunction(String name,
                            @Const PointerPointer out);
/**
 * \brief Get the information of the function handle.
 * @param fun The function handle.
 * @param name The returned name of the function.
 * @param description The returned description of the function.
 * @param num_args Number of arguments.
 * @param arg_names Name of the arguments.
 * @param arg_type_infos Type informations about the arguments.
 * @param arg_descriptions Description information about the arguments.
 * @param return_type Return type of the function.
 * @return 0 when success, -1 when failure happens
 */
public static native int MXFuncGetInfo(@Const FunctionHandle fun,
                            @Cast("const char**") PointerPointer name,
                            @Cast("const char**") PointerPointer description,
                            @Cast("mx_uint*") IntPointer num_args,
                            @Cast("const char***") PointerPointer arg_names,
                            @Cast("const char***") PointerPointer arg_type_infos,
                            @Cast("const char***") PointerPointer arg_descriptions,
                            @Cast("const char**") PointerPointer return_type/*=NULL*/);
public static native int MXFuncGetInfo(@Const FunctionHandle fun,
                            @Cast("const char**") @ByPtrPtr BytePointer name,
                            @Cast("const char**") @ByPtrPtr BytePointer description,
                            @Cast("mx_uint*") IntPointer num_args,
                            @Cast("const char***") PointerPointer arg_names,
                            @Cast("const char***") PointerPointer arg_type_infos,
                            @Cast("const char***") PointerPointer arg_descriptions);
public static native int MXFuncGetInfo(@Const FunctionHandle fun,
                            @Cast("const char**") @ByPtrPtr BytePointer name,
                            @Cast("const char**") @ByPtrPtr BytePointer description,
                            @Cast("mx_uint*") IntPointer num_args,
                            @Cast("const char***") PointerPointer arg_names,
                            @Cast("const char***") PointerPointer arg_type_infos,
                            @Cast("const char***") PointerPointer arg_descriptions,
                            @Cast("const char**") @ByPtrPtr BytePointer return_type/*=NULL*/);
public static native int MXFuncGetInfo(@Const FunctionHandle fun,
                            @Cast("const char**") @ByPtrPtr ByteBuffer name,
                            @Cast("const char**") @ByPtrPtr ByteBuffer description,
                            @Cast("mx_uint*") IntBuffer num_args,
                            @Cast("const char***") PointerPointer arg_names,
                            @Cast("const char***") PointerPointer arg_type_infos,
                            @Cast("const char***") PointerPointer arg_descriptions,
                            @Cast("const char**") @ByPtrPtr ByteBuffer return_type/*=NULL*/);
public static native int MXFuncGetInfo(@Const FunctionHandle fun,
                            @Cast("const char**") @ByPtrPtr ByteBuffer name,
                            @Cast("const char**") @ByPtrPtr ByteBuffer description,
                            @Cast("mx_uint*") IntBuffer num_args,
                            @Cast("const char***") PointerPointer arg_names,
                            @Cast("const char***") PointerPointer arg_type_infos,
                            @Cast("const char***") PointerPointer arg_descriptions);
public static native int MXFuncGetInfo(@Const FunctionHandle fun,
                            @Cast("const char**") @ByPtrPtr byte[] name,
                            @Cast("const char**") @ByPtrPtr byte[] description,
                            @Cast("mx_uint*") int[] num_args,
                            @Cast("const char***") PointerPointer arg_names,
                            @Cast("const char***") PointerPointer arg_type_infos,
                            @Cast("const char***") PointerPointer arg_descriptions,
                            @Cast("const char**") @ByPtrPtr byte[] return_type/*=NULL*/);
public static native int MXFuncGetInfo(@Const FunctionHandle fun,
                            @Cast("const char**") @ByPtrPtr byte[] name,
                            @Cast("const char**") @ByPtrPtr byte[] description,
                            @Cast("mx_uint*") int[] num_args,
                            @Cast("const char***") PointerPointer arg_names,
                            @Cast("const char***") PointerPointer arg_type_infos,
                            @Cast("const char***") PointerPointer arg_descriptions);
/**
 * \brief get the argument requirements of the function
 * @param fun input function handle
 * @param num_use_vars how many NDArrays to be passed in as used_vars
 * @param num_scalars scalar variable is needed
 * @param num_mutate_vars how many NDArrays to be passed in as mutate_vars
 * @param type_mask the type mask of this function
 * @return 0 when success, -1 when failure happens
 * \sa MXFuncInvoke
 */
public static native int MXFuncDescribe(@Const FunctionHandle fun,
                             @Cast("mx_uint*") IntPointer num_use_vars,
                             @Cast("mx_uint*") IntPointer num_scalars,
                             @Cast("mx_uint*") IntPointer num_mutate_vars,
                             IntPointer type_mask);
public static native int MXFuncDescribe(@Const FunctionHandle fun,
                             @Cast("mx_uint*") IntBuffer num_use_vars,
                             @Cast("mx_uint*") IntBuffer num_scalars,
                             @Cast("mx_uint*") IntBuffer num_mutate_vars,
                             IntBuffer type_mask);
public static native int MXFuncDescribe(@Const FunctionHandle fun,
                             @Cast("mx_uint*") int[] num_use_vars,
                             @Cast("mx_uint*") int[] num_scalars,
                             @Cast("mx_uint*") int[] num_mutate_vars,
                             int[] type_mask);
/**
 * \brief invoke a function, the array size of passed in arguments
 *   must match the values in the
 * @param fun the function
 * @param use_vars the normal arguments passed to function
 * @param scalar_args the scalar qarguments
 * @param mutate_vars the mutate arguments
 * @return 0 when success, -1 when failure happens
 * \sa MXFuncDescribeArgs
 */
public static native int MXFuncInvoke(@Const FunctionHandle fun,
                           PointerPointer use_vars,
                           @Cast("mx_float*") FloatPointer scalar_args,
                           PointerPointer mutate_vars);
public static native int MXFuncInvoke(@Const FunctionHandle fun,
                           PointerPointer use_vars,
                           @Cast("mx_float*") FloatBuffer scalar_args,
                           PointerPointer mutate_vars);
public static native int MXFuncInvoke(@Const FunctionHandle fun,
                           PointerPointer use_vars,
                           @Cast("mx_float*") float[] scalar_args,
                           PointerPointer mutate_vars);
/**
 * \brief invoke a function, the array size of passed in arguments
 *   must match the values in the
 * @param fun the function
 * @param use_vars the normal arguments passed to function
 * @param scalar_args the scalar qarguments
 * @param mutate_vars the mutate arguments
 * @param num_params number of keyword parameters
 * @param param_keys keys for keyword parameters
 * @param param_vals values for keyword parameters
 * @return 0 when success, -1 when failure happens
 * \sa MXFuncDescribeArgs
 */
public static native int MXFuncInvokeEx(@Const FunctionHandle fun,
                             PointerPointer use_vars,
                             @Cast("mx_float*") FloatPointer scalar_args,
                             PointerPointer mutate_vars,
                             int num_params,
                             @Cast("char**") PointerPointer param_keys,
                             @Cast("char**") PointerPointer param_vals);
public static native int MXFuncInvokeEx(@Const FunctionHandle fun,
                             PointerPointer use_vars,
                             @Cast("mx_float*") FloatPointer scalar_args,
                             PointerPointer mutate_vars,
                             int num_params,
                             @Cast("char**") @ByPtrPtr BytePointer param_keys,
                             @Cast("char**") @ByPtrPtr BytePointer param_vals);
public static native int MXFuncInvokeEx(@Const FunctionHandle fun,
                             PointerPointer use_vars,
                             @Cast("mx_float*") FloatBuffer scalar_args,
                             PointerPointer mutate_vars,
                             int num_params,
                             @Cast("char**") @ByPtrPtr ByteBuffer param_keys,
                             @Cast("char**") @ByPtrPtr ByteBuffer param_vals);
public static native int MXFuncInvokeEx(@Const FunctionHandle fun,
                             PointerPointer use_vars,
                             @Cast("mx_float*") float[] scalar_args,
                             PointerPointer mutate_vars,
                             int num_params,
                             @Cast("char**") @ByPtrPtr byte[] param_keys,
                             @Cast("char**") @ByPtrPtr byte[] param_vals);
//--------------------------------------------
// Part 3: symbolic configuration generation
//--------------------------------------------
/**
 * \brief list all the available AtomicSymbolEntry
 * @param out_size the size of returned array
 * @param out_array the output AtomicSymbolCreator array
 * @return 0 when success, -1 when failure happens
 */
public static native int MXSymbolListAtomicSymbolCreators(@Cast("mx_uint*") IntPointer out_size,
                                               @Cast("AtomicSymbolCreator**") PointerPointer out_array);
public static native int MXSymbolListAtomicSymbolCreators(@Cast("mx_uint*") IntBuffer out_size,
                                               @ByPtrPtr PointerPointer out_array);
public static native int MXSymbolListAtomicSymbolCreators(@Cast("mx_uint*") int[] out_size,
                                               @ByPtrPtr PointerPointer out_array);
/**
 * \brief Get the detailed information about atomic symbol.
 * @param creator the AtomicSymbolCreator.
 * @param name The returned name of the creator.
 * @param description The returned description of the symbol.
 * @param num_args Number of arguments.
 * @param arg_names Name of the arguments.
 * @param arg_type_infos Type informations about the arguments.
 * @param arg_descriptions Description information about the arguments.
 * @param key_var_num_args The keyword argument for specifying variable number of arguments.
 *            When this parameter has non-zero length, the function allows variable number
 *            of positional arguments, and will need the caller to pass it in in
 *            MXSymbolCreateAtomicSymbol,
 *            With key = key_var_num_args, and value = number of positional arguments.
 * @param return_type Return type of the function, can be Symbol or Symbol[]
 * @return 0 when success, -1 when failure happens
 */
public static native int MXSymbolGetAtomicSymbolInfo(AtomicSymbolCreator creator,
                                          @Cast("const char**") PointerPointer name,
                                          @Cast("const char**") PointerPointer description,
                                          @Cast("mx_uint*") IntPointer num_args,
                                          @Cast("const char***") PointerPointer arg_names,
                                          @Cast("const char***") PointerPointer arg_type_infos,
                                          @Cast("const char***") PointerPointer arg_descriptions,
                                          @Cast("const char**") PointerPointer key_var_num_args,
                                          @Cast("const char**") PointerPointer return_type/*=NULL*/);
public static native int MXSymbolGetAtomicSymbolInfo(AtomicSymbolCreator creator,
                                          @Cast("const char**") @ByPtrPtr BytePointer name,
                                          @Cast("const char**") @ByPtrPtr BytePointer description,
                                          @Cast("mx_uint*") IntPointer num_args,
                                          @Cast("const char***") PointerPointer arg_names,
                                          @Cast("const char***") PointerPointer arg_type_infos,
                                          @Cast("const char***") PointerPointer arg_descriptions,
                                          @Cast("const char**") @ByPtrPtr BytePointer key_var_num_args);
public static native int MXSymbolGetAtomicSymbolInfo(AtomicSymbolCreator creator,
                                          @Cast("const char**") @ByPtrPtr BytePointer name,
                                          @Cast("const char**") @ByPtrPtr BytePointer description,
                                          @Cast("mx_uint*") IntPointer num_args,
                                          @Cast("const char***") PointerPointer arg_names,
                                          @Cast("const char***") PointerPointer arg_type_infos,
                                          @Cast("const char***") PointerPointer arg_descriptions,
                                          @Cast("const char**") @ByPtrPtr BytePointer key_var_num_args,
                                          @Cast("const char**") @ByPtrPtr BytePointer return_type/*=NULL*/);
public static native int MXSymbolGetAtomicSymbolInfo(AtomicSymbolCreator creator,
                                          @Cast("const char**") @ByPtrPtr ByteBuffer name,
                                          @Cast("const char**") @ByPtrPtr ByteBuffer description,
                                          @Cast("mx_uint*") IntBuffer num_args,
                                          @Cast("const char***") PointerPointer arg_names,
                                          @Cast("const char***") PointerPointer arg_type_infos,
                                          @Cast("const char***") PointerPointer arg_descriptions,
                                          @Cast("const char**") @ByPtrPtr ByteBuffer key_var_num_args,
                                          @Cast("const char**") @ByPtrPtr ByteBuffer return_type/*=NULL*/);
public static native int MXSymbolGetAtomicSymbolInfo(AtomicSymbolCreator creator,
                                          @Cast("const char**") @ByPtrPtr ByteBuffer name,
                                          @Cast("const char**") @ByPtrPtr ByteBuffer description,
                                          @Cast("mx_uint*") IntBuffer num_args,
                                          @Cast("const char***") PointerPointer arg_names,
                                          @Cast("const char***") PointerPointer arg_type_infos,
                                          @Cast("const char***") PointerPointer arg_descriptions,
                                          @Cast("const char**") @ByPtrPtr ByteBuffer key_var_num_args);
public static native int MXSymbolGetAtomicSymbolInfo(AtomicSymbolCreator creator,
                                          @Cast("const char**") @ByPtrPtr byte[] name,
                                          @Cast("const char**") @ByPtrPtr byte[] description,
                                          @Cast("mx_uint*") int[] num_args,
                                          @Cast("const char***") PointerPointer arg_names,
                                          @Cast("const char***") PointerPointer arg_type_infos,
                                          @Cast("const char***") PointerPointer arg_descriptions,
                                          @Cast("const char**") @ByPtrPtr byte[] key_var_num_args,
                                          @Cast("const char**") @ByPtrPtr byte[] return_type/*=NULL*/);
public static native int MXSymbolGetAtomicSymbolInfo(AtomicSymbolCreator creator,
                                          @Cast("const char**") @ByPtrPtr byte[] name,
                                          @Cast("const char**") @ByPtrPtr byte[] description,
                                          @Cast("mx_uint*") int[] num_args,
                                          @Cast("const char***") PointerPointer arg_names,
                                          @Cast("const char***") PointerPointer arg_type_infos,
                                          @Cast("const char***") PointerPointer arg_descriptions,
                                          @Cast("const char**") @ByPtrPtr byte[] key_var_num_args);
/**
 * \brief Create an AtomicSymbol.
 * @param creator the AtomicSymbolCreator
 * @param num_param the number of parameters
 * @param keys the keys to the params
 * @param vals the vals of the params
 * @param out pointer to the created symbol handle
 * @return 0 when success, -1 when failure happens
 */
public static native int MXSymbolCreateAtomicSymbol(AtomicSymbolCreator creator,
                                         @Cast("mx_uint") int num_param,
                                         @Cast("const char**") PointerPointer keys,
                                         @Cast("const char**") PointerPointer vals,
                                         PointerPointer out);
public static native int MXSymbolCreateAtomicSymbol(AtomicSymbolCreator creator,
                                         @Cast("mx_uint") int num_param,
                                         @Cast("const char**") @ByPtrPtr BytePointer keys,
                                         @Cast("const char**") @ByPtrPtr BytePointer vals,
                                         PointerPointer out);
public static native int MXSymbolCreateAtomicSymbol(AtomicSymbolCreator creator,
                                         @Cast("mx_uint") int num_param,
                                         @Cast("const char**") @ByPtrPtr ByteBuffer keys,
                                         @Cast("const char**") @ByPtrPtr ByteBuffer vals,
                                         PointerPointer out);
public static native int MXSymbolCreateAtomicSymbol(AtomicSymbolCreator creator,
                                         @Cast("mx_uint") int num_param,
                                         @Cast("const char**") @ByPtrPtr byte[] keys,
                                         @Cast("const char**") @ByPtrPtr byte[] vals,
                                         PointerPointer out);
/**
 * \brief Create a Variable Symbol.
 * @param name name of the variable
 * @param out pointer to the created symbol handle
 * @return 0 when success, -1 when failure happens
 */
public static native int MXSymbolCreateVariable(@Cast("const char*") BytePointer name, PointerPointer out);
public static native int MXSymbolCreateVariable(String name, PointerPointer out);
/**
 * \brief Create a Symbol by grouping list of symbols together
 * @param num_symbols number of symbols to be grouped
 * @param symbols array of symbol handles
 * @param out pointer to the created symbol handle
 * @return 0 when success, -1 when failure happens
 */
public static native int MXSymbolCreateGroup(@Cast("mx_uint") int num_symbols,
                                  PointerPointer symbols,
                                  PointerPointer out);
/**
 * \brief Load a symbol from a json file.
 * @param fname the file name.
 * @param out the output symbol.
 * @return 0 when success, -1 when failure happens
 */
public static native int MXSymbolCreateFromFile(@Cast("const char*") BytePointer fname, PointerPointer out);
public static native int MXSymbolCreateFromFile(String fname, PointerPointer out);
/**
 * \brief Load a symbol from a json string.
 * @param json the json string.
 * @param out the output symbol.
 * @return 0 when success, -1 when failure happens
 */
public static native int MXSymbolCreateFromJSON(@Cast("const char*") BytePointer json, PointerPointer out);
public static native int MXSymbolCreateFromJSON(String json, PointerPointer out);
/**
 * \brief Save a symbol into a json file.
 * @param symbol the input symbol.
 * @param fname the file name.
 * @return 0 when success, -1 when failure happens
 */
public static native int MXSymbolSaveToFile(SymbolHandle symbol, @Cast("const char*") BytePointer fname);
public static native int MXSymbolSaveToFile(SymbolHandle symbol, String fname);
/**
 * \brief Save a symbol into a json string
 * @param symbol the input symbol.
 * @param out_json output json string.
 * @return 0 when success, -1 when failure happens
 */
public static native int MXSymbolSaveToJSON(SymbolHandle symbol, @Cast("const char**") PointerPointer out_json);
public static native int MXSymbolSaveToJSON(SymbolHandle symbol, @Cast("const char**") @ByPtrPtr BytePointer out_json);
public static native int MXSymbolSaveToJSON(SymbolHandle symbol, @Cast("const char**") @ByPtrPtr ByteBuffer out_json);
public static native int MXSymbolSaveToJSON(SymbolHandle symbol, @Cast("const char**") @ByPtrPtr byte[] out_json);
/**
 * \brief Free the symbol handle.
 * @param symbol the symbol
 * @return 0 when success, -1 when failure happens
 */
public static native int MXSymbolFree(SymbolHandle symbol);
/**
 * \brief Copy the symbol to another handle
 * @param symbol the source symbol
 * @param out used to hold the result of copy
 * @return 0 when success, -1 when failure happens
 */
public static native int MXSymbolCopy(SymbolHandle symbol, PointerPointer out);
/**
 * \brief Print the content of symbol, used for debug.
 * @param symbol the symbol
 * @param out_str pointer to hold the output string of the printing.
 * @return 0 when success, -1 when failure happens
 */
public static native int MXSymbolPrint(SymbolHandle symbol, @Cast("const char**") PointerPointer out_str);
public static native int MXSymbolPrint(SymbolHandle symbol, @Cast("const char**") @ByPtrPtr BytePointer out_str);
public static native int MXSymbolPrint(SymbolHandle symbol, @Cast("const char**") @ByPtrPtr ByteBuffer out_str);
public static native int MXSymbolPrint(SymbolHandle symbol, @Cast("const char**") @ByPtrPtr byte[] out_str);
/**
 * \brief Get string attribute from symbol
 * @param symbol the source symbol
 * @param key The key of the symbol.
 * @param out The result attribute, can be NULL if the attribute do not exist.
 * @param success Whether the result is contained in out.
 * @return 0 when success, -1 when failure happens
 */
public static native int MXSymbolGetAttr(SymbolHandle symbol,
                              @Cast("const char*") BytePointer key,
                              @Cast("const char**") PointerPointer out,
                              IntPointer success);
public static native int MXSymbolGetAttr(SymbolHandle symbol,
                              @Cast("const char*") BytePointer key,
                              @Cast("const char**") @ByPtrPtr BytePointer out,
                              IntPointer success);
public static native int MXSymbolGetAttr(SymbolHandle symbol,
                              String key,
                              @Cast("const char**") @ByPtrPtr ByteBuffer out,
                              IntBuffer success);
public static native int MXSymbolGetAttr(SymbolHandle symbol,
                              @Cast("const char*") BytePointer key,
                              @Cast("const char**") @ByPtrPtr byte[] out,
                              int[] success);
public static native int MXSymbolGetAttr(SymbolHandle symbol,
                              String key,
                              @Cast("const char**") @ByPtrPtr BytePointer out,
                              IntPointer success);
public static native int MXSymbolGetAttr(SymbolHandle symbol,
                              @Cast("const char*") BytePointer key,
                              @Cast("const char**") @ByPtrPtr ByteBuffer out,
                              IntBuffer success);
public static native int MXSymbolGetAttr(SymbolHandle symbol,
                              String key,
                              @Cast("const char**") @ByPtrPtr byte[] out,
                              int[] success);
/**
 * \brief Set string attribute from symbol.
 *  NOTE: Setting attribute to a symbol can affect the semantics(mutable/immutable) of symbolic graph.
 *
 *  Safe recommendaton: use  immutable graph
 *  - Only allow set attributes during creation of new symbol as optional parameter
 *
 *  Mutable graph (be careful about the semantics):
 *  - Allow set attr at any point.
 *  - Mutating an attribute of some common node of two graphs can cause confusion from user.
 *
 * @param symbol the source symbol
 * @param key The key of the symbol.
 * @param value The value to be saved.
 * @return 0 when success, -1 when failure happens
 */
public static native int MXSymbolSetAttr(SymbolHandle symbol,
                              @Cast("const char*") BytePointer key,
                              @Cast("const char*") BytePointer value);
public static native int MXSymbolSetAttr(SymbolHandle symbol,
                              String key,
                              String value);
/**
 * \brief List arguments in the symbol.
 * @param symbol the symbol
 * @param out_size output size
 * @param out_str_array pointer to hold the output string array
 * @return 0 when success, -1 when failure happens
 */
public static native int MXSymbolListArguments(SymbolHandle symbol,
                                    @Cast("mx_uint*") IntPointer out_size,
                                    @Cast("const char***") PointerPointer out_str_array);
public static native int MXSymbolListArguments(SymbolHandle symbol,
                                    @Cast("mx_uint*") IntBuffer out_size,
                                    @Cast("const char***") PointerPointer out_str_array);
public static native int MXSymbolListArguments(SymbolHandle symbol,
                                    @Cast("mx_uint*") int[] out_size,
                                    @Cast("const char***") PointerPointer out_str_array);
/**
 * \brief List returns in the symbol.
 * @param symbol the symbol
 * @param out_size output size
 * @param out_str_array pointer to hold the output string array
 * @return 0 when success, -1 when failure happens
 */
public static native int MXSymbolListOutputs(SymbolHandle symbol,
                                  @Cast("mx_uint*") IntPointer out_size,
                                  @Cast("const char***") PointerPointer out_str_array);
public static native int MXSymbolListOutputs(SymbolHandle symbol,
                                  @Cast("mx_uint*") IntBuffer out_size,
                                  @Cast("const char***") PointerPointer out_str_array);
public static native int MXSymbolListOutputs(SymbolHandle symbol,
                                  @Cast("mx_uint*") int[] out_size,
                                  @Cast("const char***") PointerPointer out_str_array);
/**
 * \brief Get a symbol that contains all the internals.
 * @param symbol The symbol
 * @param out The output symbol whose outputs are all the internals.
 * @return 0 when success, -1 when failure happens
 */
public static native int MXSymbolGetInternals(SymbolHandle symbol,
                                   PointerPointer out);
/**
 * \brief Get index-th outputs of the symbol.
 * @param symbol The symbol
 * @param index the Index of the output.
 * @param out The output symbol whose outputs are the index-th symbol.
 * @return 0 when success, -1 when failure happens
 */
public static native int MXSymbolGetOutput(SymbolHandle symbol,
                                @Cast("mx_uint") int index,
                                PointerPointer out);
/**
 * \brief List auxiliary states in the symbol.
 * @param symbol the symbol
 * @param out_size output size
 * @param out_str_array pointer to hold the output string array
 * @return 0 when success, -1 when failure happens
 */
public static native int MXSymbolListAuxiliaryStates(SymbolHandle symbol,
                                          @Cast("mx_uint*") IntPointer out_size,
                                          @Cast("const char***") PointerPointer out_str_array);
public static native int MXSymbolListAuxiliaryStates(SymbolHandle symbol,
                                          @Cast("mx_uint*") IntBuffer out_size,
                                          @Cast("const char***") PointerPointer out_str_array);
public static native int MXSymbolListAuxiliaryStates(SymbolHandle symbol,
                                          @Cast("mx_uint*") int[] out_size,
                                          @Cast("const char***") PointerPointer out_str_array);
/**
 * \brief Compose the symbol on other symbols.
 *
 *  This function will change the sym hanlde.
 *  To achieve function apply behavior, copy the symbol first
 *  before apply.
 *
 * @param sym the symbol to apply
 * @param name the name of symbol
 * @param num_args number of arguments
 * @param keys the key of keyword args (optional)
 * @param args arguments to sym
 * @return 0 when success, -1 when failure happens
 */
public static native int MXSymbolCompose(SymbolHandle sym,
                              @Cast("const char*") BytePointer name,
                              @Cast("mx_uint") int num_args,
                              @Cast("const char**") PointerPointer keys,
                              PointerPointer args);
public static native int MXSymbolCompose(SymbolHandle sym,
                              @Cast("const char*") BytePointer name,
                              @Cast("mx_uint") int num_args,
                              @Cast("const char**") @ByPtrPtr BytePointer keys,
                              PointerPointer args);
public static native int MXSymbolCompose(SymbolHandle sym,
                              String name,
                              @Cast("mx_uint") int num_args,
                              @Cast("const char**") @ByPtrPtr ByteBuffer keys,
                              PointerPointer args);
public static native int MXSymbolCompose(SymbolHandle sym,
                              @Cast("const char*") BytePointer name,
                              @Cast("mx_uint") int num_args,
                              @Cast("const char**") @ByPtrPtr byte[] keys,
                              PointerPointer args);
public static native int MXSymbolCompose(SymbolHandle sym,
                              String name,
                              @Cast("mx_uint") int num_args,
                              @Cast("const char**") @ByPtrPtr BytePointer keys,
                              PointerPointer args);
public static native int MXSymbolCompose(SymbolHandle sym,
                              @Cast("const char*") BytePointer name,
                              @Cast("mx_uint") int num_args,
                              @Cast("const char**") @ByPtrPtr ByteBuffer keys,
                              PointerPointer args);
public static native int MXSymbolCompose(SymbolHandle sym,
                              String name,
                              @Cast("mx_uint") int num_args,
                              @Cast("const char**") @ByPtrPtr byte[] keys,
                              PointerPointer args);
/**
 * \brief Get the gradient graph of the symbol
 *
 * @param sym the symbol to get gradient
 * @param num_wrt number of arguments to get gradient
 * @param wrt the name of the arguments to get gradient
 * @param out the returned symbol that has gradient
 * @return 0 when success, -1 when failure happens
 */
public static native int MXSymbolGrad(SymbolHandle sym,
                           @Cast("mx_uint") int num_wrt,
                           @Cast("const char**") PointerPointer wrt,
                           PointerPointer out);
public static native int MXSymbolGrad(SymbolHandle sym,
                           @Cast("mx_uint") int num_wrt,
                           @Cast("const char**") @ByPtrPtr BytePointer wrt,
                           PointerPointer out);
public static native int MXSymbolGrad(SymbolHandle sym,
                           @Cast("mx_uint") int num_wrt,
                           @Cast("const char**") @ByPtrPtr ByteBuffer wrt,
                           PointerPointer out);
public static native int MXSymbolGrad(SymbolHandle sym,
                           @Cast("mx_uint") int num_wrt,
                           @Cast("const char**") @ByPtrPtr byte[] wrt,
                           PointerPointer out);
/**
 * \brief infer shape of unknown input shapes given the known one.
 *  The shapes are packed into a CSR matrix represented by arg_ind_ptr and arg_shape_data
 *  The call will be treated as a kwargs call if key != nullptr or num_args==0, otherwise it is positional.
 *
 * @param sym symbol handle
 * @param num_args numbe of input arguments.
 * @param keys the key of keyword args (optional)
 * @param arg_ind_ptr the head pointer of the rows in CSR
 * @param arg_shape_data the content of the CSR
 * @param in_shape_size sizeof the returning array of in_shapes
 * @param in_shape_ndim returning array of shape dimensions of eachs input shape.
 * @param in_shape_data returning array of pointers to head of the input shape.
 * @param out_shape_size sizeof the returning array of out_shapes
 * @param out_shape_ndim returning array of shape dimensions of eachs input shape.
 * @param out_shape_data returning array of pointers to head of the input shape.
 * @param aux_shape_size sizeof the returning array of aux_shapes
 * @param aux_shape_ndim returning array of shape dimensions of eachs auxiliary shape.
 * @param aux_shape_data returning array of pointers to head of the auxiliary shape.
 * @param complete whether infer shape completes or more information is needed.
 * @return 0 when success, -1 when failure happens
 */
public static native int MXSymbolInferShape(SymbolHandle sym,
                                 @Cast("mx_uint") int num_args,
                                 @Cast("const char**") PointerPointer keys,
                                 @Cast("const mx_uint*") IntPointer arg_ind_ptr,
                                 @Cast("const mx_uint*") IntPointer arg_shape_data,
                                 @Cast("mx_uint*") IntPointer in_shape_size,
                                 @Cast("const mx_uint**") PointerPointer in_shape_ndim,
                                 @Cast("const mx_uint***") PointerPointer in_shape_data,
                                 @Cast("mx_uint*") IntPointer out_shape_size,
                                 @Cast("const mx_uint**") PointerPointer out_shape_ndim,
                                 @Cast("const mx_uint***") PointerPointer out_shape_data,
                                 @Cast("mx_uint*") IntPointer aux_shape_size,
                                 @Cast("const mx_uint**") PointerPointer aux_shape_ndim,
                                 @Cast("const mx_uint***") PointerPointer aux_shape_data,
                                 IntPointer complete);
public static native int MXSymbolInferShape(SymbolHandle sym,
                                 @Cast("mx_uint") int num_args,
                                 @Cast("const char**") @ByPtrPtr BytePointer keys,
                                 @Cast("const mx_uint*") IntPointer arg_ind_ptr,
                                 @Cast("const mx_uint*") IntPointer arg_shape_data,
                                 @Cast("mx_uint*") IntPointer in_shape_size,
                                 @Cast("const mx_uint**") @ByPtrPtr IntPointer in_shape_ndim,
                                 @Cast("const mx_uint***") PointerPointer in_shape_data,
                                 @Cast("mx_uint*") IntPointer out_shape_size,
                                 @Cast("const mx_uint**") @ByPtrPtr IntPointer out_shape_ndim,
                                 @Cast("const mx_uint***") PointerPointer out_shape_data,
                                 @Cast("mx_uint*") IntPointer aux_shape_size,
                                 @Cast("const mx_uint**") @ByPtrPtr IntPointer aux_shape_ndim,
                                 @Cast("const mx_uint***") PointerPointer aux_shape_data,
                                 IntPointer complete);
public static native int MXSymbolInferShape(SymbolHandle sym,
                                 @Cast("mx_uint") int num_args,
                                 @Cast("const char**") @ByPtrPtr ByteBuffer keys,
                                 @Cast("const mx_uint*") IntBuffer arg_ind_ptr,
                                 @Cast("const mx_uint*") IntBuffer arg_shape_data,
                                 @Cast("mx_uint*") IntBuffer in_shape_size,
                                 @Cast("const mx_uint**") @ByPtrPtr IntBuffer in_shape_ndim,
                                 @Cast("const mx_uint***") PointerPointer in_shape_data,
                                 @Cast("mx_uint*") IntBuffer out_shape_size,
                                 @Cast("const mx_uint**") @ByPtrPtr IntBuffer out_shape_ndim,
                                 @Cast("const mx_uint***") PointerPointer out_shape_data,
                                 @Cast("mx_uint*") IntBuffer aux_shape_size,
                                 @Cast("const mx_uint**") @ByPtrPtr IntBuffer aux_shape_ndim,
                                 @Cast("const mx_uint***") PointerPointer aux_shape_data,
                                 IntBuffer complete);
public static native int MXSymbolInferShape(SymbolHandle sym,
                                 @Cast("mx_uint") int num_args,
                                 @Cast("const char**") @ByPtrPtr byte[] keys,
                                 @Cast("const mx_uint*") int[] arg_ind_ptr,
                                 @Cast("const mx_uint*") int[] arg_shape_data,
                                 @Cast("mx_uint*") int[] in_shape_size,
                                 @Cast("const mx_uint**") @ByPtrPtr int[] in_shape_ndim,
                                 @Cast("const mx_uint***") PointerPointer in_shape_data,
                                 @Cast("mx_uint*") int[] out_shape_size,
                                 @Cast("const mx_uint**") @ByPtrPtr int[] out_shape_ndim,
                                 @Cast("const mx_uint***") PointerPointer out_shape_data,
                                 @Cast("mx_uint*") int[] aux_shape_size,
                                 @Cast("const mx_uint**") @ByPtrPtr int[] aux_shape_ndim,
                                 @Cast("const mx_uint***") PointerPointer aux_shape_data,
                                 int[] complete);
/**
 * \brief partially infer shape of unknown input shapes given the known one.
 *
 *  Return partially inferred results if not all shapes could be inferred.
 *  The shapes are packed into a CSR matrix represented by arg_ind_ptr and arg_shape_data
 *  The call will be treated as a kwargs call if key != nullptr or num_args==0, otherwise it is positional.
 *
 * @param sym symbol handle
 * @param num_args numbe of input arguments.
 * @param keys the key of keyword args (optional)
 * @param arg_ind_ptr the head pointer of the rows in CSR
 * @param arg_shape_data the content of the CSR
 * @param in_shape_size sizeof the returning array of in_shapes
 * @param in_shape_ndim returning array of shape dimensions of eachs input shape.
 * @param in_shape_data returning array of pointers to head of the input shape.
 * @param out_shape_size sizeof the returning array of out_shapes
 * @param out_shape_ndim returning array of shape dimensions of eachs input shape.
 * @param out_shape_data returning array of pointers to head of the input shape.
 * @param aux_shape_size sizeof the returning array of aux_shapes
 * @param aux_shape_ndim returning array of shape dimensions of eachs auxiliary shape.
 * @param aux_shape_data returning array of pointers to head of the auxiliary shape.
 * @param complete whether infer shape completes or more information is needed.
 * @return 0 when success, -1 when failure happens
 */
public static native int MXSymbolInferShapePartial(SymbolHandle sym,
                                 @Cast("mx_uint") int num_args,
                                 @Cast("const char**") PointerPointer keys,
                                 @Cast("const mx_uint*") IntPointer arg_ind_ptr,
                                 @Cast("const mx_uint*") IntPointer arg_shape_data,
                                 @Cast("mx_uint*") IntPointer in_shape_size,
                                 @Cast("const mx_uint**") PointerPointer in_shape_ndim,
                                 @Cast("const mx_uint***") PointerPointer in_shape_data,
                                 @Cast("mx_uint*") IntPointer out_shape_size,
                                 @Cast("const mx_uint**") PointerPointer out_shape_ndim,
                                 @Cast("const mx_uint***") PointerPointer out_shape_data,
                                 @Cast("mx_uint*") IntPointer aux_shape_size,
                                 @Cast("const mx_uint**") PointerPointer aux_shape_ndim,
                                 @Cast("const mx_uint***") PointerPointer aux_shape_data,
                                 IntPointer complete);
public static native int MXSymbolInferShapePartial(SymbolHandle sym,
                                 @Cast("mx_uint") int num_args,
                                 @Cast("const char**") @ByPtrPtr BytePointer keys,
                                 @Cast("const mx_uint*") IntPointer arg_ind_ptr,
                                 @Cast("const mx_uint*") IntPointer arg_shape_data,
                                 @Cast("mx_uint*") IntPointer in_shape_size,
                                 @Cast("const mx_uint**") @ByPtrPtr IntPointer in_shape_ndim,
                                 @Cast("const mx_uint***") PointerPointer in_shape_data,
                                 @Cast("mx_uint*") IntPointer out_shape_size,
                                 @Cast("const mx_uint**") @ByPtrPtr IntPointer out_shape_ndim,
                                 @Cast("const mx_uint***") PointerPointer out_shape_data,
                                 @Cast("mx_uint*") IntPointer aux_shape_size,
                                 @Cast("const mx_uint**") @ByPtrPtr IntPointer aux_shape_ndim,
                                 @Cast("const mx_uint***") PointerPointer aux_shape_data,
                                 IntPointer complete);
public static native int MXSymbolInferShapePartial(SymbolHandle sym,
                                 @Cast("mx_uint") int num_args,
                                 @Cast("const char**") @ByPtrPtr ByteBuffer keys,
                                 @Cast("const mx_uint*") IntBuffer arg_ind_ptr,
                                 @Cast("const mx_uint*") IntBuffer arg_shape_data,
                                 @Cast("mx_uint*") IntBuffer in_shape_size,
                                 @Cast("const mx_uint**") @ByPtrPtr IntBuffer in_shape_ndim,
                                 @Cast("const mx_uint***") PointerPointer in_shape_data,
                                 @Cast("mx_uint*") IntBuffer out_shape_size,
                                 @Cast("const mx_uint**") @ByPtrPtr IntBuffer out_shape_ndim,
                                 @Cast("const mx_uint***") PointerPointer out_shape_data,
                                 @Cast("mx_uint*") IntBuffer aux_shape_size,
                                 @Cast("const mx_uint**") @ByPtrPtr IntBuffer aux_shape_ndim,
                                 @Cast("const mx_uint***") PointerPointer aux_shape_data,
                                 IntBuffer complete);
public static native int MXSymbolInferShapePartial(SymbolHandle sym,
                                 @Cast("mx_uint") int num_args,
                                 @Cast("const char**") @ByPtrPtr byte[] keys,
                                 @Cast("const mx_uint*") int[] arg_ind_ptr,
                                 @Cast("const mx_uint*") int[] arg_shape_data,
                                 @Cast("mx_uint*") int[] in_shape_size,
                                 @Cast("const mx_uint**") @ByPtrPtr int[] in_shape_ndim,
                                 @Cast("const mx_uint***") PointerPointer in_shape_data,
                                 @Cast("mx_uint*") int[] out_shape_size,
                                 @Cast("const mx_uint**") @ByPtrPtr int[] out_shape_ndim,
                                 @Cast("const mx_uint***") PointerPointer out_shape_data,
                                 @Cast("mx_uint*") int[] aux_shape_size,
                                 @Cast("const mx_uint**") @ByPtrPtr int[] aux_shape_ndim,
                                 @Cast("const mx_uint***") PointerPointer aux_shape_data,
                                 int[] complete);

/**
 * \brief infer type of unknown input types given the known one.
 *  The types are packed into a CSR matrix represented by arg_ind_ptr and arg_type_data
 *  The call will be treated as a kwargs call if key != nullptr or num_args==0, otherwise it is positional.
 *
 * @param sym symbol handle
 * @param num_args numbe of input arguments.
 * @param keys the key of keyword args (optional)
 * @param arg_type_data the content of the CSR
 * @param in_type_size sizeof the returning array of in_types
 * @param in_type_data returning array of pointers to head of the input type.
 * @param out_type_size sizeof the returning array of out_types
 * @param out_type_data returning array of pointers to head of the input type.
 * @param aux_type_size sizeof the returning array of aux_types
 * @param aux_type_data returning array of pointers to head of the auxiliary type.
 * @param complete whether infer type completes or more information is needed.
 * @return 0 when success, -1 when failure happens
 */
public static native int MXSymbolInferType(SymbolHandle sym,
                                @Cast("mx_uint") int num_args,
                                @Cast("const char**") PointerPointer keys,
                                @Const IntPointer arg_type_data,
                                @Cast("mx_uint*") IntPointer in_type_size,
                                @Cast("const int**") PointerPointer in_type_data,
                                @Cast("mx_uint*") IntPointer out_type_size,
                                @Cast("const int**") PointerPointer out_type_data,
                                @Cast("mx_uint*") IntPointer aux_type_size,
                                @Cast("const int**") PointerPointer aux_type_data,
                                IntPointer complete);
public static native int MXSymbolInferType(SymbolHandle sym,
                                @Cast("mx_uint") int num_args,
                                @Cast("const char**") @ByPtrPtr BytePointer keys,
                                @Const IntPointer arg_type_data,
                                @Cast("mx_uint*") IntPointer in_type_size,
                                @Const @ByPtrPtr IntPointer in_type_data,
                                @Cast("mx_uint*") IntPointer out_type_size,
                                @Const @ByPtrPtr IntPointer out_type_data,
                                @Cast("mx_uint*") IntPointer aux_type_size,
                                @Const @ByPtrPtr IntPointer aux_type_data,
                                IntPointer complete);
public static native int MXSymbolInferType(SymbolHandle sym,
                                @Cast("mx_uint") int num_args,
                                @Cast("const char**") @ByPtrPtr ByteBuffer keys,
                                @Const IntBuffer arg_type_data,
                                @Cast("mx_uint*") IntBuffer in_type_size,
                                @Const @ByPtrPtr IntBuffer in_type_data,
                                @Cast("mx_uint*") IntBuffer out_type_size,
                                @Const @ByPtrPtr IntBuffer out_type_data,
                                @Cast("mx_uint*") IntBuffer aux_type_size,
                                @Const @ByPtrPtr IntBuffer aux_type_data,
                                IntBuffer complete);
public static native int MXSymbolInferType(SymbolHandle sym,
                                @Cast("mx_uint") int num_args,
                                @Cast("const char**") @ByPtrPtr byte[] keys,
                                @Const int[] arg_type_data,
                                @Cast("mx_uint*") int[] in_type_size,
                                @Const @ByPtrPtr int[] in_type_data,
                                @Cast("mx_uint*") int[] out_type_size,
                                @Const @ByPtrPtr int[] out_type_data,
                                @Cast("mx_uint*") int[] aux_type_size,
                                @Const @ByPtrPtr int[] aux_type_data,
                                int[] complete);
//--------------------------------------------
// Part 4: Executor interface
//--------------------------------------------
/**
 * \brief Delete the executor
 * @param handle the executor.
 * @return 0 when success, -1 when failure happens
 */
public static native int MXExecutorFree(ExecutorHandle handle);
/**
 * \brief Print the content of execution plan, used for debug.
 * @param handle the executor.
 * @param out_str pointer to hold the output string of the printing.
 * @return 0 when success, -1 when failure happens
 */
public static native int MXExecutorPrint(ExecutorHandle handle, @Cast("const char**") PointerPointer out_str);
public static native int MXExecutorPrint(ExecutorHandle handle, @Cast("const char**") @ByPtrPtr BytePointer out_str);
public static native int MXExecutorPrint(ExecutorHandle handle, @Cast("const char**") @ByPtrPtr ByteBuffer out_str);
public static native int MXExecutorPrint(ExecutorHandle handle, @Cast("const char**") @ByPtrPtr byte[] out_str);
/**
 * \brief Executor forward method
 *
 * @param handle executor handle
 * @param is_train bool value to indicate whether the forward pass is for evaluation
 * @return 0 when success, -1 when failure happens
 */
public static native int MXExecutorForward(ExecutorHandle handle, int is_train);
/**
 * \brief Excecutor run backward
 *
 * @param handle execute handle
 * @param len lenth
 * @param head_grads NDArray handle for heads' gradient
 *
 * @return 0 when success, -1 when failure happens
 */
public static native int MXExecutorBackward(ExecutorHandle handle,
                                 @Cast("mx_uint") int len,
                                 PointerPointer head_grads);

/**
 * \brief Get executor's head NDArray
 *
 * @param handle executor handle
 * @param out_size output narray vector size
 * @param out out put narray handles
 * @return 0 when success, -1 when failure happens
 */
public static native int MXExecutorOutputs(ExecutorHandle handle,
                                @Cast("mx_uint*") IntPointer out_size,
                                @Cast("NDArrayHandle**") PointerPointer out);
public static native int MXExecutorOutputs(ExecutorHandle handle,
                                @Cast("mx_uint*") IntBuffer out_size,
                                @ByPtrPtr PointerPointer out);
public static native int MXExecutorOutputs(ExecutorHandle handle,
                                @Cast("mx_uint*") int[] out_size,
                                @ByPtrPtr PointerPointer out);

/**
 * \brief Generate Executor from symbol
 *
 * @param symbol_handle symbol handle
 * @param dev_type device type
 * @param dev_id device id
 * @param len length
 * @param in_args in args array
 * @param arg_grad_store arg grads handle array
 * @param grad_req_type grad req array
 * @param aux_states_len length of auxiliary states
 * @param aux_states auxiliary states array
 * @param out output executor handle
 * @return 0 when success, -1 when failure happens
 */
public static native int MXExecutorBind(SymbolHandle symbol_handle,
                             int dev_type,
                             int dev_id,
                             @Cast("mx_uint") int len,
                             PointerPointer in_args,
                             PointerPointer arg_grad_store,
                             @Cast("mx_uint*") IntPointer grad_req_type,
                             @Cast("mx_uint") int aux_states_len,
                             PointerPointer aux_states,
                             PointerPointer out);
public static native int MXExecutorBind(SymbolHandle symbol_handle,
                             int dev_type,
                             int dev_id,
                             @Cast("mx_uint") int len,
                             PointerPointer in_args,
                             PointerPointer arg_grad_store,
                             @Cast("mx_uint*") IntBuffer grad_req_type,
                             @Cast("mx_uint") int aux_states_len,
                             PointerPointer aux_states,
                             PointerPointer out);
public static native int MXExecutorBind(SymbolHandle symbol_handle,
                             int dev_type,
                             int dev_id,
                             @Cast("mx_uint") int len,
                             PointerPointer in_args,
                             PointerPointer arg_grad_store,
                             @Cast("mx_uint*") int[] grad_req_type,
                             @Cast("mx_uint") int aux_states_len,
                             PointerPointer aux_states,
                             PointerPointer out);
/**
 * \brief Generate Executor from symbol,
 *  This is advanced function, allow specify group2ctx map.
 *  The user can annotate "ctx_group" attribute to name each group.
 *
 * @param symbol_handle symbol handle
 * @param dev_type device type of default context
 * @param dev_id device id of default context
 * @param num_map_keys size of group2ctx map
 * @param map_keys keys of group2ctx map
 * @param map_dev_types device type of group2ctx map
 * @param map_dev_ids device id of group2ctx map
 * @param len length
 * @param in_args in args array
 * @param arg_grad_store arg grads handle array
 * @param grad_req_type grad req array
 * @param aux_states_len length of auxiliary states
 * @param aux_states auxiliary states array
 * @param out output executor handle
 * @return 0 when success, -1 when failure happens
 */
public static native int MXExecutorBindX(SymbolHandle symbol_handle,
                              int dev_type,
                              int dev_id,
                              @Cast("mx_uint") int num_map_keys,
                              @Cast("const char**") PointerPointer map_keys,
                              @Const IntPointer map_dev_types,
                              @Const IntPointer map_dev_ids,
                              @Cast("mx_uint") int len,
                              PointerPointer in_args,
                              PointerPointer arg_grad_store,
                              @Cast("mx_uint*") IntPointer grad_req_type,
                              @Cast("mx_uint") int aux_states_len,
                              PointerPointer aux_states,
                              PointerPointer out);
public static native int MXExecutorBindX(SymbolHandle symbol_handle,
                              int dev_type,
                              int dev_id,
                              @Cast("mx_uint") int num_map_keys,
                              @Cast("const char**") @ByPtrPtr BytePointer map_keys,
                              @Const IntPointer map_dev_types,
                              @Const IntPointer map_dev_ids,
                              @Cast("mx_uint") int len,
                              PointerPointer in_args,
                              PointerPointer arg_grad_store,
                              @Cast("mx_uint*") IntPointer grad_req_type,
                              @Cast("mx_uint") int aux_states_len,
                              PointerPointer aux_states,
                              PointerPointer out);
public static native int MXExecutorBindX(SymbolHandle symbol_handle,
                              int dev_type,
                              int dev_id,
                              @Cast("mx_uint") int num_map_keys,
                              @Cast("const char**") @ByPtrPtr ByteBuffer map_keys,
                              @Const IntBuffer map_dev_types,
                              @Const IntBuffer map_dev_ids,
                              @Cast("mx_uint") int len,
                              PointerPointer in_args,
                              PointerPointer arg_grad_store,
                              @Cast("mx_uint*") IntBuffer grad_req_type,
                              @Cast("mx_uint") int aux_states_len,
                              PointerPointer aux_states,
                              PointerPointer out);
public static native int MXExecutorBindX(SymbolHandle symbol_handle,
                              int dev_type,
                              int dev_id,
                              @Cast("mx_uint") int num_map_keys,
                              @Cast("const char**") @ByPtrPtr byte[] map_keys,
                              @Const int[] map_dev_types,
                              @Const int[] map_dev_ids,
                              @Cast("mx_uint") int len,
                              PointerPointer in_args,
                              PointerPointer arg_grad_store,
                              @Cast("mx_uint*") int[] grad_req_type,
                              @Cast("mx_uint") int aux_states_len,
                              PointerPointer aux_states,
                              PointerPointer out);
/**
 * \brief Generate Executor from symbol,
 *  This is advanced function, allow specify group2ctx map.
 *  The user can annotate "ctx_group" attribute to name each group.
 *
 * @param symbol_handle symbol handle
 * @param dev_type device type of default context
 * @param dev_id device id of default context
 * @param num_map_keys size of group2ctx map
 * @param map_keys keys of group2ctx map
 * @param map_dev_types device type of group2ctx map
 * @param map_dev_ids device id of group2ctx map
 * @param len length
 * @param in_args in args array
 * @param arg_grad_store arg grads handle array
 * @param grad_req_type grad req array
 * @param aux_states_len length of auxiliary states
 * @param aux_states auxiliary states array
 * @param shared_exec input executor handle for memory sharing
 * @param out output executor handle
 * @return 0 when success, -1 when failure happens
 */
public static native int MXExecutorBindEX(SymbolHandle symbol_handle,
                               int dev_type,
                               int dev_id,
                               @Cast("mx_uint") int num_map_keys,
                               @Cast("const char**") PointerPointer map_keys,
                               @Const IntPointer map_dev_types,
                               @Const IntPointer map_dev_ids,
                               @Cast("mx_uint") int len,
                               PointerPointer in_args,
                               PointerPointer arg_grad_store,
                               @Cast("mx_uint*") IntPointer grad_req_type,
                               @Cast("mx_uint") int aux_states_len,
                               PointerPointer aux_states,
                               PointerPointer shared_exec,
                               PointerPointer out);
public static native int MXExecutorBindEX(SymbolHandle symbol_handle,
                               int dev_type,
                               int dev_id,
                               @Cast("mx_uint") int num_map_keys,
                               @Cast("const char**") @ByPtrPtr BytePointer map_keys,
                               @Const IntPointer map_dev_types,
                               @Const IntPointer map_dev_ids,
                               @Cast("mx_uint") int len,
                               PointerPointer in_args,
                               PointerPointer arg_grad_store,
                               @Cast("mx_uint*") IntPointer grad_req_type,
                               @Cast("mx_uint") int aux_states_len,
                               PointerPointer aux_states,
                               PointerPointer shared_exec,
                               PointerPointer out);
public static native int MXExecutorBindEX(SymbolHandle symbol_handle,
                               int dev_type,
                               int dev_id,
                               @Cast("mx_uint") int num_map_keys,
                               @Cast("const char**") @ByPtrPtr ByteBuffer map_keys,
                               @Const IntBuffer map_dev_types,
                               @Const IntBuffer map_dev_ids,
                               @Cast("mx_uint") int len,
                               PointerPointer in_args,
                               PointerPointer arg_grad_store,
                               @Cast("mx_uint*") IntBuffer grad_req_type,
                               @Cast("mx_uint") int aux_states_len,
                               PointerPointer aux_states,
                               PointerPointer shared_exec,
                               PointerPointer out);
public static native int MXExecutorBindEX(SymbolHandle symbol_handle,
                               int dev_type,
                               int dev_id,
                               @Cast("mx_uint") int num_map_keys,
                               @Cast("const char**") @ByPtrPtr byte[] map_keys,
                               @Const int[] map_dev_types,
                               @Const int[] map_dev_ids,
                               @Cast("mx_uint") int len,
                               PointerPointer in_args,
                               PointerPointer arg_grad_store,
                               @Cast("mx_uint*") int[] grad_req_type,
                               @Cast("mx_uint") int aux_states_len,
                               PointerPointer aux_states,
                               PointerPointer shared_exec,
                               PointerPointer out);
/**
 * \brief set a call back to notify the completion of operation
 */
public static native int MXExecutorSetMonitorCallback(ExecutorHandle handle,
                                           ExecutorMonitorCallback callback,
                                           Pointer callback_handle);
//--------------------------------------------
// Part 5: IO Interface
//--------------------------------------------
/**
 * \brief List all the available iterator entries
 * @param out_size the size of returned iterators
 * @param out_array the output iteratos entries
 * @return 0 when success, -1 when failure happens
 */
public static native int MXListDataIters(@Cast("mx_uint*") IntPointer out_size,
                              @Cast("DataIterCreator**") PointerPointer out_array);
public static native int MXListDataIters(@Cast("mx_uint*") IntBuffer out_size,
                              @ByPtrPtr PointerPointer out_array);
public static native int MXListDataIters(@Cast("mx_uint*") int[] out_size,
                              @ByPtrPtr PointerPointer out_array);
/**
 * \brief Init an iterator, init with parameters
 * the array size of passed in arguments
 * @param handle of the iterator creator
 * @param num_param number of parameter
 * @param keys parameter keys
 * @param vals parameter values
 * @param out resulting iterator
 * @return 0 when success, -1 when failure happens
 */
public static native int MXDataIterCreateIter(DataIterCreator handle,
                                   @Cast("mx_uint") int num_param,
                                   @Cast("const char**") PointerPointer keys,
                                   @Cast("const char**") PointerPointer vals,
                                   PointerPointer out);
public static native int MXDataIterCreateIter(DataIterCreator handle,
                                   @Cast("mx_uint") int num_param,
                                   @Cast("const char**") @ByPtrPtr BytePointer keys,
                                   @Cast("const char**") @ByPtrPtr BytePointer vals,
                                   PointerPointer out);
public static native int MXDataIterCreateIter(DataIterCreator handle,
                                   @Cast("mx_uint") int num_param,
                                   @Cast("const char**") @ByPtrPtr ByteBuffer keys,
                                   @Cast("const char**") @ByPtrPtr ByteBuffer vals,
                                   PointerPointer out);
public static native int MXDataIterCreateIter(DataIterCreator handle,
                                   @Cast("mx_uint") int num_param,
                                   @Cast("const char**") @ByPtrPtr byte[] keys,
                                   @Cast("const char**") @ByPtrPtr byte[] vals,
                                   PointerPointer out);
/**
 * \brief Get the detailed information about data iterator.
 * @param creator the DataIterCreator.
 * @param name The returned name of the creator.
 * @param description The returned description of the symbol.
 * @param num_args Number of arguments.
 * @param arg_names Name of the arguments.
 * @param arg_type_infos Type informations about the arguments.
 * @param arg_descriptions Description information about the arguments.
 * @return 0 when success, -1 when failure happens
 */
public static native int MXDataIterGetIterInfo(DataIterCreator creator,
                                    @Cast("const char**") PointerPointer name,
                                    @Cast("const char**") PointerPointer description,
                                    @Cast("mx_uint*") IntPointer num_args,
                                    @Cast("const char***") PointerPointer arg_names,
                                    @Cast("const char***") PointerPointer arg_type_infos,
                                    @Cast("const char***") PointerPointer arg_descriptions);
public static native int MXDataIterGetIterInfo(DataIterCreator creator,
                                    @Cast("const char**") @ByPtrPtr BytePointer name,
                                    @Cast("const char**") @ByPtrPtr BytePointer description,
                                    @Cast("mx_uint*") IntPointer num_args,
                                    @Cast("const char***") PointerPointer arg_names,
                                    @Cast("const char***") PointerPointer arg_type_infos,
                                    @Cast("const char***") PointerPointer arg_descriptions);
public static native int MXDataIterGetIterInfo(DataIterCreator creator,
                                    @Cast("const char**") @ByPtrPtr ByteBuffer name,
                                    @Cast("const char**") @ByPtrPtr ByteBuffer description,
                                    @Cast("mx_uint*") IntBuffer num_args,
                                    @Cast("const char***") PointerPointer arg_names,
                                    @Cast("const char***") PointerPointer arg_type_infos,
                                    @Cast("const char***") PointerPointer arg_descriptions);
public static native int MXDataIterGetIterInfo(DataIterCreator creator,
                                    @Cast("const char**") @ByPtrPtr byte[] name,
                                    @Cast("const char**") @ByPtrPtr byte[] description,
                                    @Cast("mx_uint*") int[] num_args,
                                    @Cast("const char***") PointerPointer arg_names,
                                    @Cast("const char***") PointerPointer arg_type_infos,
                                    @Cast("const char***") PointerPointer arg_descriptions);
/**
 * \brief Free the handle to the IO module
 * @param handle the handle pointer to the data iterator
 * @return 0 when success, -1 when failure happens
 */
public static native int MXDataIterFree(DataIterHandle handle);
/**
 * \brief Move iterator to next position
 * @param handle the handle to iterator
 * @param out return value of next
 * @return 0 when success, -1 when failure happens
 */
public static native int MXDataIterNext(DataIterHandle handle,
                             IntPointer out);
public static native int MXDataIterNext(DataIterHandle handle,
                             IntBuffer out);
public static native int MXDataIterNext(DataIterHandle handle,
                             int[] out);
/**
 * \brief Call iterator.Reset
 * @param handle the handle to iterator
 * @return 0 when success, -1 when failure happens
 */
public static native int MXDataIterBeforeFirst(DataIterHandle handle);

/**
 * \brief Get the handle to the NDArray of underlying data
 * @param handle the handle pointer to the data iterator
 * @param out handle to underlying data NDArray
 * @return 0 when success, -1 when failure happens
 */
public static native int MXDataIterGetData(DataIterHandle handle,
                                PointerPointer out);
/**
 * \brief Get the image index by array.
 * @param handle the handle pointer to the data iterator
 * @param out_index output index of the array.
 * @param out_size output size of the array.
 * @return 0 when success, -1 when failure happens
 */
public static native int MXDataIterGetIndex(DataIterHandle handle,
                                 @Cast("uint64_t**") PointerPointer out_index,
                                 @Cast("uint64_t*") LongPointer out_size);
public static native int MXDataIterGetIndex(DataIterHandle handle,
                                 @Cast("uint64_t**") @ByPtrPtr LongPointer out_index,
                                 @Cast("uint64_t*") LongPointer out_size);
public static native int MXDataIterGetIndex(DataIterHandle handle,
                                 @Cast("uint64_t**") @ByPtrPtr LongBuffer out_index,
                                 @Cast("uint64_t*") LongBuffer out_size);
public static native int MXDataIterGetIndex(DataIterHandle handle,
                                 @Cast("uint64_t**") @ByPtrPtr long[] out_index,
                                 @Cast("uint64_t*") long[] out_size);
/**
 * \brief Get the padding number in current data batch
 * @param handle the handle pointer to the data iterator
 * @param pad pad number ptr
 * @return 0 when success, -1 when failure happens
 */
public static native int MXDataIterGetPadNum(DataIterHandle handle,
                                  IntPointer pad);
public static native int MXDataIterGetPadNum(DataIterHandle handle,
                                  IntBuffer pad);
public static native int MXDataIterGetPadNum(DataIterHandle handle,
                                  int[] pad);

/**
 * \brief Get the handle to the NDArray of underlying label
 * @param handle the handle pointer to the data iterator
 * @param out the handle to underlying label NDArray
 * @return 0 when success, -1 when failure happens
 */
public static native int MXDataIterGetLabel(DataIterHandle handle,
                                 PointerPointer out);
//--------------------------------------------
// Part 5: basic KVStore interface
//--------------------------------------------
/**
 * \brief Create a kvstore
 * @param type the type of KVStore
 * @param out The output type of KVStore
 * @return 0 when success, -1 when failure happens
 */
public static native int MXKVStoreCreate(@Cast("const char*") BytePointer type,
                              PointerPointer out);
public static native int MXKVStoreCreate(String type,
                              PointerPointer out);
/**
 * \brief Delete a KVStore handle.
 * @param handle handle to the kvstore
 * @return 0 when success, -1 when failure happens
 */
public static native int MXKVStoreFree(KVStoreHandle handle);
/**
 * \brief Init a list of (key,value) pairs in kvstore
 * @param handle handle to the kvstore
 * @param num the number of key-value pairs
 * @param keys the list of keys
 * @param vals the list of values
 * @return 0 when success, -1 when failure happens
 */
public static native int MXKVStoreInit(KVStoreHandle handle,
                            @Cast("mx_uint") int num,
                            @Const IntPointer keys,
                            PointerPointer vals);
public static native int MXKVStoreInit(KVStoreHandle handle,
                            @Cast("mx_uint") int num,
                            @Const IntBuffer keys,
                            PointerPointer vals);
public static native int MXKVStoreInit(KVStoreHandle handle,
                            @Cast("mx_uint") int num,
                            @Const int[] keys,
                            PointerPointer vals);

/**
 * \brief Push a list of (key,value) pairs to kvstore
 * @param handle handle to the kvstore
 * @param num the number of key-value pairs
 * @param keys the list of keys
 * @param vals the list of values
 * @param priority the priority of the action
 * @return 0 when success, -1 when failure happens
 */
public static native int MXKVStorePush(KVStoreHandle handle,
                            @Cast("mx_uint") int num,
                            @Const IntPointer keys,
                            PointerPointer vals,
                            int priority);
public static native int MXKVStorePush(KVStoreHandle handle,
                            @Cast("mx_uint") int num,
                            @Const IntBuffer keys,
                            PointerPointer vals,
                            int priority);
public static native int MXKVStorePush(KVStoreHandle handle,
                            @Cast("mx_uint") int num,
                            @Const int[] keys,
                            PointerPointer vals,
                            int priority);
/**
 * \brief pull a list of (key, value) pairs from the kvstore
 * @param handle handle to the kvstore
 * @param num the number of key-value pairs
 * @param keys the list of keys
 * @param vals the list of values
 * @param priority the priority of the action
 * @return 0 when success, -1 when failure happens
 */
public static native int MXKVStorePull(KVStoreHandle handle,
                            @Cast("mx_uint") int num,
                            @Const IntPointer keys,
                            PointerPointer vals,
                            int priority);
public static native int MXKVStorePull(KVStoreHandle handle,
                            @Cast("mx_uint") int num,
                            @Const IntBuffer keys,
                            PointerPointer vals,
                            int priority);
public static native int MXKVStorePull(KVStoreHandle handle,
                            @Cast("mx_uint") int num,
                            @Const int[] keys,
                            PointerPointer vals,
                            int priority);
/**
 * \brief user-defined updater for the kvstore
 * It's this updater's responsibility to delete \a recv and \a local
 * @param the key
 * @param recv the pushed value on this key
 * @param local the value stored on local on this key
 * @param handle The additional handle to the updater
 */
public static class MXKVStoreUpdater extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    MXKVStoreUpdater(Pointer p) { super(p); }
    protected MXKVStoreUpdater() { allocate(); }
    private native void allocate();
    public native void call(int key,
                                NDArrayHandle recv,
                                NDArrayHandle local,
                                Pointer handle);
}
/**
 * \brief register an push updater
 * @param handle handle to the KVStore
 * @param updater udpater function
 * @param updater_handle The additional handle used to invoke the updater
 * @return 0 when success, -1 when failure happens
 */
public static native int MXKVStoreSetUpdater(KVStoreHandle handle,
                                  MXKVStoreUpdater updater,
                                  Pointer updater_handle);
/**
 * \brief get the type of the kvstore
 * @param handle handle to the KVStore
 * @param type a string type
 * @return 0 when success, -1 when failure happens
 */
public static native int MXKVStoreGetType(KVStoreHandle handle,
                               @Cast("const char**") PointerPointer type);
public static native int MXKVStoreGetType(KVStoreHandle handle,
                               @Cast("const char**") @ByPtrPtr BytePointer type);
public static native int MXKVStoreGetType(KVStoreHandle handle,
                               @Cast("const char**") @ByPtrPtr ByteBuffer type);
public static native int MXKVStoreGetType(KVStoreHandle handle,
                               @Cast("const char**") @ByPtrPtr byte[] type);
//--------------------------------------------
// Part 6: advanced KVStore for multi-machines
//--------------------------------------------

/**
 * \brief return The rank of this node in its group, which is in [0, GroupSize).
 *
 * @param handle handle to the KVStore
 * @param ret the node rank
 * @return 0 when success, -1 when failure happens
 */
public static native int MXKVStoreGetRank(KVStoreHandle handle,
                               IntPointer ret);
public static native int MXKVStoreGetRank(KVStoreHandle handle,
                               IntBuffer ret);
public static native int MXKVStoreGetRank(KVStoreHandle handle,
                               int[] ret);

/**
 * \brief return The number of nodes in this group, which is
 * - number of workers if if {@code IsWorkerNode() == true},
 * - number of servers if if {@code IsServerNode() == true},
 * - 1 if {@code IsSchedulerNode() == true},
 * @param handle handle to the KVStore
 * @param ret the group size
 * @return 0 when success, -1 when failure happens
 */
public static native int MXKVStoreGetGroupSize(KVStoreHandle handle,
                                    IntPointer ret);
public static native int MXKVStoreGetGroupSize(KVStoreHandle handle,
                                    IntBuffer ret);
public static native int MXKVStoreGetGroupSize(KVStoreHandle handle,
                                    int[] ret);

/**
 * \brief return whether or not this process is a worker node.
 * @param ret 1 for yes, 0 for no
 * @return 0 when success, -1 when failure happens
 */
public static native int MXKVStoreIsWorkerNode(IntPointer ret);
public static native int MXKVStoreIsWorkerNode(IntBuffer ret);
public static native int MXKVStoreIsWorkerNode(int[] ret);


/**
 * \brief return whether or not this process is a server node.
 * @param ret 1 for yes, 0 for no
 * @return 0 when success, -1 when failure happens
 */
public static native int MXKVStoreIsServerNode(IntPointer ret);
public static native int MXKVStoreIsServerNode(IntBuffer ret);
public static native int MXKVStoreIsServerNode(int[] ret);


/**
 * \brief return whether or not this process is a scheduler node.
 * @param ret 1 for yes, 0 for no
 * @return 0 when success, -1 when failure happens
 */
public static native int MXKVStoreIsSchedulerNode(IntPointer ret);
public static native int MXKVStoreIsSchedulerNode(IntBuffer ret);
public static native int MXKVStoreIsSchedulerNode(int[] ret);

/**
 * \brief global barrier among all worker machines
 *
 * @param handle handle to the KVStore
 * @return 0 when success, -1 when failure happens
 */
public static native int MXKVStoreBarrier(KVStoreHandle handle);

/**
 * \brief the prototype of a server controller
 * @param head the head of the command
 * @param body the body of the command
 */
public static class MXKVStoreServerController extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    MXKVStoreServerController(Pointer p) { super(p); }
    protected MXKVStoreServerController() { allocate(); }
    private native void allocate();
    public native void call(int head,
                                         @Cast("const char*") BytePointer body);
}

/**
 * @return Run as server (or scheduler)
 *
 * @param handle handle to the KVStore
 * @param controller the user-defined server controller
 * @return 0 when success, -1 when failure happens
 */
public static native int MXKVStoreRunServer(KVStoreHandle handle,
                                 MXKVStoreServerController controller);

/**
 * @return Send a command to all server nodes
 *
 * @param handle handle to the KVStore
 * @param cmd_id the head of the command
 * @param cmd_body the body of the command
 * @return 0 when success, -1 when failure happens
 */
public static native int MXKVStoreSendCommmandToServers(KVStoreHandle handle,
                                             int cmd_id,
                                             @Cast("const char*") BytePointer cmd_body);
public static native int MXKVStoreSendCommmandToServers(KVStoreHandle handle,
                                             int cmd_id,
                                             String cmd_body);

/**
 * \brief Create a RecordIO writer object
 * @param uri path to file
 * @param out handle pointer to the created object
 * @return 0 when success, -1 when failure happens
*/
public static native int MXRecordIOWriterCreate(@Cast("const char*") BytePointer uri, PointerPointer out);
public static native int MXRecordIOWriterCreate(String uri, PointerPointer out);

/**
 * \brief Delete a RecordIO writer object
 * @param handle handle to RecordIO object
 * @return 0 when success, -1 when failure happens
*/
public static native int MXRecordIOWriterFree(RecordIOHandle handle);

/**
 * \brief Write a record to a RecordIO object
 * @param handle handle to RecordIO object
 * @param buf buffer to write
 * @param size size of buffer
 * @return 0 when success, -1 when failure happens
*/
public static native int MXRecordIOWriterWriteRecord(PointerPointer handle,
                                          @Cast("const char*") BytePointer buf, @Cast("size_t") long size);
public static native int MXRecordIOWriterWriteRecord(PointerPointer handle,
                                          String buf, @Cast("size_t") long size);

/**
 * \brief Create a RecordIO reader object
 * @param uri path to file
 * @param out handle pointer to the created object
 * @return 0 when success, -1 when failure happens
*/
public static native int MXRecordIOReaderCreate(@Cast("const char*") BytePointer uri, PointerPointer out);
public static native int MXRecordIOReaderCreate(String uri, PointerPointer out);

/**
 * \brief Delete a RecordIO reader object
 * @param handle handle to RecordIO object
 * @return 0 when success, -1 when failure happens
*/
public static native int MXRecordIOReaderFree(PointerPointer handle);

/**
 * \brief Write a record to a RecordIO object
 * @param handle handle to RecordIO object
 * @param buf pointer to return buffer
 * @param size point to size of buffer
 * @return 0 when success, -1 when failure happens
*/
public static native int MXRecordIOReaderReadRecord(PointerPointer handle,
                                        @Cast("char const**") PointerPointer buf, @Cast("size_t*") SizeTPointer size);
public static native int MXRecordIOReaderReadRecord(PointerPointer handle,
                                        @Cast("char const**") @ByPtrPtr BytePointer buf, @Cast("size_t*") SizeTPointer size);
public static native int MXRecordIOReaderReadRecord(PointerPointer handle,
                                        @Cast("char const**") @ByPtrPtr ByteBuffer buf, @Cast("size_t*") SizeTPointer size);
public static native int MXRecordIOReaderReadRecord(PointerPointer handle,
                                        @Cast("char const**") @ByPtrPtr byte[] buf, @Cast("size_t*") SizeTPointer size);

/**
 * \brief Create a MXRtc object
*/
public static native int MXRtcCreate(@Cast("char*") BytePointer name, @Cast("mx_uint") int num_input, @Cast("mx_uint") int num_output,
                          @Cast("char**") PointerPointer input_names, @Cast("char**") PointerPointer output_names,
                          PointerPointer inputs, PointerPointer outputs,
                          @Cast("char*") BytePointer kernel, PointerPointer out);
public static native int MXRtcCreate(@Cast("char*") BytePointer name, @Cast("mx_uint") int num_input, @Cast("mx_uint") int num_output,
                          @Cast("char**") @ByPtrPtr BytePointer input_names, @Cast("char**") @ByPtrPtr BytePointer output_names,
                          PointerPointer inputs, PointerPointer outputs,
                          @Cast("char*") BytePointer kernel, PointerPointer out);
public static native int MXRtcCreate(@Cast("char*") ByteBuffer name, @Cast("mx_uint") int num_input, @Cast("mx_uint") int num_output,
                          @Cast("char**") @ByPtrPtr ByteBuffer input_names, @Cast("char**") @ByPtrPtr ByteBuffer output_names,
                          PointerPointer inputs, PointerPointer outputs,
                          @Cast("char*") ByteBuffer kernel, PointerPointer out);
public static native int MXRtcCreate(@Cast("char*") byte[] name, @Cast("mx_uint") int num_input, @Cast("mx_uint") int num_output,
                          @Cast("char**") @ByPtrPtr byte[] input_names, @Cast("char**") @ByPtrPtr byte[] output_names,
                          PointerPointer inputs, PointerPointer outputs,
                          @Cast("char*") byte[] kernel, PointerPointer out);

/**
 * \brief Run cuda kernel
*/
public static native int MXRtcPush(RtcHandle handle, @Cast("mx_uint") int num_input, @Cast("mx_uint") int num_output,
                        PointerPointer inputs, PointerPointer outputs,
                        @Cast("mx_uint") int gridDimX,
                        @Cast("mx_uint") int gridDimY,
                        @Cast("mx_uint") int gridDimZ,
                        @Cast("mx_uint") int blockDimX,
                        @Cast("mx_uint") int blockDimY,
                        @Cast("mx_uint") int blockDimZ);

/**
 * \brief Delete a MXRtc object
*/
public static native int MXRtcFree(RtcHandle handle);

public static native int MXOptimizerFindCreator(@Cast("const char*") BytePointer key,
                                     PointerPointer out);
public static native int MXOptimizerFindCreator(String key,
                                     PointerPointer out);

public static native int MXOptimizerCreateOptimizer(OptimizerCreator creator,
                                         @Cast("mx_uint") int num_param,
                                         @Cast("const char**") PointerPointer keys,
                                         @Cast("const char**") PointerPointer vals,
                                         PointerPointer out);
public static native int MXOptimizerCreateOptimizer(OptimizerCreator creator,
                                         @Cast("mx_uint") int num_param,
                                         @Cast("const char**") @ByPtrPtr BytePointer keys,
                                         @Cast("const char**") @ByPtrPtr BytePointer vals,
                                         PointerPointer out);
public static native int MXOptimizerCreateOptimizer(OptimizerCreator creator,
                                         @Cast("mx_uint") int num_param,
                                         @Cast("const char**") @ByPtrPtr ByteBuffer keys,
                                         @Cast("const char**") @ByPtrPtr ByteBuffer vals,
                                         PointerPointer out);
public static native int MXOptimizerCreateOptimizer(OptimizerCreator creator,
                                         @Cast("mx_uint") int num_param,
                                         @Cast("const char**") @ByPtrPtr byte[] keys,
                                         @Cast("const char**") @ByPtrPtr byte[] vals,
                                         PointerPointer out);

public static native int MXOptimizerFree(OptimizerHandle handle);

public static native int MXOptimizerUpdate(OptimizerHandle handle,
                                int index,
                                NDArrayHandle weight,
                                NDArrayHandle grad,
                                @Cast("mx_float") float lr,
                                @Cast("mx_float") float wd);

// #endif  // MXNET_C_API_H_


// Parsed from mxnet/c_predict_api.h

/**
 *  Copyright (c) 2015 by Contributors
 * \file c_predict_api.h
 * \brief C predict API of mxnet, contains a minimum API to run prediction.
 *  This file is self-contained, and do not dependent on any other files.
 */
// #ifndef MXNET_C_PREDICT_API_H_
// #define MXNET_C_PREDICT_API_H_

// #ifdef __cplusplus
// #define MXNET_EXTERN_C extern "C"
// #else
// #endif

// #ifdef _WIN32
// #ifdef MXNET_EXPORTS
// #define MXNET_DLL MXNET_EXTERN_C __declspec(dllexport)
// #else
// #define MXNET_DLL MXNET_EXTERN_C __declspec(dllimport)
// #endif
// #else
// #define MXNET_DLL MXNET_EXTERN_C
// #endif

/** \brief manually define unsigned int */
/** \brief manually define float */
/** \brief handle to Predictor */
@Namespace @Name("void") @Opaque public static class PredictorHandle extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public PredictorHandle() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PredictorHandle(Pointer p) { super(p); }
}
/** \brief handle to NDArray list */
@Namespace @Name("void") @Opaque public static class NDListHandle extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public NDListHandle() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NDListHandle(Pointer p) { super(p); }
}

/**
 * \brief Get the last error happeneed.
 * @return The last error happened at the predictor.
 */

/**
 * \brief create a predictor
 * @param symbol_json_str The JSON string of the symbol.
 * @param param_bytes The in-memory raw bytes of parameter ndarray file.
 * @param param_size The size of parameter ndarray file.
 * @param dev_type The device type, 1: cpu, 2:gpu
 * @param dev_id The device id of the predictor.
 * @param num_input_nodes Number of input nodes to the net,
 *    For feedforward net, this is 1.
 * @param input_keys The name of input argument.
 *    For feedforward net, this is {"data"}
 * @param input_shape_indptr Index pointer of shapes of each input node.
 *    The length of this array = num_input_nodes + 1.
 *    For feedforward net that takes 4 dimensional input, this is {0, 4}.
 * @param input_shape_data A flatted data of shapes of each input node.
 *    For feedforward net that takes 4 dimensional input, this is the shape data.
 * @param out The created predictor handle.
 * @return 0 when success, -1 when failure.
 */
public static native int MXPredCreate(@Cast("const char*") BytePointer symbol_json_str,
                           @Const Pointer param_bytes,
                           int param_size,
                           int dev_type, int dev_id,
                           @Cast("mx_uint") int num_input_nodes,
                           @Cast("const char**") PointerPointer input_keys,
                           @Cast("const mx_uint*") IntPointer input_shape_indptr,
                           @Cast("const mx_uint*") IntPointer input_shape_data,
                           @ByPtrPtr PredictorHandle out);
public static native int MXPredCreate(@Cast("const char*") BytePointer symbol_json_str,
                           @Const Pointer param_bytes,
                           int param_size,
                           int dev_type, int dev_id,
                           @Cast("mx_uint") int num_input_nodes,
                           @Cast("const char**") @ByPtrPtr BytePointer input_keys,
                           @Cast("const mx_uint*") IntPointer input_shape_indptr,
                           @Cast("const mx_uint*") IntPointer input_shape_data,
                           @ByPtrPtr PredictorHandle out);
public static native int MXPredCreate(String symbol_json_str,
                           @Const Pointer param_bytes,
                           int param_size,
                           int dev_type, int dev_id,
                           @Cast("mx_uint") int num_input_nodes,
                           @Cast("const char**") @ByPtrPtr ByteBuffer input_keys,
                           @Cast("const mx_uint*") IntBuffer input_shape_indptr,
                           @Cast("const mx_uint*") IntBuffer input_shape_data,
                           @ByPtrPtr PredictorHandle out);
public static native int MXPredCreate(@Cast("const char*") BytePointer symbol_json_str,
                           @Const Pointer param_bytes,
                           int param_size,
                           int dev_type, int dev_id,
                           @Cast("mx_uint") int num_input_nodes,
                           @Cast("const char**") @ByPtrPtr byte[] input_keys,
                           @Cast("const mx_uint*") int[] input_shape_indptr,
                           @Cast("const mx_uint*") int[] input_shape_data,
                           @ByPtrPtr PredictorHandle out);
public static native int MXPredCreate(String symbol_json_str,
                           @Const Pointer param_bytes,
                           int param_size,
                           int dev_type, int dev_id,
                           @Cast("mx_uint") int num_input_nodes,
                           @Cast("const char**") @ByPtrPtr BytePointer input_keys,
                           @Cast("const mx_uint*") IntPointer input_shape_indptr,
                           @Cast("const mx_uint*") IntPointer input_shape_data,
                           @ByPtrPtr PredictorHandle out);
public static native int MXPredCreate(@Cast("const char*") BytePointer symbol_json_str,
                           @Const Pointer param_bytes,
                           int param_size,
                           int dev_type, int dev_id,
                           @Cast("mx_uint") int num_input_nodes,
                           @Cast("const char**") @ByPtrPtr ByteBuffer input_keys,
                           @Cast("const mx_uint*") IntBuffer input_shape_indptr,
                           @Cast("const mx_uint*") IntBuffer input_shape_data,
                           @ByPtrPtr PredictorHandle out);
public static native int MXPredCreate(String symbol_json_str,
                           @Const Pointer param_bytes,
                           int param_size,
                           int dev_type, int dev_id,
                           @Cast("mx_uint") int num_input_nodes,
                           @Cast("const char**") @ByPtrPtr byte[] input_keys,
                           @Cast("const mx_uint*") int[] input_shape_indptr,
                           @Cast("const mx_uint*") int[] input_shape_data,
                           @ByPtrPtr PredictorHandle out);

/**
 * \brief create a predictor wich customized outputs
 * @param symbol_json_str The JSON string of the symbol.
 * @param param_bytes The in-memory raw bytes of parameter ndarray file.
 * @param param_size The size of parameter ndarray file.
 * @param dev_type The device type, 1: cpu, 2:gpu
 * @param dev_id The device id of the predictor.
 * @param num_input_nodes Number of input nodes to the net,
 *    For feedforward net, this is 1.
 * @param input_keys The name of input argument.
 *    For feedforward net, this is {"data"}
 * @param input_shape_indptr Index pointer of shapes of each input node.
 *    The length of this array = num_input_nodes + 1.
 *    For feedforward net that takes 4 dimensional input, this is {0, 4}.
 * @param input_shape_data A flatted data of shapes of each input node.
 *    For feedforward net that takes 4 dimensional input, this is the shape data.
 * @param num_output_nodes Number of output nodes to the net,
 * @param output_keys The name of output argument.
 *    For example {"global_pool"}
 * @param out The created predictor handle.
 * @return 0 when success, -1 when failure.
 */

public static native int MXPredCreatePartialOut(@Cast("const char*") BytePointer symbol_json_str,
                                     @Const Pointer param_bytes,
                                     int param_size,
                                     int dev_type, int dev_id,
                                     @Cast("mx_uint") int num_input_nodes,
                                     @Cast("const char**") PointerPointer input_keys,
                                     @Cast("const mx_uint*") IntPointer input_shape_indptr,
                                     @Cast("const mx_uint*") IntPointer input_shape_data,
                                     @Cast("mx_uint") int num_output_nodes,
                                     @Cast("const char**") PointerPointer output_keys,
                                     @ByPtrPtr PredictorHandle out);
public static native int MXPredCreatePartialOut(@Cast("const char*") BytePointer symbol_json_str,
                                     @Const Pointer param_bytes,
                                     int param_size,
                                     int dev_type, int dev_id,
                                     @Cast("mx_uint") int num_input_nodes,
                                     @Cast("const char**") @ByPtrPtr BytePointer input_keys,
                                     @Cast("const mx_uint*") IntPointer input_shape_indptr,
                                     @Cast("const mx_uint*") IntPointer input_shape_data,
                                     @Cast("mx_uint") int num_output_nodes,
                                     @Cast("const char**") @ByPtrPtr BytePointer output_keys,
                                     @ByPtrPtr PredictorHandle out);
public static native int MXPredCreatePartialOut(String symbol_json_str,
                                     @Const Pointer param_bytes,
                                     int param_size,
                                     int dev_type, int dev_id,
                                     @Cast("mx_uint") int num_input_nodes,
                                     @Cast("const char**") @ByPtrPtr ByteBuffer input_keys,
                                     @Cast("const mx_uint*") IntBuffer input_shape_indptr,
                                     @Cast("const mx_uint*") IntBuffer input_shape_data,
                                     @Cast("mx_uint") int num_output_nodes,
                                     @Cast("const char**") @ByPtrPtr ByteBuffer output_keys,
                                     @ByPtrPtr PredictorHandle out);
public static native int MXPredCreatePartialOut(@Cast("const char*") BytePointer symbol_json_str,
                                     @Const Pointer param_bytes,
                                     int param_size,
                                     int dev_type, int dev_id,
                                     @Cast("mx_uint") int num_input_nodes,
                                     @Cast("const char**") @ByPtrPtr byte[] input_keys,
                                     @Cast("const mx_uint*") int[] input_shape_indptr,
                                     @Cast("const mx_uint*") int[] input_shape_data,
                                     @Cast("mx_uint") int num_output_nodes,
                                     @Cast("const char**") @ByPtrPtr byte[] output_keys,
                                     @ByPtrPtr PredictorHandle out);
public static native int MXPredCreatePartialOut(String symbol_json_str,
                                     @Const Pointer param_bytes,
                                     int param_size,
                                     int dev_type, int dev_id,
                                     @Cast("mx_uint") int num_input_nodes,
                                     @Cast("const char**") @ByPtrPtr BytePointer input_keys,
                                     @Cast("const mx_uint*") IntPointer input_shape_indptr,
                                     @Cast("const mx_uint*") IntPointer input_shape_data,
                                     @Cast("mx_uint") int num_output_nodes,
                                     @Cast("const char**") @ByPtrPtr BytePointer output_keys,
                                     @ByPtrPtr PredictorHandle out);
public static native int MXPredCreatePartialOut(@Cast("const char*") BytePointer symbol_json_str,
                                     @Const Pointer param_bytes,
                                     int param_size,
                                     int dev_type, int dev_id,
                                     @Cast("mx_uint") int num_input_nodes,
                                     @Cast("const char**") @ByPtrPtr ByteBuffer input_keys,
                                     @Cast("const mx_uint*") IntBuffer input_shape_indptr,
                                     @Cast("const mx_uint*") IntBuffer input_shape_data,
                                     @Cast("mx_uint") int num_output_nodes,
                                     @Cast("const char**") @ByPtrPtr ByteBuffer output_keys,
                                     @ByPtrPtr PredictorHandle out);
public static native int MXPredCreatePartialOut(String symbol_json_str,
                                     @Const Pointer param_bytes,
                                     int param_size,
                                     int dev_type, int dev_id,
                                     @Cast("mx_uint") int num_input_nodes,
                                     @Cast("const char**") @ByPtrPtr byte[] input_keys,
                                     @Cast("const mx_uint*") int[] input_shape_indptr,
                                     @Cast("const mx_uint*") int[] input_shape_data,
                                     @Cast("mx_uint") int num_output_nodes,
                                     @Cast("const char**") @ByPtrPtr byte[] output_keys,
                                     @ByPtrPtr PredictorHandle out);
/**
 * \brief Get the shape of output node.
 *  The returned shape_data and shape_ndim is only valid before next call to MXPred function.
 * @param handle The handle of the predictor.
 * @param index The index of output node, set to 0 if there is only one output.
 * @param shape_data Used to hold pointer to the shape data
 * @param shape_ndim Used to hold shape dimension.
 * @return 0 when success, -1 when failure.
 */
public static native int MXPredGetOutputShape(PredictorHandle handle,
                                   @Cast("mx_uint") int index,
                                   @Cast("mx_uint**") PointerPointer shape_data,
                                   @Cast("mx_uint*") IntPointer shape_ndim);
public static native int MXPredGetOutputShape(PredictorHandle handle,
                                   @Cast("mx_uint") int index,
                                   @Cast("mx_uint**") @ByPtrPtr IntPointer shape_data,
                                   @Cast("mx_uint*") IntPointer shape_ndim);
public static native int MXPredGetOutputShape(PredictorHandle handle,
                                   @Cast("mx_uint") int index,
                                   @Cast("mx_uint**") @ByPtrPtr IntBuffer shape_data,
                                   @Cast("mx_uint*") IntBuffer shape_ndim);
public static native int MXPredGetOutputShape(PredictorHandle handle,
                                   @Cast("mx_uint") int index,
                                   @Cast("mx_uint**") @ByPtrPtr int[] shape_data,
                                   @Cast("mx_uint*") int[] shape_ndim);
/**
 * \brief Set the input data of predictor.
 * @param handle The predictor handle.
 * @param key The name of input node to set.
 *     For feedforward net, this is "data".
 * @param data The pointer to the data to be set, with the shape specified in MXPredCreate.
 * @param size The size of data array, used for safety check.
 * @return 0 when success, -1 when failure.
 */
public static native int MXPredSetInput(PredictorHandle handle,
                             @Cast("const char*") BytePointer key,
                             @Cast("const mx_float*") FloatPointer data,
                             @Cast("mx_uint") int size);
public static native int MXPredSetInput(PredictorHandle handle,
                             String key,
                             @Cast("const mx_float*") FloatBuffer data,
                             @Cast("mx_uint") int size);
public static native int MXPredSetInput(PredictorHandle handle,
                             @Cast("const char*") BytePointer key,
                             @Cast("const mx_float*") float[] data,
                             @Cast("mx_uint") int size);
public static native int MXPredSetInput(PredictorHandle handle,
                             String key,
                             @Cast("const mx_float*") FloatPointer data,
                             @Cast("mx_uint") int size);
public static native int MXPredSetInput(PredictorHandle handle,
                             @Cast("const char*") BytePointer key,
                             @Cast("const mx_float*") FloatBuffer data,
                             @Cast("mx_uint") int size);
public static native int MXPredSetInput(PredictorHandle handle,
                             String key,
                             @Cast("const mx_float*") float[] data,
                             @Cast("mx_uint") int size);
/**
 * \brief Run a forward pass to get the output.
 * @param handle The handle of the predictor.
 * @return 0 when success, -1 when failure.
 */
public static native int MXPredForward(PredictorHandle handle);
/**
 * \brief Run a interactive forward pass to get the output.
 *  This is helpful for displaying progress of prediction which can be slow.
 *  User must call PartialForward from step=0, keep increasing it until step_left=0.
 * <pre>{@code
 * int step_left = 1;
 * for (int step = 0; step_left != 0; ++step) {
 *    MXPredPartialForward(handle, step, &step_left);
 *    printf("Current progress [%d/%d]\n", step, step + step_left + 1);
 * }
 * }</pre>
 * @param handle The handle of the predictor.
 * @param step The current step to run forward on.
 * @param step_left The number of steps left
 * @return 0 when success, -1 when failure.
 */
public static native int MXPredPartialForward(PredictorHandle handle, int step, IntPointer step_left);
public static native int MXPredPartialForward(PredictorHandle handle, int step, IntBuffer step_left);
public static native int MXPredPartialForward(PredictorHandle handle, int step, int[] step_left);
/**
 * \brief Get the output value of prediction.
 * @param handle The handle of the predictor.
 * @param index The index of output node, set to 0 if there is only one output.
 * @param data User allocated data to hold the output.
 * @param size The size of data array, used for safe checking.
 * @return 0 when success, -1 when failure.
 */
public static native int MXPredGetOutput(PredictorHandle handle,
                              @Cast("mx_uint") int index,
                              @Cast("mx_float*") FloatPointer data,
                              @Cast("mx_uint") int size);
public static native int MXPredGetOutput(PredictorHandle handle,
                              @Cast("mx_uint") int index,
                              @Cast("mx_float*") FloatBuffer data,
                              @Cast("mx_uint") int size);
public static native int MXPredGetOutput(PredictorHandle handle,
                              @Cast("mx_uint") int index,
                              @Cast("mx_float*") float[] data,
                              @Cast("mx_uint") int size);
/**
 * \brief Free a predictor handle.
 * @param handle The handle of the predictor.
 * @return 0 when success, -1 when failure.
 */
public static native int MXPredFree(PredictorHandle handle);
/**
 * \brief Create a NDArray List by loading from ndarray file.
 *     This can be used to load mean image file.
 * @param nd_file_bytes The byte contents of nd file to be loaded.
 * @param nd_file_size The size of the nd file to be loaded.
 * @param out The out put NDListHandle
 * @param out_length Length of the list.
 * @return 0 when success, -1 when failure.
 */
public static native int MXNDListCreate(@Cast("const char*") BytePointer nd_file_bytes,
                             int nd_file_size,
                             @ByPtrPtr NDListHandle out,
                             @Cast("mx_uint*") IntPointer out_length);
public static native int MXNDListCreate(String nd_file_bytes,
                             int nd_file_size,
                             @ByPtrPtr NDListHandle out,
                             @Cast("mx_uint*") IntBuffer out_length);
public static native int MXNDListCreate(@Cast("const char*") BytePointer nd_file_bytes,
                             int nd_file_size,
                             @ByPtrPtr NDListHandle out,
                             @Cast("mx_uint*") int[] out_length);
public static native int MXNDListCreate(String nd_file_bytes,
                             int nd_file_size,
                             @ByPtrPtr NDListHandle out,
                             @Cast("mx_uint*") IntPointer out_length);
public static native int MXNDListCreate(@Cast("const char*") BytePointer nd_file_bytes,
                             int nd_file_size,
                             @ByPtrPtr NDListHandle out,
                             @Cast("mx_uint*") IntBuffer out_length);
public static native int MXNDListCreate(String nd_file_bytes,
                             int nd_file_size,
                             @ByPtrPtr NDListHandle out,
                             @Cast("mx_uint*") int[] out_length);
/**
 * \brief Get an element from list
 * @param handle The handle to the NDArray
 * @param index The index in the list
 * @param out_key The output key of the item
 * @param out_data The data region of the item
 * @param out_shape The shape of the item.
 * @param out_ndim The number of dimension in the shape.
 * @return 0 when success, -1 when failure.
 */
public static native int MXNDListGet(NDListHandle handle,
                          @Cast("mx_uint") int index,
                          @Cast("const char**") PointerPointer out_key,
                          @Cast("const mx_float**") PointerPointer out_data,
                          @Cast("const mx_uint**") PointerPointer out_shape,
                          @Cast("mx_uint*") IntPointer out_ndim);
public static native int MXNDListGet(NDListHandle handle,
                          @Cast("mx_uint") int index,
                          @Cast("const char**") @ByPtrPtr BytePointer out_key,
                          @Cast("const mx_float**") @ByPtrPtr FloatPointer out_data,
                          @Cast("const mx_uint**") @ByPtrPtr IntPointer out_shape,
                          @Cast("mx_uint*") IntPointer out_ndim);
public static native int MXNDListGet(NDListHandle handle,
                          @Cast("mx_uint") int index,
                          @Cast("const char**") @ByPtrPtr ByteBuffer out_key,
                          @Cast("const mx_float**") @ByPtrPtr FloatBuffer out_data,
                          @Cast("const mx_uint**") @ByPtrPtr IntBuffer out_shape,
                          @Cast("mx_uint*") IntBuffer out_ndim);
public static native int MXNDListGet(NDListHandle handle,
                          @Cast("mx_uint") int index,
                          @Cast("const char**") @ByPtrPtr byte[] out_key,
                          @Cast("const mx_float**") @ByPtrPtr float[] out_data,
                          @Cast("const mx_uint**") @ByPtrPtr int[] out_shape,
                          @Cast("mx_uint*") int[] out_ndim);
/**
 * \brief Free a predictor handle.
 * @param handle The handle of the predictor.
 * @return 0 when success, -1 when failure.
 */
public static native int MXNDListFree(NDListHandle handle);

// #endif  // MXNET_C_PREDICT_API_H_


}
