// Targeted by JavaCPP version 1.1

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

public class fftw3 extends org.bytedeco.javacpp.presets.fftw3 {
    static { Loader.load(); }

// Parsed from <fftw3.h>

/*
 * Copyright (c) 2003, 2007-14 Matteo Frigo
 * Copyright (c) 2003, 2007-14 Massachusetts Institute of Technology
 *
 * The following statement of license applies *only* to this header file,
 * and *not* to the other files distributed with FFTW or derived therefrom:
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS
 * OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY
 * DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE
 * GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY,
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

/***************************** NOTE TO USERS *********************************
 *
 *                 THIS IS A HEADER FILE, NOT A MANUAL
 *
 *    If you want to know how to use FFTW, please read the manual,
 *    online at http://www.fftw.org/doc/ and also included with FFTW.
 *    For a quick start, see the manual's tutorial section.
 *
 *   (Reading header files to learn how to use a library is a habit
 *    stemming from code lacking a proper manual.  Arguably, it's a
 *    *bad* habit in most cases, because header files can contain
 *    interfaces that are not part of the public, stable API.)
 *
 ****************************************************************************/

// #ifndef FFTW3_H
// #define FFTW3_H

// #include <stdio.h>

// #ifdef __cplusplus
// #endif /* __cplusplus */

/* If <complex.h> is included, use the C99 complex type.  Otherwise
   define a type bit-compatible with C99 complex */
// #if !defined(FFTW_NO_Complex) && defined(_Complex_I) && defined(complex) && defined(I)
// #else
// #  define FFTW_DEFINE_COMPLEX(R, C) typedef R C[2]
// #endif

// #define FFTW_CONCAT(prefix, name) prefix ## name
// #define FFTW_MANGLE_DOUBLE(name) FFTW_CONCAT(fftw_, name)
// #define FFTW_MANGLE_FLOAT(name) FFTW_CONCAT(fftwf_, name)
// #define FFTW_MANGLE_LONG_DOUBLE(name) FFTW_CONCAT(fftwl_, name)
// #define FFTW_MANGLE_QUAD(name) FFTW_CONCAT(fftwq_, name)

/* IMPORTANT: for Windows compilers, you should add a line
        #define FFTW_DLL
   here and in kernel/ifftw.h if you are compiling/using FFTW as a
   DLL, in order to do the proper importing/exporting, or
   alternatively compile with -DFFTW_DLL or the equivalent
   command-line flag.  This is not necessary under MinGW/Cygwin, where
   libtool does the imports/exports automatically. */
// #if defined(FFTW_DLL) && (defined(_WIN32) || defined(__WIN32__))
   /* annoying Windows syntax for shared-library declarations */
// #  if defined(COMPILING_FFTW) /* defined in api.h when compiling FFTW */
// #    define FFTW_EXTERN extern __declspec(dllexport) 
// #  else /* user is calling FFTW; import symbol */
// #    define FFTW_EXTERN extern __declspec(dllimport) 
// #  endif
// #else
// #  define FFTW_EXTERN extern
// #endif

/** enum fftw_r2r_kind_do_not_use_me */
public static final int
     FFTW_R2HC= 0, FFTW_HC2R= 1, FFTW_DHT= 2,
     FFTW_REDFT00= 3, FFTW_REDFT01= 4, FFTW_REDFT10= 5, FFTW_REDFT11= 6,
     FFTW_RODFT00= 7, FFTW_RODFT01= 8, FFTW_RODFT10= 9, FFTW_RODFT11= 10;

public static class fftw_iodim_do_not_use_me extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public fftw_iodim_do_not_use_me() { allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public fftw_iodim_do_not_use_me(int size) { allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public fftw_iodim_do_not_use_me(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public fftw_iodim_do_not_use_me position(int position) {
        return (fftw_iodim_do_not_use_me)super.position(position);
    }

     public native int n(); public native fftw_iodim_do_not_use_me n(int n);                     /* dimension size */
     public native int is(); public native fftw_iodim_do_not_use_me is(int is);			/* input stride */
     public native int os(); public native fftw_iodim_do_not_use_me os(int os);			/* output stride */
}

// #include <stddef.h> /* for ptrdiff_t */
public static class fftw_iodim64_do_not_use_me extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public fftw_iodim64_do_not_use_me() { allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public fftw_iodim64_do_not_use_me(int size) { allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public fftw_iodim64_do_not_use_me(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public fftw_iodim64_do_not_use_me position(int position) {
        return (fftw_iodim64_do_not_use_me)super.position(position);
    }

     public native @Cast("ptrdiff_t") long n(); public native fftw_iodim64_do_not_use_me n(long n);                     /* dimension size */
     public native @Cast("ptrdiff_t") long is(); public native fftw_iodim64_do_not_use_me is(long is);			/* input stride */
     public native @Cast("ptrdiff_t") long os(); public native fftw_iodim64_do_not_use_me os(long os);			/* output stride */
}

public static class fftw_write_char_func_do_not_use_me extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    fftw_write_char_func_do_not_use_me(Pointer p) { super(p); }
    protected fftw_write_char_func_do_not_use_me() { allocate(); }
    private native void allocate();
    public native void call(@Cast("char") byte c, Pointer arg1);
}
public static class fftw_read_char_func_do_not_use_me extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    fftw_read_char_func_do_not_use_me(Pointer p) { super(p); }
    protected fftw_read_char_func_do_not_use_me() { allocate(); }
    private native void allocate();
    public native int call(Pointer arg0);
}

/*
  huge second-order macro that defines prototypes for all API
  functions.  We expand this macro for each supported precision
 
  X: name-mangling macro
  R: real data type
  C: complex data type
*/

// #define FFTW_DEFINE_API(X, R, C)
// 
// FFTW_DEFINE_COMPLEX(R, C);
// 
// typedef struct X(plan_s) *X(plan);
// 
// typedef struct fftw_iodim_do_not_use_me X(iodim);
// typedef struct fftw_iodim64_do_not_use_me X(iodim64);
// 
// typedef enum fftw_r2r_kind_do_not_use_me X(r2r_kind);
// 
// typedef fftw_write_char_func_do_not_use_me X(write_char_func);
// typedef fftw_read_char_func_do_not_use_me X(read_char_func);
// 
// FFTW_EXTERN void X(execute)(const X(plan) p);
// 
// FFTW_EXTERN X(plan) X(plan_dft)(int rank, const int *n,
// 		    C *in, C *out, int sign, unsigned flags);
// 
// FFTW_EXTERN X(plan) X(plan_dft_1d)(int n, C *in, C *out, int sign,
// 		       unsigned flags);
// FFTW_EXTERN X(plan) X(plan_dft_2d)(int n0, int n1,
// 		       C *in, C *out, int sign, unsigned flags);
// FFTW_EXTERN X(plan) X(plan_dft_3d)(int n0, int n1, int n2,
// 		       C *in, C *out, int sign, unsigned flags);
// 
// FFTW_EXTERN X(plan) X(plan_many_dft)(int rank, const int *n,
//                          int howmany,
//                          C *in, const int *inembed,
//                          int istride, int idist,
//                          C *out, const int *onembed,
//                          int ostride, int odist,
//                          int sign, unsigned flags);
// 
// FFTW_EXTERN X(plan) X(plan_guru_dft)(int rank, const X(iodim) *dims,
// 			 int howmany_rank,
// 			 const X(iodim) *howmany_dims,
// 			 C *in, C *out,
// 			 int sign, unsigned flags);
// FFTW_EXTERN X(plan) X(plan_guru_split_dft)(int rank, const X(iodim) *dims,
// 			 int howmany_rank,
// 			 const X(iodim) *howmany_dims,
// 			 R *ri, R *ii, R *ro, R *io,
// 			 unsigned flags);
// 
// FFTW_EXTERN X(plan) X(plan_guru64_dft)(int rank,
//                          const X(iodim64) *dims,
// 			 int howmany_rank,
// 			 const X(iodim64) *howmany_dims,
// 			 C *in, C *out,
// 			 int sign, unsigned flags);
// FFTW_EXTERN X(plan) X(plan_guru64_split_dft)(int rank,
//                          const X(iodim64) *dims,
// 			 int howmany_rank,
// 			 const X(iodim64) *howmany_dims,
// 			 R *ri, R *ii, R *ro, R *io,
// 			 unsigned flags);
// 
// FFTW_EXTERN void X(execute_dft)(const X(plan) p, C *in, C *out);
// FFTW_EXTERN void X(execute_split_dft)(const X(plan) p, R *ri, R *ii,
//                                       R *ro, R *io);
// 
// FFTW_EXTERN X(plan) X(plan_many_dft_r2c)(int rank, const int *n,
//                              int howmany,
//                              R *in, const int *inembed,
//                              int istride, int idist,
//                              C *out, const int *onembed,
//                              int ostride, int odist,
//                              unsigned flags);
// 
// FFTW_EXTERN X(plan) X(plan_dft_r2c)(int rank, const int *n,
//                         R *in, C *out, unsigned flags);
// 
// FFTW_EXTERN X(plan) X(plan_dft_r2c_1d)(int n,R *in,C *out,unsigned flags);
// FFTW_EXTERN X(plan) X(plan_dft_r2c_2d)(int n0, int n1,
// 			   R *in, C *out, unsigned flags);
// FFTW_EXTERN X(plan) X(plan_dft_r2c_3d)(int n0, int n1,
// 			   int n2,
// 			   R *in, C *out, unsigned flags);
// 
// 
// FFTW_EXTERN X(plan) X(plan_many_dft_c2r)(int rank, const int *n,
// 			     int howmany,
// 			     C *in, const int *inembed,
// 			     int istride, int idist,
// 			     R *out, const int *onembed,
// 			     int ostride, int odist,
// 			     unsigned flags);
// 
// FFTW_EXTERN X(plan) X(plan_dft_c2r)(int rank, const int *n,
//                         C *in, R *out, unsigned flags);
// 
// FFTW_EXTERN X(plan) X(plan_dft_c2r_1d)(int n,C *in,R *out,unsigned flags);
// FFTW_EXTERN X(plan) X(plan_dft_c2r_2d)(int n0, int n1,
// 			   C *in, R *out, unsigned flags);
// FFTW_EXTERN X(plan) X(plan_dft_c2r_3d)(int n0, int n1,
// 			   int n2,
// 			   C *in, R *out, unsigned flags);
// 
// FFTW_EXTERN X(plan) X(plan_guru_dft_r2c)(int rank, const X(iodim) *dims,
// 			     int howmany_rank,
// 			     const X(iodim) *howmany_dims,
// 			     R *in, C *out,
// 			     unsigned flags);
// FFTW_EXTERN X(plan) X(plan_guru_dft_c2r)(int rank, const X(iodim) *dims,
// 			     int howmany_rank,
// 			     const X(iodim) *howmany_dims,
// 			     C *in, R *out,
// 			     unsigned flags);
// 
// FFTW_EXTERN X(plan) X(plan_guru_split_dft_r2c)(
//                              int rank, const X(iodim) *dims,
// 			     int howmany_rank,
// 			     const X(iodim) *howmany_dims,
// 			     R *in, R *ro, R *io,
// 			     unsigned flags);
// FFTW_EXTERN X(plan) X(plan_guru_split_dft_c2r)(
//                              int rank, const X(iodim) *dims,
// 			     int howmany_rank,
// 			     const X(iodim) *howmany_dims,
// 			     R *ri, R *ii, R *out,
// 			     unsigned flags);
// 
// FFTW_EXTERN X(plan) X(plan_guru64_dft_r2c)(int rank,
//                              const X(iodim64) *dims,
// 			     int howmany_rank,
// 			     const X(iodim64) *howmany_dims,
// 			     R *in, C *out,
// 			     unsigned flags);
// FFTW_EXTERN X(plan) X(plan_guru64_dft_c2r)(int rank,
//                              const X(iodim64) *dims,
// 			     int howmany_rank,
// 			     const X(iodim64) *howmany_dims,
// 			     C *in, R *out,
// 			     unsigned flags);
// 
// FFTW_EXTERN X(plan) X(plan_guru64_split_dft_r2c)(
//                              int rank, const X(iodim64) *dims,
// 			     int howmany_rank,
// 			     const X(iodim64) *howmany_dims,
// 			     R *in, R *ro, R *io,
// 			     unsigned flags);
// FFTW_EXTERN X(plan) X(plan_guru64_split_dft_c2r)(
//                              int rank, const X(iodim64) *dims,
// 			     int howmany_rank,
// 			     const X(iodim64) *howmany_dims,
// 			     R *ri, R *ii, R *out,
// 			     unsigned flags);
// 
// FFTW_EXTERN void X(execute_dft_r2c)(const X(plan) p, R *in, C *out);
// FFTW_EXTERN void X(execute_dft_c2r)(const X(plan) p, C *in, R *out);
// 
// FFTW_EXTERN void X(execute_split_dft_r2c)(const X(plan) p,
//                                           R *in, R *ro, R *io);
// FFTW_EXTERN void X(execute_split_dft_c2r)(const X(plan) p,
//                                           R *ri, R *ii, R *out);
// 
// FFTW_EXTERN X(plan) X(plan_many_r2r)(int rank, const int *n,
//                          int howmany,
//                          R *in, const int *inembed,
//                          int istride, int idist,
//                          R *out, const int *onembed,
//                          int ostride, int odist,
//                          const X(r2r_kind) *kind, unsigned flags);
// 
// FFTW_EXTERN X(plan) X(plan_r2r)(int rank, const int *n, R *in, R *out,
//                     const X(r2r_kind) *kind, unsigned flags);
// 
// FFTW_EXTERN X(plan) X(plan_r2r_1d)(int n, R *in, R *out,
//                        X(r2r_kind) kind, unsigned flags);
// FFTW_EXTERN X(plan) X(plan_r2r_2d)(int n0, int n1, R *in, R *out,
//                        X(r2r_kind) kind0, X(r2r_kind) kind1,
//                        unsigned flags);
// FFTW_EXTERN X(plan) X(plan_r2r_3d)(int n0, int n1, int n2,
//                        R *in, R *out, X(r2r_kind) kind0,
//                        X(r2r_kind) kind1, X(r2r_kind) kind2,
//                        unsigned flags);
// 
// FFTW_EXTERN X(plan) X(plan_guru_r2r)(int rank, const X(iodim) *dims,
//                          int howmany_rank,
//                          const X(iodim) *howmany_dims,
//                          R *in, R *out,
//                          const X(r2r_kind) *kind, unsigned flags);
// 
// FFTW_EXTERN X(plan) X(plan_guru64_r2r)(int rank, const X(iodim64) *dims,
//                          int howmany_rank,
//                          const X(iodim64) *howmany_dims,
//                          R *in, R *out,
//                          const X(r2r_kind) *kind, unsigned flags);
// 
// FFTW_EXTERN void X(execute_r2r)(const X(plan) p, R *in, R *out);
// 
// FFTW_EXTERN void X(destroy_plan)(X(plan) p);
// FFTW_EXTERN void X(forget_wisdom)(void);
// FFTW_EXTERN void X(cleanup)(void);
// 
// FFTW_EXTERN void X(set_timelimit)(double t);
// 
// FFTW_EXTERN void X(plan_with_nthreads)(int nthreads);
// FFTW_EXTERN int X(init_threads)(void);
// FFTW_EXTERN void X(cleanup_threads)(void);
// 
// FFTW_EXTERN int X(export_wisdom_to_filename)(const char *filename);
// FFTW_EXTERN void X(export_wisdom_to_file)(FILE *output_file);
// FFTW_EXTERN char *X(export_wisdom_to_string)(void);
// FFTW_EXTERN void X(export_wisdom)(X(write_char_func) write_char,
//                                   void *data);
// FFTW_EXTERN int X(import_system_wisdom)(void);
// FFTW_EXTERN int X(import_wisdom_from_filename)(const char *filename);
// FFTW_EXTERN int X(import_wisdom_from_file)(FILE *input_file);
// FFTW_EXTERN int X(import_wisdom_from_string)(const char *input_string);
// FFTW_EXTERN int X(import_wisdom)(X(read_char_func) read_char, void *data);
// 
// FFTW_EXTERN void X(fprint_plan)(const X(plan) p, FILE *output_file);
// FFTW_EXTERN void X(print_plan)(const X(plan) p);
// FFTW_EXTERN char *X(sprint_plan)(const X(plan) p);
// 
// FFTW_EXTERN void *X(malloc)(size_t n);
// FFTW_EXTERN R *X(alloc_real)(size_t n);
// FFTW_EXTERN C *X(alloc_complex)(size_t n);
// FFTW_EXTERN void X(free)(void *p);
// 
// FFTW_EXTERN void X(flops)(const X(plan) p,
//                           double *add, double *mul, double *fmas);
// FFTW_EXTERN double X(estimate_cost)(const X(plan) p);
// FFTW_EXTERN double X(cost)(const X(plan) p);
// 
// FFTW_EXTERN int X(alignment_of)(R *p);
// FFTW_EXTERN const char X(version)[];
// FFTW_EXTERN const char X(cc)[];
// FFTW_EXTERN const char X(codelet_optim)[];


/* end of FFTW_DEFINE_API macro */

@Name("fftw_plan_s") @Opaque public static class fftw_plan extends Pointer {
    /** Empty constructor. */
    public fftw_plan() { }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public fftw_plan(Pointer p) { super(p); }
}

@Opaque public static class fftw_iodim extends Pointer {
    /** Empty constructor. */
    public fftw_iodim() { }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public fftw_iodim(Pointer p) { super(p); }
}
@Opaque public static class fftw_iodim64 extends Pointer {
    /** Empty constructor. */
    public fftw_iodim64() { }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public fftw_iodim64(Pointer p) { super(p); }
}

public static native void fftw_execute(fftw_plan p);

public static native fftw_plan fftw_plan_dft(int rank, @Const IntPointer n, @Cast("fftw_complex*") DoublePointer in, @Cast("fftw_complex*") DoublePointer out, int sign, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft(int rank, @Const IntBuffer n, @Cast("fftw_complex*") DoubleBuffer in, @Cast("fftw_complex*") DoubleBuffer out, int sign, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft(int rank, @Const int[] n, @Cast("fftw_complex*") double[] in, @Cast("fftw_complex*") double[] out, int sign, @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_dft_1d(int n, @Cast("fftw_complex*") DoublePointer in, @Cast("fftw_complex*") DoublePointer out, int sign,
		       @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_1d(int n, @Cast("fftw_complex*") DoubleBuffer in, @Cast("fftw_complex*") DoubleBuffer out, int sign,
		       @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_1d(int n, @Cast("fftw_complex*") double[] in, @Cast("fftw_complex*") double[] out, int sign,
		       @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_2d(int n0, int n1, @Cast("fftw_complex*") DoublePointer in, @Cast("fftw_complex*") DoublePointer out, int sign, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_2d(int n0, int n1, @Cast("fftw_complex*") DoubleBuffer in, @Cast("fftw_complex*") DoubleBuffer out, int sign, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_2d(int n0, int n1, @Cast("fftw_complex*") double[] in, @Cast("fftw_complex*") double[] out, int sign, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_3d(int n0, int n1, int n2, @Cast("fftw_complex*") DoublePointer in, @Cast("fftw_complex*") DoublePointer out, int sign, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_3d(int n0, int n1, int n2, @Cast("fftw_complex*") DoubleBuffer in, @Cast("fftw_complex*") DoubleBuffer out, int sign, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_3d(int n0, int n1, int n2, @Cast("fftw_complex*") double[] in, @Cast("fftw_complex*") double[] out, int sign, @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_many_dft(int rank, @Const IntPointer n,
                         int howmany, @Cast("fftw_complex*") DoublePointer in, @Const IntPointer inembed,
                         int istride, int idist, @Cast("fftw_complex*") DoublePointer out, @Const IntPointer onembed,
                         int ostride, int odist,
                         int sign, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_many_dft(int rank, @Const IntBuffer n,
                         int howmany, @Cast("fftw_complex*") DoubleBuffer in, @Const IntBuffer inembed,
                         int istride, int idist, @Cast("fftw_complex*") DoubleBuffer out, @Const IntBuffer onembed,
                         int ostride, int odist,
                         int sign, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_many_dft(int rank, @Const int[] n,
                         int howmany, @Cast("fftw_complex*") double[] in, @Const int[] inembed,
                         int istride, int idist, @Cast("fftw_complex*") double[] out, @Const int[] onembed,
                         int ostride, int odist,
                         int sign, @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_guru_dft(int rank, @Const fftw_iodim dims,
			 int howmany_rank,
			 @Const fftw_iodim howmany_dims, @Cast("fftw_complex*") DoublePointer in, @Cast("fftw_complex*") DoublePointer out,
			 int sign, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru_dft(int rank, @Const fftw_iodim dims,
			 int howmany_rank,
			 @Const fftw_iodim howmany_dims, @Cast("fftw_complex*") DoubleBuffer in, @Cast("fftw_complex*") DoubleBuffer out,
			 int sign, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru_dft(int rank, @Const fftw_iodim dims,
			 int howmany_rank,
			 @Const fftw_iodim howmany_dims, @Cast("fftw_complex*") double[] in, @Cast("fftw_complex*") double[] out,
			 int sign, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru_split_dft(int rank, @Const fftw_iodim dims,
			 int howmany_rank,
			 @Const fftw_iodim howmany_dims, DoublePointer ri, DoublePointer ii, DoublePointer ro, DoublePointer io,
			 @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru_split_dft(int rank, @Const fftw_iodim dims,
			 int howmany_rank,
			 @Const fftw_iodim howmany_dims, DoubleBuffer ri, DoubleBuffer ii, DoubleBuffer ro, DoubleBuffer io,
			 @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru_split_dft(int rank, @Const fftw_iodim dims,
			 int howmany_rank,
			 @Const fftw_iodim howmany_dims, double[] ri, double[] ii, double[] ro, double[] io,
			 @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_guru64_dft(int rank,
                         @Const fftw_iodim64 dims,
			 int howmany_rank,
			 @Const fftw_iodim64 howmany_dims, @Cast("fftw_complex*") DoublePointer in, @Cast("fftw_complex*") DoublePointer out,
			 int sign, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru64_dft(int rank,
                         @Const fftw_iodim64 dims,
			 int howmany_rank,
			 @Const fftw_iodim64 howmany_dims, @Cast("fftw_complex*") DoubleBuffer in, @Cast("fftw_complex*") DoubleBuffer out,
			 int sign, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru64_dft(int rank,
                         @Const fftw_iodim64 dims,
			 int howmany_rank,
			 @Const fftw_iodim64 howmany_dims, @Cast("fftw_complex*") double[] in, @Cast("fftw_complex*") double[] out,
			 int sign, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru64_split_dft(int rank,
                         @Const fftw_iodim64 dims,
			 int howmany_rank,
			 @Const fftw_iodim64 howmany_dims, DoublePointer ri, DoublePointer ii, DoublePointer ro, DoublePointer io,
			 @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru64_split_dft(int rank,
                         @Const fftw_iodim64 dims,
			 int howmany_rank,
			 @Const fftw_iodim64 howmany_dims, DoubleBuffer ri, DoubleBuffer ii, DoubleBuffer ro, DoubleBuffer io,
			 @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru64_split_dft(int rank,
                         @Const fftw_iodim64 dims,
			 int howmany_rank,
			 @Const fftw_iodim64 howmany_dims, double[] ri, double[] ii, double[] ro, double[] io,
			 @Cast("unsigned") int flags);

public static native void fftw_execute_dft(fftw_plan p, @Cast("fftw_complex*") DoublePointer in, @Cast("fftw_complex*") DoublePointer out);
public static native void fftw_execute_dft(fftw_plan p, @Cast("fftw_complex*") DoubleBuffer in, @Cast("fftw_complex*") DoubleBuffer out);
public static native void fftw_execute_dft(fftw_plan p, @Cast("fftw_complex*") double[] in, @Cast("fftw_complex*") double[] out);
public static native void fftw_execute_split_dft(fftw_plan p, DoublePointer ri, DoublePointer ii, DoublePointer ro, DoublePointer io);
public static native void fftw_execute_split_dft(fftw_plan p, DoubleBuffer ri, DoubleBuffer ii, DoubleBuffer ro, DoubleBuffer io);
public static native void fftw_execute_split_dft(fftw_plan p, double[] ri, double[] ii, double[] ro, double[] io);

public static native fftw_plan fftw_plan_many_dft_r2c(int rank, @Const IntPointer n,
                             int howmany, DoublePointer in, @Const IntPointer inembed,
                             int istride, int idist, @Cast("fftw_complex*") DoublePointer out, @Const IntPointer onembed,
                             int ostride, int odist,
                             @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_many_dft_r2c(int rank, @Const IntBuffer n,
                             int howmany, DoubleBuffer in, @Const IntBuffer inembed,
                             int istride, int idist, @Cast("fftw_complex*") DoubleBuffer out, @Const IntBuffer onembed,
                             int ostride, int odist,
                             @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_many_dft_r2c(int rank, @Const int[] n,
                             int howmany, double[] in, @Const int[] inembed,
                             int istride, int idist, @Cast("fftw_complex*") double[] out, @Const int[] onembed,
                             int ostride, int odist,
                             @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_dft_r2c(int rank, @Const IntPointer n, DoublePointer in, @Cast("fftw_complex*") DoublePointer out, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_r2c(int rank, @Const IntBuffer n, DoubleBuffer in, @Cast("fftw_complex*") DoubleBuffer out, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_r2c(int rank, @Const int[] n, double[] in, @Cast("fftw_complex*") double[] out, @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_dft_r2c_1d(int n, DoublePointer in, @Cast("fftw_complex*") DoublePointer out,@Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_r2c_1d(int n, DoubleBuffer in, @Cast("fftw_complex*") DoubleBuffer out,@Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_r2c_1d(int n, double[] in, @Cast("fftw_complex*") double[] out,@Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_r2c_2d(int n0, int n1, DoublePointer in, @Cast("fftw_complex*") DoublePointer out, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_r2c_2d(int n0, int n1, DoubleBuffer in, @Cast("fftw_complex*") DoubleBuffer out, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_r2c_2d(int n0, int n1, double[] in, @Cast("fftw_complex*") double[] out, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_r2c_3d(int n0, int n1,
			   int n2, DoublePointer in, @Cast("fftw_complex*") DoublePointer out, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_r2c_3d(int n0, int n1,
			   int n2, DoubleBuffer in, @Cast("fftw_complex*") DoubleBuffer out, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_r2c_3d(int n0, int n1,
			   int n2, double[] in, @Cast("fftw_complex*") double[] out, @Cast("unsigned") int flags);


public static native fftw_plan fftw_plan_many_dft_c2r(int rank, @Const IntPointer n,
			     int howmany, @Cast("fftw_complex*") DoublePointer in, @Const IntPointer inembed,
			     int istride, int idist, DoublePointer out, @Const IntPointer onembed,
			     int ostride, int odist,
			     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_many_dft_c2r(int rank, @Const IntBuffer n,
			     int howmany, @Cast("fftw_complex*") DoubleBuffer in, @Const IntBuffer inembed,
			     int istride, int idist, DoubleBuffer out, @Const IntBuffer onembed,
			     int ostride, int odist,
			     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_many_dft_c2r(int rank, @Const int[] n,
			     int howmany, @Cast("fftw_complex*") double[] in, @Const int[] inembed,
			     int istride, int idist, double[] out, @Const int[] onembed,
			     int ostride, int odist,
			     @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_dft_c2r(int rank, @Const IntPointer n, @Cast("fftw_complex*") DoublePointer in, DoublePointer out, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_c2r(int rank, @Const IntBuffer n, @Cast("fftw_complex*") DoubleBuffer in, DoubleBuffer out, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_c2r(int rank, @Const int[] n, @Cast("fftw_complex*") double[] in, double[] out, @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_dft_c2r_1d(int n, @Cast("fftw_complex*") DoublePointer in, DoublePointer out,@Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_c2r_1d(int n, @Cast("fftw_complex*") DoubleBuffer in, DoubleBuffer out,@Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_c2r_1d(int n, @Cast("fftw_complex*") double[] in, double[] out,@Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_c2r_2d(int n0, int n1, @Cast("fftw_complex*") DoublePointer in, DoublePointer out, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_c2r_2d(int n0, int n1, @Cast("fftw_complex*") DoubleBuffer in, DoubleBuffer out, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_c2r_2d(int n0, int n1, @Cast("fftw_complex*") double[] in, double[] out, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_c2r_3d(int n0, int n1,
			   int n2, @Cast("fftw_complex*") DoublePointer in, DoublePointer out, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_c2r_3d(int n0, int n1,
			   int n2, @Cast("fftw_complex*") DoubleBuffer in, DoubleBuffer out, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_dft_c2r_3d(int n0, int n1,
			   int n2, @Cast("fftw_complex*") double[] in, double[] out, @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_guru_dft_r2c(int rank, @Const fftw_iodim dims,
			     int howmany_rank,
			     @Const fftw_iodim howmany_dims, DoublePointer in, @Cast("fftw_complex*") DoublePointer out,
			     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru_dft_r2c(int rank, @Const fftw_iodim dims,
			     int howmany_rank,
			     @Const fftw_iodim howmany_dims, DoubleBuffer in, @Cast("fftw_complex*") DoubleBuffer out,
			     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru_dft_r2c(int rank, @Const fftw_iodim dims,
			     int howmany_rank,
			     @Const fftw_iodim howmany_dims, double[] in, @Cast("fftw_complex*") double[] out,
			     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru_dft_c2r(int rank, @Const fftw_iodim dims,
			     int howmany_rank,
			     @Const fftw_iodim howmany_dims, @Cast("fftw_complex*") DoublePointer in, DoublePointer out,
			     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru_dft_c2r(int rank, @Const fftw_iodim dims,
			     int howmany_rank,
			     @Const fftw_iodim howmany_dims, @Cast("fftw_complex*") DoubleBuffer in, DoubleBuffer out,
			     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru_dft_c2r(int rank, @Const fftw_iodim dims,
			     int howmany_rank,
			     @Const fftw_iodim howmany_dims, @Cast("fftw_complex*") double[] in, double[] out,
			     @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_guru_split_dft_r2c(
                             int rank, @Const fftw_iodim dims,
			     int howmany_rank,
			     @Const fftw_iodim howmany_dims, DoublePointer in, DoublePointer ro, DoublePointer io,
			     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru_split_dft_r2c(
                             int rank, @Const fftw_iodim dims,
			     int howmany_rank,
			     @Const fftw_iodim howmany_dims, DoubleBuffer in, DoubleBuffer ro, DoubleBuffer io,
			     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru_split_dft_r2c(
                             int rank, @Const fftw_iodim dims,
			     int howmany_rank,
			     @Const fftw_iodim howmany_dims, double[] in, double[] ro, double[] io,
			     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru_split_dft_c2r(
                             int rank, @Const fftw_iodim dims,
			     int howmany_rank,
			     @Const fftw_iodim howmany_dims, DoublePointer ri, DoublePointer ii, DoublePointer out,
			     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru_split_dft_c2r(
                             int rank, @Const fftw_iodim dims,
			     int howmany_rank,
			     @Const fftw_iodim howmany_dims, DoubleBuffer ri, DoubleBuffer ii, DoubleBuffer out,
			     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru_split_dft_c2r(
                             int rank, @Const fftw_iodim dims,
			     int howmany_rank,
			     @Const fftw_iodim howmany_dims, double[] ri, double[] ii, double[] out,
			     @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_guru64_dft_r2c(int rank,
                             @Const fftw_iodim64 dims,
			     int howmany_rank,
			     @Const fftw_iodim64 howmany_dims, DoublePointer in, @Cast("fftw_complex*") DoublePointer out,
			     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru64_dft_r2c(int rank,
                             @Const fftw_iodim64 dims,
			     int howmany_rank,
			     @Const fftw_iodim64 howmany_dims, DoubleBuffer in, @Cast("fftw_complex*") DoubleBuffer out,
			     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru64_dft_r2c(int rank,
                             @Const fftw_iodim64 dims,
			     int howmany_rank,
			     @Const fftw_iodim64 howmany_dims, double[] in, @Cast("fftw_complex*") double[] out,
			     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru64_dft_c2r(int rank,
                             @Const fftw_iodim64 dims,
			     int howmany_rank,
			     @Const fftw_iodim64 howmany_dims, @Cast("fftw_complex*") DoublePointer in, DoublePointer out,
			     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru64_dft_c2r(int rank,
                             @Const fftw_iodim64 dims,
			     int howmany_rank,
			     @Const fftw_iodim64 howmany_dims, @Cast("fftw_complex*") DoubleBuffer in, DoubleBuffer out,
			     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru64_dft_c2r(int rank,
                             @Const fftw_iodim64 dims,
			     int howmany_rank,
			     @Const fftw_iodim64 howmany_dims, @Cast("fftw_complex*") double[] in, double[] out,
			     @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_guru64_split_dft_r2c(
                             int rank, @Const fftw_iodim64 dims,
			     int howmany_rank,
			     @Const fftw_iodim64 howmany_dims, DoublePointer in, DoublePointer ro, DoublePointer io,
			     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru64_split_dft_r2c(
                             int rank, @Const fftw_iodim64 dims,
			     int howmany_rank,
			     @Const fftw_iodim64 howmany_dims, DoubleBuffer in, DoubleBuffer ro, DoubleBuffer io,
			     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru64_split_dft_r2c(
                             int rank, @Const fftw_iodim64 dims,
			     int howmany_rank,
			     @Const fftw_iodim64 howmany_dims, double[] in, double[] ro, double[] io,
			     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru64_split_dft_c2r(
                             int rank, @Const fftw_iodim64 dims,
			     int howmany_rank,
			     @Const fftw_iodim64 howmany_dims, DoublePointer ri, DoublePointer ii, DoublePointer out,
			     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru64_split_dft_c2r(
                             int rank, @Const fftw_iodim64 dims,
			     int howmany_rank,
			     @Const fftw_iodim64 howmany_dims, DoubleBuffer ri, DoubleBuffer ii, DoubleBuffer out,
			     @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru64_split_dft_c2r(
                             int rank, @Const fftw_iodim64 dims,
			     int howmany_rank,
			     @Const fftw_iodim64 howmany_dims, double[] ri, double[] ii, double[] out,
			     @Cast("unsigned") int flags);

public static native void fftw_execute_dft_r2c(fftw_plan p, DoublePointer in, @Cast("fftw_complex*") DoublePointer out);
public static native void fftw_execute_dft_r2c(fftw_plan p, DoubleBuffer in, @Cast("fftw_complex*") DoubleBuffer out);
public static native void fftw_execute_dft_r2c(fftw_plan p, double[] in, @Cast("fftw_complex*") double[] out);
public static native void fftw_execute_dft_c2r(fftw_plan p, @Cast("fftw_complex*") DoublePointer in, DoublePointer out);
public static native void fftw_execute_dft_c2r(fftw_plan p, @Cast("fftw_complex*") DoubleBuffer in, DoubleBuffer out);
public static native void fftw_execute_dft_c2r(fftw_plan p, @Cast("fftw_complex*") double[] in, double[] out);

public static native void fftw_execute_split_dft_r2c(fftw_plan p, DoublePointer in, DoublePointer ro, DoublePointer io);
public static native void fftw_execute_split_dft_r2c(fftw_plan p, DoubleBuffer in, DoubleBuffer ro, DoubleBuffer io);
public static native void fftw_execute_split_dft_r2c(fftw_plan p, double[] in, double[] ro, double[] io);
public static native void fftw_execute_split_dft_c2r(fftw_plan p, DoublePointer ri, DoublePointer ii, DoublePointer out);
public static native void fftw_execute_split_dft_c2r(fftw_plan p, DoubleBuffer ri, DoubleBuffer ii, DoubleBuffer out);
public static native void fftw_execute_split_dft_c2r(fftw_plan p, double[] ri, double[] ii, double[] out);

public static native fftw_plan fftw_plan_many_r2r(int rank, @Const IntPointer n,
                         int howmany, DoublePointer in, @Const IntPointer inembed,
                         int istride, int idist, DoublePointer out, @Const IntPointer onembed,
                         int ostride, int odist,
                         @Cast("const fftw_r2r_kind*") IntPointer kind, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_many_r2r(int rank, @Const IntBuffer n,
                         int howmany, DoubleBuffer in, @Const IntBuffer inembed,
                         int istride, int idist, DoubleBuffer out, @Const IntBuffer onembed,
                         int ostride, int odist,
                         @Cast("const fftw_r2r_kind*") IntBuffer kind, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_many_r2r(int rank, @Const int[] n,
                         int howmany, double[] in, @Const int[] inembed,
                         int istride, int idist, double[] out, @Const int[] onembed,
                         int ostride, int odist,
                         @Cast("const fftw_r2r_kind*") int[] kind, @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_r2r(int rank, @Const IntPointer n, DoublePointer in, DoublePointer out,
                    @Cast("const fftw_r2r_kind*") IntPointer kind, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_r2r(int rank, @Const IntBuffer n, DoubleBuffer in, DoubleBuffer out,
                    @Cast("const fftw_r2r_kind*") IntBuffer kind, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_r2r(int rank, @Const int[] n, double[] in, double[] out,
                    @Cast("const fftw_r2r_kind*") int[] kind, @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_r2r_1d(int n, DoublePointer in, DoublePointer out,@Cast("fftw_r2r_kind") int kind, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_r2r_1d(int n, DoubleBuffer in, DoubleBuffer out,@Cast("fftw_r2r_kind") int kind, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_r2r_1d(int n, double[] in, double[] out,@Cast("fftw_r2r_kind") int kind, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_r2r_2d(int n0, int n1, DoublePointer in, DoublePointer out,@Cast("fftw_r2r_kind") int kind0,@Cast("fftw_r2r_kind") int kind1,
                       @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_r2r_2d(int n0, int n1, DoubleBuffer in, DoubleBuffer out,@Cast("fftw_r2r_kind") int kind0,@Cast("fftw_r2r_kind") int kind1,
                       @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_r2r_2d(int n0, int n1, double[] in, double[] out,@Cast("fftw_r2r_kind") int kind0,@Cast("fftw_r2r_kind") int kind1,
                       @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_r2r_3d(int n0, int n1, int n2, DoublePointer in, DoublePointer out,@Cast("fftw_r2r_kind") int kind0,@Cast("fftw_r2r_kind") int kind1,@Cast("fftw_r2r_kind") int kind2,
                       @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_r2r_3d(int n0, int n1, int n2, DoubleBuffer in, DoubleBuffer out,@Cast("fftw_r2r_kind") int kind0,@Cast("fftw_r2r_kind") int kind1,@Cast("fftw_r2r_kind") int kind2,
                       @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_r2r_3d(int n0, int n1, int n2, double[] in, double[] out,@Cast("fftw_r2r_kind") int kind0,@Cast("fftw_r2r_kind") int kind1,@Cast("fftw_r2r_kind") int kind2,
                       @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_guru_r2r(int rank, @Const fftw_iodim dims,
                         int howmany_rank,
                         @Const fftw_iodim howmany_dims, DoublePointer in, DoublePointer out,
                         @Cast("const fftw_r2r_kind*") IntPointer kind, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru_r2r(int rank, @Const fftw_iodim dims,
                         int howmany_rank,
                         @Const fftw_iodim howmany_dims, DoubleBuffer in, DoubleBuffer out,
                         @Cast("const fftw_r2r_kind*") IntBuffer kind, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru_r2r(int rank, @Const fftw_iodim dims,
                         int howmany_rank,
                         @Const fftw_iodim howmany_dims, double[] in, double[] out,
                         @Cast("const fftw_r2r_kind*") int[] kind, @Cast("unsigned") int flags);

public static native fftw_plan fftw_plan_guru64_r2r(int rank, @Const fftw_iodim64 dims,
                         int howmany_rank,
                         @Const fftw_iodim64 howmany_dims, DoublePointer in, DoublePointer out,
                         @Cast("const fftw_r2r_kind*") IntPointer kind, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru64_r2r(int rank, @Const fftw_iodim64 dims,
                         int howmany_rank,
                         @Const fftw_iodim64 howmany_dims, DoubleBuffer in, DoubleBuffer out,
                         @Cast("const fftw_r2r_kind*") IntBuffer kind, @Cast("unsigned") int flags);
public static native fftw_plan fftw_plan_guru64_r2r(int rank, @Const fftw_iodim64 dims,
                         int howmany_rank,
                         @Const fftw_iodim64 howmany_dims, double[] in, double[] out,
                         @Cast("const fftw_r2r_kind*") int[] kind, @Cast("unsigned") int flags);

public static native void fftw_execute_r2r(fftw_plan p, DoublePointer in, DoublePointer out);
public static native void fftw_execute_r2r(fftw_plan p, DoubleBuffer in, DoubleBuffer out);
public static native void fftw_execute_r2r(fftw_plan p, double[] in, double[] out);

public static native void fftw_destroy_plan(fftw_plan p);
public static native void fftw_forget_wisdom();
public static native void fftw_cleanup();

public static native void fftw_set_timelimit(double t);

public static native void fftw_plan_with_nthreads(int nthreads);
public static native int fftw_init_threads();
public static native void fftw_cleanup_threads();

public static native int fftw_export_wisdom_to_filename(@Cast("const char*") BytePointer filename);
public static native int fftw_export_wisdom_to_filename(String filename);
public static native void fftw_export_wisdom_to_file(@Cast("FILE*") Pointer output_file);
public static native @Cast("char*") BytePointer fftw_export_wisdom_to_string();
public static native void fftw_export_wisdom(@Cast("fftw_write_char_func") fftw_write_char_func_do_not_use_me write_char,
                                  Pointer data);
public static native int fftw_import_system_wisdom();
public static native int fftw_import_wisdom_from_filename(@Cast("const char*") BytePointer filename);
public static native int fftw_import_wisdom_from_filename(String filename);
public static native int fftw_import_wisdom_from_file(@Cast("FILE*") Pointer input_file);
public static native int fftw_import_wisdom_from_string(@Cast("const char*") BytePointer input_string);
public static native int fftw_import_wisdom_from_string(String input_string);
public static native int fftw_import_wisdom(@Cast("fftw_read_char_func") fftw_read_char_func_do_not_use_me read_char, Pointer data);

public static native void fftw_fprint_plan(fftw_plan p, @Cast("FILE*") Pointer output_file);
public static native void fftw_print_plan(fftw_plan p);
public static native @Cast("char*") BytePointer fftw_sprint_plan(fftw_plan p);

public static native Pointer fftw_malloc(@Cast("size_t") long n);
public static native DoublePointer fftw_alloc_real(@Cast("size_t") long n);
public static native @Cast("fftw_complex*") DoublePointer fftw_alloc_complex(@Cast("size_t") long n);
public static native void fftw_free(Pointer p);

public static native void fftw_flops(fftw_plan p,
                          DoublePointer add, DoublePointer mul, DoublePointer fmas);
public static native void fftw_flops(fftw_plan p,
                          DoubleBuffer add, DoubleBuffer mul, DoubleBuffer fmas);
public static native void fftw_flops(fftw_plan p,
                          double[] add, double[] mul, double[] fmas);
public static native double fftw_estimate_cost(fftw_plan p);
public static native double fftw_cost(fftw_plan p);

public static native int fftw_alignment_of( DoublePointer p);
public static native int fftw_alignment_of( DoubleBuffer p);
public static native int fftw_alignment_of( double[] p);
@MemberGetter public static native @Platform(not="windows") byte fftw_version(int i);
@MemberGetter public static native @Platform(not="windows") @Cast("const char*") BytePointer fftw_version();
@MemberGetter public static native @Platform(not="windows") byte fftw_cc(int i);
@MemberGetter public static native @Platform(not="windows") @Cast("const char*") BytePointer fftw_cc();
@MemberGetter public static native @Platform(not="windows") byte fftw_codelet_optim(int i);
@MemberGetter public static native @Platform(not="windows") @Cast("const char*") BytePointer fftw_codelet_optim();

@Name("fftwf_plan_s") @Opaque public static class fftwf_plan extends Pointer {
    /** Empty constructor. */
    public fftwf_plan() { }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public fftwf_plan(Pointer p) { super(p); }
}

@Opaque public static class fftwf_iodim extends Pointer {
    /** Empty constructor. */
    public fftwf_iodim() { }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public fftwf_iodim(Pointer p) { super(p); }
}
@Opaque public static class fftwf_iodim64 extends Pointer {
    /** Empty constructor. */
    public fftwf_iodim64() { }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public fftwf_iodim64(Pointer p) { super(p); }
}

public static native void fftwf_execute(fftwf_plan p);

public static native fftwf_plan fftwf_plan_dft(int rank, @Const IntPointer n, @Cast("fftwf_complex*") FloatPointer in, @Cast("fftwf_complex*") FloatPointer out, int sign, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft(int rank, @Const IntBuffer n, @Cast("fftwf_complex*") FloatBuffer in, @Cast("fftwf_complex*") FloatBuffer out, int sign, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft(int rank, @Const int[] n, @Cast("fftwf_complex*") float[] in, @Cast("fftwf_complex*") float[] out, int sign, @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_dft_1d(int n, @Cast("fftwf_complex*") FloatPointer in, @Cast("fftwf_complex*") FloatPointer out, int sign,
		       @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_1d(int n, @Cast("fftwf_complex*") FloatBuffer in, @Cast("fftwf_complex*") FloatBuffer out, int sign,
		       @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_1d(int n, @Cast("fftwf_complex*") float[] in, @Cast("fftwf_complex*") float[] out, int sign,
		       @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_2d(int n0, int n1, @Cast("fftwf_complex*") FloatPointer in, @Cast("fftwf_complex*") FloatPointer out, int sign, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_2d(int n0, int n1, @Cast("fftwf_complex*") FloatBuffer in, @Cast("fftwf_complex*") FloatBuffer out, int sign, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_2d(int n0, int n1, @Cast("fftwf_complex*") float[] in, @Cast("fftwf_complex*") float[] out, int sign, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_3d(int n0, int n1, int n2, @Cast("fftwf_complex*") FloatPointer in, @Cast("fftwf_complex*") FloatPointer out, int sign, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_3d(int n0, int n1, int n2, @Cast("fftwf_complex*") FloatBuffer in, @Cast("fftwf_complex*") FloatBuffer out, int sign, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_3d(int n0, int n1, int n2, @Cast("fftwf_complex*") float[] in, @Cast("fftwf_complex*") float[] out, int sign, @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_many_dft(int rank, @Const IntPointer n,
                         int howmany, @Cast("fftwf_complex*") FloatPointer in, @Const IntPointer inembed,
                         int istride, int idist, @Cast("fftwf_complex*") FloatPointer out, @Const IntPointer onembed,
                         int ostride, int odist,
                         int sign, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_many_dft(int rank, @Const IntBuffer n,
                         int howmany, @Cast("fftwf_complex*") FloatBuffer in, @Const IntBuffer inembed,
                         int istride, int idist, @Cast("fftwf_complex*") FloatBuffer out, @Const IntBuffer onembed,
                         int ostride, int odist,
                         int sign, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_many_dft(int rank, @Const int[] n,
                         int howmany, @Cast("fftwf_complex*") float[] in, @Const int[] inembed,
                         int istride, int idist, @Cast("fftwf_complex*") float[] out, @Const int[] onembed,
                         int ostride, int odist,
                         int sign, @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_guru_dft(int rank, @Const fftwf_iodim dims,
			 int howmany_rank,
			 @Const fftwf_iodim howmany_dims, @Cast("fftwf_complex*") FloatPointer in, @Cast("fftwf_complex*") FloatPointer out,
			 int sign, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru_dft(int rank, @Const fftwf_iodim dims,
			 int howmany_rank,
			 @Const fftwf_iodim howmany_dims, @Cast("fftwf_complex*") FloatBuffer in, @Cast("fftwf_complex*") FloatBuffer out,
			 int sign, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru_dft(int rank, @Const fftwf_iodim dims,
			 int howmany_rank,
			 @Const fftwf_iodim howmany_dims, @Cast("fftwf_complex*") float[] in, @Cast("fftwf_complex*") float[] out,
			 int sign, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru_split_dft(int rank, @Const fftwf_iodim dims,
			 int howmany_rank,
			 @Const fftwf_iodim howmany_dims, FloatPointer ri, FloatPointer ii, FloatPointer ro, FloatPointer io,
			 @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru_split_dft(int rank, @Const fftwf_iodim dims,
			 int howmany_rank,
			 @Const fftwf_iodim howmany_dims, FloatBuffer ri, FloatBuffer ii, FloatBuffer ro, FloatBuffer io,
			 @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru_split_dft(int rank, @Const fftwf_iodim dims,
			 int howmany_rank,
			 @Const fftwf_iodim howmany_dims, float[] ri, float[] ii, float[] ro, float[] io,
			 @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_guru64_dft(int rank,
                         @Const fftwf_iodim64 dims,
			 int howmany_rank,
			 @Const fftwf_iodim64 howmany_dims, @Cast("fftwf_complex*") FloatPointer in, @Cast("fftwf_complex*") FloatPointer out,
			 int sign, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru64_dft(int rank,
                         @Const fftwf_iodim64 dims,
			 int howmany_rank,
			 @Const fftwf_iodim64 howmany_dims, @Cast("fftwf_complex*") FloatBuffer in, @Cast("fftwf_complex*") FloatBuffer out,
			 int sign, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru64_dft(int rank,
                         @Const fftwf_iodim64 dims,
			 int howmany_rank,
			 @Const fftwf_iodim64 howmany_dims, @Cast("fftwf_complex*") float[] in, @Cast("fftwf_complex*") float[] out,
			 int sign, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru64_split_dft(int rank,
                         @Const fftwf_iodim64 dims,
			 int howmany_rank,
			 @Const fftwf_iodim64 howmany_dims, FloatPointer ri, FloatPointer ii, FloatPointer ro, FloatPointer io,
			 @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru64_split_dft(int rank,
                         @Const fftwf_iodim64 dims,
			 int howmany_rank,
			 @Const fftwf_iodim64 howmany_dims, FloatBuffer ri, FloatBuffer ii, FloatBuffer ro, FloatBuffer io,
			 @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru64_split_dft(int rank,
                         @Const fftwf_iodim64 dims,
			 int howmany_rank,
			 @Const fftwf_iodim64 howmany_dims, float[] ri, float[] ii, float[] ro, float[] io,
			 @Cast("unsigned") int flags);

public static native void fftwf_execute_dft(fftwf_plan p, @Cast("fftwf_complex*") FloatPointer in, @Cast("fftwf_complex*") FloatPointer out);
public static native void fftwf_execute_dft(fftwf_plan p, @Cast("fftwf_complex*") FloatBuffer in, @Cast("fftwf_complex*") FloatBuffer out);
public static native void fftwf_execute_dft(fftwf_plan p, @Cast("fftwf_complex*") float[] in, @Cast("fftwf_complex*") float[] out);
public static native void fftwf_execute_split_dft(fftwf_plan p, FloatPointer ri, FloatPointer ii, FloatPointer ro, FloatPointer io);
public static native void fftwf_execute_split_dft(fftwf_plan p, FloatBuffer ri, FloatBuffer ii, FloatBuffer ro, FloatBuffer io);
public static native void fftwf_execute_split_dft(fftwf_plan p, float[] ri, float[] ii, float[] ro, float[] io);

public static native fftwf_plan fftwf_plan_many_dft_r2c(int rank, @Const IntPointer n,
                             int howmany, FloatPointer in, @Const IntPointer inembed,
                             int istride, int idist, @Cast("fftwf_complex*") FloatPointer out, @Const IntPointer onembed,
                             int ostride, int odist,
                             @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_many_dft_r2c(int rank, @Const IntBuffer n,
                             int howmany, FloatBuffer in, @Const IntBuffer inembed,
                             int istride, int idist, @Cast("fftwf_complex*") FloatBuffer out, @Const IntBuffer onembed,
                             int ostride, int odist,
                             @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_many_dft_r2c(int rank, @Const int[] n,
                             int howmany, float[] in, @Const int[] inembed,
                             int istride, int idist, @Cast("fftwf_complex*") float[] out, @Const int[] onembed,
                             int ostride, int odist,
                             @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_dft_r2c(int rank, @Const IntPointer n, FloatPointer in, @Cast("fftwf_complex*") FloatPointer out, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_r2c(int rank, @Const IntBuffer n, FloatBuffer in, @Cast("fftwf_complex*") FloatBuffer out, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_r2c(int rank, @Const int[] n, float[] in, @Cast("fftwf_complex*") float[] out, @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_dft_r2c_1d(int n, FloatPointer in, @Cast("fftwf_complex*") FloatPointer out,@Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_r2c_1d(int n, FloatBuffer in, @Cast("fftwf_complex*") FloatBuffer out,@Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_r2c_1d(int n, float[] in, @Cast("fftwf_complex*") float[] out,@Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_r2c_2d(int n0, int n1, FloatPointer in, @Cast("fftwf_complex*") FloatPointer out, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_r2c_2d(int n0, int n1, FloatBuffer in, @Cast("fftwf_complex*") FloatBuffer out, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_r2c_2d(int n0, int n1, float[] in, @Cast("fftwf_complex*") float[] out, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_r2c_3d(int n0, int n1,
			   int n2, FloatPointer in, @Cast("fftwf_complex*") FloatPointer out, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_r2c_3d(int n0, int n1,
			   int n2, FloatBuffer in, @Cast("fftwf_complex*") FloatBuffer out, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_r2c_3d(int n0, int n1,
			   int n2, float[] in, @Cast("fftwf_complex*") float[] out, @Cast("unsigned") int flags);


public static native fftwf_plan fftwf_plan_many_dft_c2r(int rank, @Const IntPointer n,
			     int howmany, @Cast("fftwf_complex*") FloatPointer in, @Const IntPointer inembed,
			     int istride, int idist, FloatPointer out, @Const IntPointer onembed,
			     int ostride, int odist,
			     @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_many_dft_c2r(int rank, @Const IntBuffer n,
			     int howmany, @Cast("fftwf_complex*") FloatBuffer in, @Const IntBuffer inembed,
			     int istride, int idist, FloatBuffer out, @Const IntBuffer onembed,
			     int ostride, int odist,
			     @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_many_dft_c2r(int rank, @Const int[] n,
			     int howmany, @Cast("fftwf_complex*") float[] in, @Const int[] inembed,
			     int istride, int idist, float[] out, @Const int[] onembed,
			     int ostride, int odist,
			     @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_dft_c2r(int rank, @Const IntPointer n, @Cast("fftwf_complex*") FloatPointer in, FloatPointer out, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_c2r(int rank, @Const IntBuffer n, @Cast("fftwf_complex*") FloatBuffer in, FloatBuffer out, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_c2r(int rank, @Const int[] n, @Cast("fftwf_complex*") float[] in, float[] out, @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_dft_c2r_1d(int n, @Cast("fftwf_complex*") FloatPointer in, FloatPointer out,@Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_c2r_1d(int n, @Cast("fftwf_complex*") FloatBuffer in, FloatBuffer out,@Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_c2r_1d(int n, @Cast("fftwf_complex*") float[] in, float[] out,@Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_c2r_2d(int n0, int n1, @Cast("fftwf_complex*") FloatPointer in, FloatPointer out, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_c2r_2d(int n0, int n1, @Cast("fftwf_complex*") FloatBuffer in, FloatBuffer out, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_c2r_2d(int n0, int n1, @Cast("fftwf_complex*") float[] in, float[] out, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_c2r_3d(int n0, int n1,
			   int n2, @Cast("fftwf_complex*") FloatPointer in, FloatPointer out, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_c2r_3d(int n0, int n1,
			   int n2, @Cast("fftwf_complex*") FloatBuffer in, FloatBuffer out, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_dft_c2r_3d(int n0, int n1,
			   int n2, @Cast("fftwf_complex*") float[] in, float[] out, @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_guru_dft_r2c(int rank, @Const fftwf_iodim dims,
			     int howmany_rank,
			     @Const fftwf_iodim howmany_dims, FloatPointer in, @Cast("fftwf_complex*") FloatPointer out,
			     @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru_dft_r2c(int rank, @Const fftwf_iodim dims,
			     int howmany_rank,
			     @Const fftwf_iodim howmany_dims, FloatBuffer in, @Cast("fftwf_complex*") FloatBuffer out,
			     @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru_dft_r2c(int rank, @Const fftwf_iodim dims,
			     int howmany_rank,
			     @Const fftwf_iodim howmany_dims, float[] in, @Cast("fftwf_complex*") float[] out,
			     @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru_dft_c2r(int rank, @Const fftwf_iodim dims,
			     int howmany_rank,
			     @Const fftwf_iodim howmany_dims, @Cast("fftwf_complex*") FloatPointer in, FloatPointer out,
			     @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru_dft_c2r(int rank, @Const fftwf_iodim dims,
			     int howmany_rank,
			     @Const fftwf_iodim howmany_dims, @Cast("fftwf_complex*") FloatBuffer in, FloatBuffer out,
			     @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru_dft_c2r(int rank, @Const fftwf_iodim dims,
			     int howmany_rank,
			     @Const fftwf_iodim howmany_dims, @Cast("fftwf_complex*") float[] in, float[] out,
			     @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_guru_split_dft_r2c(
                             int rank, @Const fftwf_iodim dims,
			     int howmany_rank,
			     @Const fftwf_iodim howmany_dims, FloatPointer in, FloatPointer ro, FloatPointer io,
			     @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru_split_dft_r2c(
                             int rank, @Const fftwf_iodim dims,
			     int howmany_rank,
			     @Const fftwf_iodim howmany_dims, FloatBuffer in, FloatBuffer ro, FloatBuffer io,
			     @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru_split_dft_r2c(
                             int rank, @Const fftwf_iodim dims,
			     int howmany_rank,
			     @Const fftwf_iodim howmany_dims, float[] in, float[] ro, float[] io,
			     @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru_split_dft_c2r(
                             int rank, @Const fftwf_iodim dims,
			     int howmany_rank,
			     @Const fftwf_iodim howmany_dims, FloatPointer ri, FloatPointer ii, FloatPointer out,
			     @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru_split_dft_c2r(
                             int rank, @Const fftwf_iodim dims,
			     int howmany_rank,
			     @Const fftwf_iodim howmany_dims, FloatBuffer ri, FloatBuffer ii, FloatBuffer out,
			     @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru_split_dft_c2r(
                             int rank, @Const fftwf_iodim dims,
			     int howmany_rank,
			     @Const fftwf_iodim howmany_dims, float[] ri, float[] ii, float[] out,
			     @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_guru64_dft_r2c(int rank,
                             @Const fftwf_iodim64 dims,
			     int howmany_rank,
			     @Const fftwf_iodim64 howmany_dims, FloatPointer in, @Cast("fftwf_complex*") FloatPointer out,
			     @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru64_dft_r2c(int rank,
                             @Const fftwf_iodim64 dims,
			     int howmany_rank,
			     @Const fftwf_iodim64 howmany_dims, FloatBuffer in, @Cast("fftwf_complex*") FloatBuffer out,
			     @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru64_dft_r2c(int rank,
                             @Const fftwf_iodim64 dims,
			     int howmany_rank,
			     @Const fftwf_iodim64 howmany_dims, float[] in, @Cast("fftwf_complex*") float[] out,
			     @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru64_dft_c2r(int rank,
                             @Const fftwf_iodim64 dims,
			     int howmany_rank,
			     @Const fftwf_iodim64 howmany_dims, @Cast("fftwf_complex*") FloatPointer in, FloatPointer out,
			     @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru64_dft_c2r(int rank,
                             @Const fftwf_iodim64 dims,
			     int howmany_rank,
			     @Const fftwf_iodim64 howmany_dims, @Cast("fftwf_complex*") FloatBuffer in, FloatBuffer out,
			     @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru64_dft_c2r(int rank,
                             @Const fftwf_iodim64 dims,
			     int howmany_rank,
			     @Const fftwf_iodim64 howmany_dims, @Cast("fftwf_complex*") float[] in, float[] out,
			     @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_guru64_split_dft_r2c(
                             int rank, @Const fftwf_iodim64 dims,
			     int howmany_rank,
			     @Const fftwf_iodim64 howmany_dims, FloatPointer in, FloatPointer ro, FloatPointer io,
			     @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru64_split_dft_r2c(
                             int rank, @Const fftwf_iodim64 dims,
			     int howmany_rank,
			     @Const fftwf_iodim64 howmany_dims, FloatBuffer in, FloatBuffer ro, FloatBuffer io,
			     @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru64_split_dft_r2c(
                             int rank, @Const fftwf_iodim64 dims,
			     int howmany_rank,
			     @Const fftwf_iodim64 howmany_dims, float[] in, float[] ro, float[] io,
			     @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru64_split_dft_c2r(
                             int rank, @Const fftwf_iodim64 dims,
			     int howmany_rank,
			     @Const fftwf_iodim64 howmany_dims, FloatPointer ri, FloatPointer ii, FloatPointer out,
			     @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru64_split_dft_c2r(
                             int rank, @Const fftwf_iodim64 dims,
			     int howmany_rank,
			     @Const fftwf_iodim64 howmany_dims, FloatBuffer ri, FloatBuffer ii, FloatBuffer out,
			     @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru64_split_dft_c2r(
                             int rank, @Const fftwf_iodim64 dims,
			     int howmany_rank,
			     @Const fftwf_iodim64 howmany_dims, float[] ri, float[] ii, float[] out,
			     @Cast("unsigned") int flags);

public static native void fftwf_execute_dft_r2c(fftwf_plan p, FloatPointer in, @Cast("fftwf_complex*") FloatPointer out);
public static native void fftwf_execute_dft_r2c(fftwf_plan p, FloatBuffer in, @Cast("fftwf_complex*") FloatBuffer out);
public static native void fftwf_execute_dft_r2c(fftwf_plan p, float[] in, @Cast("fftwf_complex*") float[] out);
public static native void fftwf_execute_dft_c2r(fftwf_plan p, @Cast("fftwf_complex*") FloatPointer in, FloatPointer out);
public static native void fftwf_execute_dft_c2r(fftwf_plan p, @Cast("fftwf_complex*") FloatBuffer in, FloatBuffer out);
public static native void fftwf_execute_dft_c2r(fftwf_plan p, @Cast("fftwf_complex*") float[] in, float[] out);

public static native void fftwf_execute_split_dft_r2c(fftwf_plan p, FloatPointer in, FloatPointer ro, FloatPointer io);
public static native void fftwf_execute_split_dft_r2c(fftwf_plan p, FloatBuffer in, FloatBuffer ro, FloatBuffer io);
public static native void fftwf_execute_split_dft_r2c(fftwf_plan p, float[] in, float[] ro, float[] io);
public static native void fftwf_execute_split_dft_c2r(fftwf_plan p, FloatPointer ri, FloatPointer ii, FloatPointer out);
public static native void fftwf_execute_split_dft_c2r(fftwf_plan p, FloatBuffer ri, FloatBuffer ii, FloatBuffer out);
public static native void fftwf_execute_split_dft_c2r(fftwf_plan p, float[] ri, float[] ii, float[] out);

public static native fftwf_plan fftwf_plan_many_r2r(int rank, @Const IntPointer n,
                         int howmany, FloatPointer in, @Const IntPointer inembed,
                         int istride, int idist, FloatPointer out, @Const IntPointer onembed,
                         int ostride, int odist,
                         @Cast("const fftwf_r2r_kind*") IntPointer kind, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_many_r2r(int rank, @Const IntBuffer n,
                         int howmany, FloatBuffer in, @Const IntBuffer inembed,
                         int istride, int idist, FloatBuffer out, @Const IntBuffer onembed,
                         int ostride, int odist,
                         @Cast("const fftwf_r2r_kind*") IntBuffer kind, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_many_r2r(int rank, @Const int[] n,
                         int howmany, float[] in, @Const int[] inembed,
                         int istride, int idist, float[] out, @Const int[] onembed,
                         int ostride, int odist,
                         @Cast("const fftwf_r2r_kind*") int[] kind, @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_r2r(int rank, @Const IntPointer n, FloatPointer in, FloatPointer out,
                    @Cast("const fftwf_r2r_kind*") IntPointer kind, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_r2r(int rank, @Const IntBuffer n, FloatBuffer in, FloatBuffer out,
                    @Cast("const fftwf_r2r_kind*") IntBuffer kind, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_r2r(int rank, @Const int[] n, float[] in, float[] out,
                    @Cast("const fftwf_r2r_kind*") int[] kind, @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_r2r_1d(int n, FloatPointer in, FloatPointer out,@Cast("fftwf_r2r_kind") int kind, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_r2r_1d(int n, FloatBuffer in, FloatBuffer out,@Cast("fftwf_r2r_kind") int kind, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_r2r_1d(int n, float[] in, float[] out,@Cast("fftwf_r2r_kind") int kind, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_r2r_2d(int n0, int n1, FloatPointer in, FloatPointer out,@Cast("fftwf_r2r_kind") int kind0,@Cast("fftwf_r2r_kind") int kind1,
                       @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_r2r_2d(int n0, int n1, FloatBuffer in, FloatBuffer out,@Cast("fftwf_r2r_kind") int kind0,@Cast("fftwf_r2r_kind") int kind1,
                       @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_r2r_2d(int n0, int n1, float[] in, float[] out,@Cast("fftwf_r2r_kind") int kind0,@Cast("fftwf_r2r_kind") int kind1,
                       @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_r2r_3d(int n0, int n1, int n2, FloatPointer in, FloatPointer out,@Cast("fftwf_r2r_kind") int kind0,@Cast("fftwf_r2r_kind") int kind1,@Cast("fftwf_r2r_kind") int kind2,
                       @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_r2r_3d(int n0, int n1, int n2, FloatBuffer in, FloatBuffer out,@Cast("fftwf_r2r_kind") int kind0,@Cast("fftwf_r2r_kind") int kind1,@Cast("fftwf_r2r_kind") int kind2,
                       @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_r2r_3d(int n0, int n1, int n2, float[] in, float[] out,@Cast("fftwf_r2r_kind") int kind0,@Cast("fftwf_r2r_kind") int kind1,@Cast("fftwf_r2r_kind") int kind2,
                       @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_guru_r2r(int rank, @Const fftwf_iodim dims,
                         int howmany_rank,
                         @Const fftwf_iodim howmany_dims, FloatPointer in, FloatPointer out,
                         @Cast("const fftwf_r2r_kind*") IntPointer kind, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru_r2r(int rank, @Const fftwf_iodim dims,
                         int howmany_rank,
                         @Const fftwf_iodim howmany_dims, FloatBuffer in, FloatBuffer out,
                         @Cast("const fftwf_r2r_kind*") IntBuffer kind, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru_r2r(int rank, @Const fftwf_iodim dims,
                         int howmany_rank,
                         @Const fftwf_iodim howmany_dims, float[] in, float[] out,
                         @Cast("const fftwf_r2r_kind*") int[] kind, @Cast("unsigned") int flags);

public static native fftwf_plan fftwf_plan_guru64_r2r(int rank, @Const fftwf_iodim64 dims,
                         int howmany_rank,
                         @Const fftwf_iodim64 howmany_dims, FloatPointer in, FloatPointer out,
                         @Cast("const fftwf_r2r_kind*") IntPointer kind, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru64_r2r(int rank, @Const fftwf_iodim64 dims,
                         int howmany_rank,
                         @Const fftwf_iodim64 howmany_dims, FloatBuffer in, FloatBuffer out,
                         @Cast("const fftwf_r2r_kind*") IntBuffer kind, @Cast("unsigned") int flags);
public static native fftwf_plan fftwf_plan_guru64_r2r(int rank, @Const fftwf_iodim64 dims,
                         int howmany_rank,
                         @Const fftwf_iodim64 howmany_dims, float[] in, float[] out,
                         @Cast("const fftwf_r2r_kind*") int[] kind, @Cast("unsigned") int flags);

public static native void fftwf_execute_r2r(fftwf_plan p, FloatPointer in, FloatPointer out);
public static native void fftwf_execute_r2r(fftwf_plan p, FloatBuffer in, FloatBuffer out);
public static native void fftwf_execute_r2r(fftwf_plan p, float[] in, float[] out);

public static native void fftwf_destroy_plan(fftwf_plan p);
public static native void fftwf_forget_wisdom();
public static native void fftwf_cleanup();

public static native void fftwf_set_timelimit(double t);

public static native void fftwf_plan_with_nthreads(int nthreads);
public static native int fftwf_init_threads();
public static native void fftwf_cleanup_threads();

public static native int fftwf_export_wisdom_to_filename(@Cast("const char*") BytePointer filename);
public static native int fftwf_export_wisdom_to_filename(String filename);
public static native void fftwf_export_wisdom_to_file(@Cast("FILE*") Pointer output_file);
public static native @Cast("char*") BytePointer fftwf_export_wisdom_to_string();
public static native void fftwf_export_wisdom(@Cast("fftwf_write_char_func") fftw_write_char_func_do_not_use_me write_char,
                                  Pointer data);
public static native int fftwf_import_system_wisdom();
public static native int fftwf_import_wisdom_from_filename(@Cast("const char*") BytePointer filename);
public static native int fftwf_import_wisdom_from_filename(String filename);
public static native int fftwf_import_wisdom_from_file(@Cast("FILE*") Pointer input_file);
public static native int fftwf_import_wisdom_from_string(@Cast("const char*") BytePointer input_string);
public static native int fftwf_import_wisdom_from_string(String input_string);
public static native int fftwf_import_wisdom(@Cast("fftwf_read_char_func") fftw_read_char_func_do_not_use_me read_char, Pointer data);

public static native void fftwf_fprint_plan(fftwf_plan p, @Cast("FILE*") Pointer output_file);
public static native void fftwf_print_plan(fftwf_plan p);
public static native @Cast("char*") BytePointer fftwf_sprint_plan(fftwf_plan p);

public static native Pointer fftwf_malloc(@Cast("size_t") long n);
public static native FloatPointer fftwf_alloc_real(@Cast("size_t") long n);
public static native @Cast("fftwf_complex*") FloatPointer fftwf_alloc_complex(@Cast("size_t") long n);
public static native void fftwf_free(Pointer p);

public static native void fftwf_flops(fftwf_plan p,
                          DoublePointer add, DoublePointer mul, DoublePointer fmas);
public static native void fftwf_flops(fftwf_plan p,
                          DoubleBuffer add, DoubleBuffer mul, DoubleBuffer fmas);
public static native void fftwf_flops(fftwf_plan p,
                          double[] add, double[] mul, double[] fmas);
public static native double fftwf_estimate_cost(fftwf_plan p);
public static native double fftwf_cost(fftwf_plan p);

public static native int fftwf_alignment_of( FloatPointer p);
public static native int fftwf_alignment_of( FloatBuffer p);
public static native int fftwf_alignment_of( float[] p);
@MemberGetter public static native @Platform(not="windows") byte fftwf_version(int i);
@MemberGetter public static native @Platform(not="windows") @Cast("const char*") BytePointer fftwf_version();
@MemberGetter public static native @Platform(not="windows") byte fftwf_cc(int i);
@MemberGetter public static native @Platform(not="windows") @Cast("const char*") BytePointer fftwf_cc();
@MemberGetter public static native @Platform(not="windows") byte fftwf_codelet_optim(int i);
@MemberGetter public static native @Platform(not="windows") @Cast("const char*") BytePointer fftwf_codelet_optim();

/* __float128 (quad precision) is a gcc extension on i386, x86_64, and ia64
   for gcc >= 4.6 (compiled in FFTW with --enable-quad-precision) */
// #if (__GNUC__ > 4 || (__GNUC__ == 4 && __GNUC_MINOR__ >= 6))
//  && !(defined(__ICC) || defined(__INTEL_COMPILER))
//  && (defined(__i386__) || defined(__x86_64__) || defined(__ia64__))
// #  if !defined(FFTW_NO_Complex) && defined(_Complex_I) && defined(complex) && defined(I)
// #  endif
// #endif

public static final int FFTW_FORWARD = (-1);
public static final int FFTW_BACKWARD = (+1);

public static final double FFTW_NO_TIMELIMIT = (-1.0);

/* documented flags */
public static final long FFTW_MEASURE = (0L);
public static final long FFTW_DESTROY_INPUT = (1L << 0);
public static final long FFTW_UNALIGNED = (1L << 1);
public static final long FFTW_CONSERVE_MEMORY = (1L << 2);
public static final long FFTW_EXHAUSTIVE = (1L << 3); /* NO_EXHAUSTIVE is default */
public static final long FFTW_PRESERVE_INPUT = (1L << 4); /* cancels FFTW_DESTROY_INPUT */
public static final long FFTW_PATIENT = (1L << 5); /* IMPATIENT is default */
public static final long FFTW_ESTIMATE = (1L << 6);
public static final long FFTW_WISDOM_ONLY = (1L << 21);

/* undocumented beyond-guru flags */
public static final long FFTW_ESTIMATE_PATIENT = (1L << 7);
public static final long FFTW_BELIEVE_PCOST = (1L << 8);
public static final long FFTW_NO_DFT_R2HC = (1L << 9);
public static final long FFTW_NO_NONTHREADED = (1L << 10);
public static final long FFTW_NO_BUFFERING = (1L << 11);
public static final long FFTW_NO_INDIRECT_OP = (1L << 12);
public static final long FFTW_ALLOW_LARGE_GENERIC = (1L << 13); /* NO_LARGE_GENERIC is default */
public static final long FFTW_NO_RANK_SPLITS = (1L << 14);
public static final long FFTW_NO_VRANK_SPLITS = (1L << 15);
public static final long FFTW_NO_VRECURSE = (1L << 16);
public static final long FFTW_NO_SIMD = (1L << 17);
public static final long FFTW_NO_SLOW = (1L << 18);
public static final long FFTW_NO_FIXED_RADIX_LARGE_N = (1L << 19);
public static final long FFTW_ALLOW_PRUNING = (1L << 20);

// #ifdef __cplusplus  /* extern "C" */
// #endif /* __cplusplus */

// #endif /* FFTW3_H */


}
