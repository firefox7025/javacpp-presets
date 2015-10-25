// Targeted by JavaCPP version 1.1

package org.bytedeco.javacpp;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

public class ARToolKitPlus extends org.bytedeco.javacpp.presets.ARToolKitPlus {
    static { Loader.load(); }

// Parsed from ARToolKitPlus_plus.h

// #include <assert.h>
// #include <ARToolKitPlus/arBitFieldPattern.h>
// #include <ARToolKitPlus/TrackerMultiMarker.h>
// #include <ARToolKitPlus/TrackerSingleMarker.h>

@Namespace("ARToolKitPlus") public static native void createImagePattern(@Cast("ARToolKitPlus::IDPATTERN") long nPattern, @Cast("uint8_t*") BytePointer dataPtr);
@Namespace("ARToolKitPlus") public static native void createImagePattern(@Cast("ARToolKitPlus::IDPATTERN") long nPattern, @Cast("uint8_t*") ByteBuffer dataPtr);
@Namespace("ARToolKitPlus") public static native void createImagePattern(@Cast("ARToolKitPlus::IDPATTERN") long nPattern, @Cast("uint8_t*") byte[] dataPtr);

@Namespace("ARToolKitPlus") public static native void createImagePatternBCH(int nID, @Cast("uint8_t*") BytePointer dataPtr);
@Namespace("ARToolKitPlus") public static native void createImagePatternBCH(int nID, @Cast("uint8_t*") ByteBuffer dataPtr);
@Namespace("ARToolKitPlus") public static native void createImagePatternBCH(int nID, @Cast("uint8_t*") byte[] dataPtr);

@Namespace("ARToolKitPlus") public static native void createImagePatternSimple(int nID, @Cast("uint8_t*") BytePointer dataPtr);
@Namespace("ARToolKitPlus") public static native void createImagePatternSimple(int nID, @Cast("uint8_t*") ByteBuffer dataPtr);
@Namespace("ARToolKitPlus") public static native void createImagePatternSimple(int nID, @Cast("uint8_t*") byte[] dataPtr);

public static final int MAX_PATTERNS = 256;

@Namespace("ARToolKitPlus") public static class SingleTracker extends TrackerSingleMarker {
    static { Loader.load(); }
    /** Empty constructor. */
    public SingleTracker() { }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SingleTracker(Pointer p) { super(p); }

    public SingleTracker(int width, int height) { allocate(width, height); }
    private native void allocate(int width, int height);
}

@Namespace("ARToolKitPlus") public static class MultiTracker extends TrackerMultiMarker {
    static { Loader.load(); }
    /** Empty constructor. */
    public MultiTracker() { }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MultiTracker(Pointer p) { super(p); }

    public MultiTracker(int width, int height) { allocate(width, height); }
    private native void allocate(int width, int height);
}





// Parsed from <ARToolKitPlus/ARToolKitPlus.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Daniel Wagner
 */

// #ifndef __ARTOOLKITPLUS_HEADERFILE__
// #define __ARTOOLKITPLUS_HEADERFILE__

// #include <vector>

public static final int ARTOOLKITPLUS_VERSION_MAJOR = 2;
public static final int ARTOOLKITPLUS_VERSION_MINOR = 2;

/** enum ARToolKitPlus::PIXEL_FORMAT */
public static final int
    PIXEL_FORMAT_ABGR = 1,
    PIXEL_FORMAT_BGRA = 2,
    PIXEL_FORMAT_BGR = 3,
    PIXEL_FORMAT_RGBA = 4,
    PIXEL_FORMAT_RGB = 5,
    PIXEL_FORMAT_RGB565 = 6,
    PIXEL_FORMAT_LUM = 7;

/** enum ARToolKitPlus::UNDIST_MODE */
public static final int
    UNDIST_NONE = 0, UNDIST_STD = 1, UNDIST_LUT = 2;

/** enum ARToolKitPlus::IMAGE_PROC_MODE */
public static final int
    IMAGE_HALF_RES = 0, IMAGE_FULL_RES = 1;

/** enum ARToolKitPlus::HULL_TRACKING_MODE */
public static final int
    HULL_OFF = 0, HULL_FOUR = 1, HULL_FULL = 2;

// ARToolKitPlus versioning
/** enum ARToolKitPlus::ARTKP_VERSION */
public static final int
    VERSION_MAJOR =  ARTOOLKITPLUS_VERSION_MAJOR, VERSION_MINOR =  ARTOOLKITPLUS_VERSION_MINOR;

/** enum ARToolKitPlus::MARKER_MODE */
public static final int
    MARKER_TEMPLATE = 0, MARKER_ID_SIMPLE = 1, MARKER_ID_BCH = 2;

/** enum ARToolKitPlus::POSE_ESTIMATOR */
public static final int
    POSE_ESTIMATOR_ORIGINAL = 0, // original "normal" pose estimator
    POSE_ESTIMATOR_ORIGINAL_CONT = 1, // original "cont" pose estimator
    POSE_ESTIMATOR_RPP = 2; // new "Robust Planar Pose" estimator

@Namespace("ARToolKitPlus") @NoOffset public static class CornerPoint extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CornerPoint(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public CornerPoint(int size) { allocateArray(size); }
    private native void allocateArray(int size);
    @Override public CornerPoint position(int position) {
        return (CornerPoint)super.position(position);
    }

    public CornerPoint() { allocate(); }
    private native void allocate();

    public CornerPoint(int nX, int nY) { allocate(nX, nY); }
    private native void allocate(int nX, int nY);

    public native short x(); public native CornerPoint x(short x);
    public native short y(); public native CornerPoint y(short y);
}

 // namespace ARToolKitPlus


// #endif //__ARTOOLKITPLUS_HEADERFILE__


// Parsed from <ARToolKitPlus/config.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Daniel Wagner
 *  Pavel Rojtberg
 */


/**
 * This file is a stripped down version of AR Toolkit original
 * config.h file. Only defines necessary for the core toolkit
 * routines have been left. I tried to comment all variables in a
 * meaningful way. Please extend the comments if you have any idea!
 */

// #ifndef AR_CONFIG_H
// #define AR_CONFIG_H

// may be changed to double, float is particularly useful for PDA's
// #ifdef _USE_DOUBLE_
// #else
// #endif


/*------------------------------------------------------------
 * see 
 * http://www.hitl.washington.edu/people/grof/SharedSpace/Download/Doc/art240.html 
 * for an explanation of the next two define blocks
 */

// constants for variable arImageProcMode
// half mode is faster and useful for interlaced images
public static final int AR_IMAGE_PROC_IN_FULL =        0;
public static final int AR_IMAGE_PROC_IN_HALF =        1;
public static final int DEFAULT_IMAGE_PROC_MODE =     AR_IMAGE_PROC_IN_HALF;

// constants for variable arFittingMode
public static final int AR_FITTING_TO_IDEAL =          0;
public static final int AR_FITTING_TO_INPUT =          1;
public static final int DEFAULT_FITTING_MODE =        AR_FITTING_TO_IDEAL;

// constants for variable arTemplateMatchingMode
public static final int AR_TEMPLATE_MATCHING_COLOR =   0;
public static final int AR_TEMPLATE_MATCHING_BW =      1;
public static final int DEFAULT_TEMPLATE_MATCHING_MODE =     AR_TEMPLATE_MATCHING_COLOR;

// constant for variable arMatchingPCAMode
public static final int AR_MATCHING_WITHOUT_PCA =      0;
public static final int AR_MATCHING_WITH_PCA =         1;
public static final int DEFAULT_MATCHING_PCA_MODE =          AR_MATCHING_WITHOUT_PCA;


// constants influencing accuracy of arGetTransMat(...)
public static final int AR_GET_TRANS_MAT_MAX_LOOP_COUNT =         5;
public static final double AR_GET_TRANS_MAT_MAX_FIT_ERROR =          1.0;
// criterium for arGetTransMatCont(...) to call 
// arGetTransMat(...) instead
public static final double AR_GET_TRANS_CONT_MAT_MAX_FIT_ERROR =     1.0;

// min/max area of fiducial interiors to be matched
// against templates, used in arDetectMarker.c
public static final int AR_AREA_MAX =      100000;
public static final int AR_AREA_MIN =          70;

// used in arDetectMarker2(...), this param controls the
// maximum number of potential markers evaluated further.
// Only the first AR_SQUARE_MAX patterns are examined.
//#define   AR_SQUARE_MAX        50
// plays some role in arDetectMarker2 I don't understand yet
public static final int AR_CHAIN_MAX =      10000;

public static final int EVEC_MAX =     10;
public static final int P_MAX =       500;

//#define SMALL_LUM8_TABLE

// #ifdef SMALL_LUM8_TABLE
//   #define getLUM8_from_RGB565(ptr)   RGB565_to_LUM8_LUT[ (*(unsigned short*)(ptr))>>6 ]
// #else
//   #define getLUM8_from_RGB565(ptr)   RGB565_to_LUM8_LUT[ (*(unsigned short*)(ptr))    ]
// #endif //SMALL_LUM8_TABLE

// disable VisualStudio warnings 
// #if defined(_MSC_VER) && !defined(AR_ENABLE_MSVC_WARNINGS)
//     #pragma warning( disable : 4244 )
//     #pragma warning( disable : 4251 )
//     #pragma warning( disable : 4275 )
//     #pragma warning( disable : 4512 )
//     #pragma warning( disable : 4267 )
//     #pragma warning( disable : 4702 )
//     #pragma warning( disable : 4511 )
// #endif

// Support for Visual Studio compilation
// #if defined(AR_STATIC)
// 	#define AR_EXPORT 
// #else
// 	#if defined(_MSC_VER) || defined(__CYGWIN__) || defined(__MINGW32__) || defined( __BCPLUSPLUS__)  || defined( __MWERKS__)
// 		#  if defined( AR_LIBRARY )
// 		#    define AR_EXPORT   __declspec(dllexport)
// 		#  else
// 		#    define AR_EXPORT   __declspec(dllimport)
// 		#  endif
// 	#else
// 		#  define AR_EXPORT
// 	#endif
// #endif

// #ifdef _MSC_VER
// # if (_MSC_VER >= 1300)
// #  define __STL_MEMBER_TEMPLATES
// # endif
// #endif

// #endif //  AR_CONFIG_H



// Parsed from <ARToolKitPlus/ar.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Daniel Wagner
 */

// #ifndef __ARTOOLKITAR_HEADERFILE__
// #define __ARTOOLKITAR_HEADERFILE__

// #include <stdlib.h>

// #include <ARToolKitPlus/config.h>
// #include <stdint.h>

// #define arMalloc(V,T,S)
// { if( ((V) = (T *)malloc( sizeof(T) * (S) )) == 0 )
// {printf("malloc error!!\n"); exit(1);} }

@Namespace("ARToolKitPlus") public static class ARMarkerInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ARMarkerInfo() { allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public ARMarkerInfo(int size) { allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ARMarkerInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public ARMarkerInfo position(int position) {
        return (ARMarkerInfo)super.position(position);
    }

    public native int area(); public native ARMarkerInfo area(int area);
    public native int id(); public native ARMarkerInfo id(int id);
    public native int dir(); public native ARMarkerInfo dir(int dir);
    public native @Cast("ARFloat") float cf(); public native ARMarkerInfo cf(float cf);
    public native @Cast("ARFloat") float pos(int i); public native ARMarkerInfo pos(int i, float pos);
    @MemberGetter public native @Cast("ARFloat*") FloatPointer pos();
    public native @Cast("ARFloat") float line(int i, int j); public native ARMarkerInfo line(int i, int j, float line);
    @MemberGetter public native @Cast("ARFloat(*)[3]") FloatPointer line();
    public native @Cast("ARFloat") float vertex(int i, int j); public native ARMarkerInfo vertex(int i, int j, float vertex);
    @MemberGetter public native @Cast("ARFloat(*)[2]") FloatPointer vertex();
}

@Namespace("ARToolKitPlus") public static class ARMarkerInfo2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ARMarkerInfo2() { allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public ARMarkerInfo2(int size) { allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ARMarkerInfo2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public ARMarkerInfo2 position(int position) {
        return (ARMarkerInfo2)super.position(position);
    }

    public native int area(); public native ARMarkerInfo2 area(int area);
    public native @Cast("ARFloat") float pos(int i); public native ARMarkerInfo2 pos(int i, float pos);
    @MemberGetter public native @Cast("ARFloat*") FloatPointer pos();
    public native int coord_num(); public native ARMarkerInfo2 coord_num(int coord_num);
    public native int x_coord(int i); public native ARMarkerInfo2 x_coord(int i, int x_coord);
    @MemberGetter public native IntPointer x_coord();
    public native int y_coord(int i); public native ARMarkerInfo2 y_coord(int i, int y_coord);
    @MemberGetter public native IntPointer y_coord();
    public native int vertex(int i); public native ARMarkerInfo2 vertex(int i, int vertex);
    @MemberGetter public native IntPointer vertex();
}

@Namespace("ARToolKitPlus") public static class arPrevInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public arPrevInfo() { allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public arPrevInfo(int size) { allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public arPrevInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public arPrevInfo position(int position) {
        return (arPrevInfo)super.position(position);
    }

    public native @ByRef ARMarkerInfo marker(); public native arPrevInfo marker(ARMarkerInfo marker);
    public native int count(); public native arPrevInfo count(int count);
}

 // namespace ARToolKitPlus


// #endif  //__ARTOOLKITAR_HEADERFILE__


// Parsed from <ARToolKitPlus/arMulti.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Daniel Wagner
 *  Pavel Rojtberg
 */


// #ifndef __ARTOOLKITMULTI_HEADERFILE__
// #define __ARTOOLKITMULTI_HEADERFILE__

// #include <ARToolKitPlus/config.h>

@Namespace("ARToolKitPlus") public static class ARMultiEachMarkerInfoT extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ARMultiEachMarkerInfoT() { allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public ARMultiEachMarkerInfoT(int size) { allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ARMultiEachMarkerInfoT(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public ARMultiEachMarkerInfoT position(int position) {
        return (ARMultiEachMarkerInfoT)super.position(position);
    }

    public native int patt_id(); public native ARMultiEachMarkerInfoT patt_id(int patt_id);
    public native @Cast("ARFloat") float width(); public native ARMultiEachMarkerInfoT width(float width);
    public native @Cast("ARFloat") float center(int i); public native ARMultiEachMarkerInfoT center(int i, float center);
    @MemberGetter public native @Cast("ARFloat*") FloatPointer center();
    public native @Cast("ARFloat") float trans(int i, int j); public native ARMultiEachMarkerInfoT trans(int i, int j, float trans);
    @MemberGetter public native @Cast("ARFloat(*)[4]") FloatPointer trans();
    public native @Cast("ARFloat") float itrans(int i, int j); public native ARMultiEachMarkerInfoT itrans(int i, int j, float itrans);
    @MemberGetter public native @Cast("ARFloat(*)[4]") FloatPointer itrans();
    public native @Cast("ARFloat") float pos3d(int i, int j); public native ARMultiEachMarkerInfoT pos3d(int i, int j, float pos3d);
    @MemberGetter public native @Cast("ARFloat(*)[3]") FloatPointer pos3d();
    public native int visible(); public native ARMultiEachMarkerInfoT visible(int visible);
/*---*/
    public native int visibleR(); public native ARMultiEachMarkerInfoT visibleR(int visibleR);
}

@Namespace("ARToolKitPlus") public static class ARMultiMarkerInfoT extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ARMultiMarkerInfoT() { allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public ARMultiMarkerInfoT(int size) { allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ARMultiMarkerInfoT(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public ARMultiMarkerInfoT position(int position) {
        return (ARMultiMarkerInfoT)super.position(position);
    }

    public native ARMultiEachMarkerInfoT marker(); public native ARMultiMarkerInfoT marker(ARMultiEachMarkerInfoT marker);
    public native int marker_num(); public native ARMultiMarkerInfoT marker_num(int marker_num);
    public native @Cast("ARFloat") float trans(int i, int j); public native ARMultiMarkerInfoT trans(int i, int j, float trans);
    @MemberGetter public native @Cast("ARFloat(*)[4]") FloatPointer trans();
    public native int prevF(); public native ARMultiMarkerInfoT prevF(int prevF);
/*---*/
    public native @Cast("ARFloat") float transR(int i, int j); public native ARMultiMarkerInfoT transR(int i, int j, float transR);
    @MemberGetter public native @Cast("ARFloat(*)[4]") FloatPointer transR();
}


 // namespace ARToolKitPlus


// #endif // __ARTOOLKITMULTI_HEADERFILE__


// Parsed from <ARToolKitPlus/matrix.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Daniel Wagner
 */

// #ifndef __ARTOOLKITMATRIX_HEADERFILE__
// #define __ARTOOLKITMATRIX_HEADERFILE__

// #include <ARToolKitPlus/config.h>

/* === matrix definition ===

 <---- clm --->
 [ 10  20  30 ] ^
 [ 20  10  15 ] |
 [ 12  23  13 ] row
 [ 20  10  15 ] |
 [ 13  14  15 ] v

 =========================== */

@Namespace("ARToolKitPlus") public static class ARMat extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ARMat() { allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public ARMat(int size) { allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ARMat(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public ARMat position(int position) {
        return (ARMat)super.position(position);
    }

    public native @Cast("ARFloat*") FloatPointer m(); public native ARMat m(FloatPointer m);
    public native int row(); public native ARMat row(int row);
    public native int clm(); public native ARMat clm(int clm);
}

/* 0 origin */
// #define ARELEM0(mat,r,c) ((mat)->m[(r)*((mat)->clm)+(c)])
/* 1 origin */
// #define ARELEM1(mat,row,clm) ARELEM0(mat,row-1,clm-1)

@Namespace("ARToolKitPlus::Matrix") public static native ARMat alloc(int row, int clm);
@Namespace("ARToolKitPlus::Matrix") public static native int free(ARMat m);

@Namespace("ARToolKitPlus::Matrix") public static native int dup(ARMat dest, ARMat source);
@Namespace("ARToolKitPlus::Matrix") public static native ARMat allocDup(ARMat source);

@Namespace("ARToolKitPlus::Matrix") public static native int mul(ARMat dest, ARMat a, ARMat b);
@Namespace("ARToolKitPlus::Matrix") public static native int selfInv(ARMat m);

 // namespace Matrix


 // namespace ARToolKitPlus


// #endif // __ARTOOLKITMATRIX_HEADERFILE__


// Parsed from <ARToolKitPlus/vector.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Daniel Wagner
 */

// #ifndef __ARTOOLKITVECTOR_HEADERFILE__
// #define __ARTOOLKITVECTOR_HEADERFILE__

// #include <ARToolKitPlus/config.h>

@Namespace("ARToolKitPlus") public static class ARVec extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ARVec() { allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public ARVec(int size) { allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ARVec(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public ARVec position(int position) {
        return (ARVec)super.position(position);
    }

	public native @Cast("ARFloat*") FloatPointer v(); public native ARVec v(FloatPointer v);
	public native int clm(); public native ARVec clm(int clm);
}
@Namespace("ARToolKitPlus::Vector") public static native ARVec alloc(int clm);
@Namespace("ARToolKitPlus::Vector") public static native int free(ARVec v);
@Namespace("ARToolKitPlus::Vector") public static native @Cast("ARFloat") float household(ARVec x);
@Namespace("ARToolKitPlus::Vector") public static native @Cast("ARFloat") float innerproduct(ARVec x, ARVec y);
@Namespace("ARToolKitPlus::Vector") public static native int tridiagonalize(ARMat a, ARVec d, ARVec e);


 // namespace ARToolKitPlus


// #endif // __ARTOOLKITVECTOR_HEADERFILE__


// Parsed from <ARToolKitPlus/Camera.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Thomas Pintaric
 *  Pavel Rojtberg
 */

// #pragma once

// #include <string>
// #include <ARToolKitPlus/config.h>

/**
 * this class used to be called ARParam in the classical ARToolkit
 * so do not wonder because of the method names
 */
@Namespace("ARToolKitPlus") @NoOffset public static class Camera extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Camera(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public Camera(int size) { allocateArray(size); }
    private native void allocateArray(int size);
    @Override public Camera position(int position) {
        return (Camera)super.position(position);
    }

    public Camera() { allocate(); }
    private native void allocate();

    public native int xsize(); public native Camera xsize(int xsize);
    public native int ysize(); public native Camera ysize(int ysize);
    // http://www.vision.caltech.edu/bouguetj/calib_doc/htmls/parameters.html
    public native @Cast("ARFloat") float mat(int i, int j); public native Camera mat(int i, int j, float mat);
    @MemberGetter public native @Cast("ARFloat(*)[4]") FloatPointer mat();
    public native @Cast("ARFloat") float kc(int i); public native Camera kc(int i, float kc);
    @MemberGetter public native @Cast("ARFloat*") FloatPointer kc();

    public native void observ2Ideal(@Cast("ARFloat") float ox, @Cast("ARFloat") float oy, @Cast("ARFloat*") FloatPointer ix, @Cast("ARFloat*") FloatPointer iy);
    public native void observ2Ideal(@Cast("ARFloat") float ox, @Cast("ARFloat") float oy, @Cast("ARFloat*") FloatBuffer ix, @Cast("ARFloat*") FloatBuffer iy);
    public native void observ2Ideal(@Cast("ARFloat") float ox, @Cast("ARFloat") float oy, @Cast("ARFloat*") float[] ix, @Cast("ARFloat*") float[] iy);
    public native void ideal2Observ(@Cast("ARFloat") float ix, @Cast("ARFloat") float iy, @Cast("ARFloat*") FloatPointer ox, @Cast("ARFloat*") FloatPointer oy);
    public native void ideal2Observ(@Cast("ARFloat") float ix, @Cast("ARFloat") float iy, @Cast("ARFloat*") FloatBuffer ox, @Cast("ARFloat*") FloatBuffer oy);
    public native void ideal2Observ(@Cast("ARFloat") float ix, @Cast("ARFloat") float iy, @Cast("ARFloat*") float[] ox, @Cast("ARFloat*") float[] oy);
    public native @Cast("bool") boolean loadFromFile(@StdString BytePointer filename);
    public native @Cast("bool") boolean loadFromFile(@StdString String filename);
    public native Camera clone();
    public native @Cast("bool") boolean changeFrameSize(int frameWidth, int frameHeight);
    public native void printSettings();
    public native @StdString BytePointer getFileName();
}

 // namespace ARToolKitPlus


// Parsed from <ARToolKitPlus/extra/BCH.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Thomas Pintaric
 *  Pavel Rojtberg
 */

// #ifndef __BCH_CODE__H__
// #define __BCH_CODE__H__

// #include <ARToolKitPlus/config.h>

// #include <vector>

// --------------------------------------------------------
// WARNING: It is *NOT SAFE* to alter the values below!

public static final int BCH_DEFAULT_M =       6;
public static final int BCH_DEFAULT_LENGTH = 36;
public static final int BCH_DEFAULT_T =       4;
public static final int BCH_DEFAULT_K =      12;

public static final int BCH_MAX_M =    6;
public static final int BCH_MAX_P =    7;  // MAX_M+1
public static final int BCH_MAX_LUT = 64;  // 2^MAX_M
public static final int BCH_MAX_SQ =   8;  // SQRT(MAX_LUT) -- (?)
// -------------------------------------------------------

// we only use unsigned __int64 under windows.
// have to use unsigned long long othersie...
// #if defined(_MSC_VER) || defined(_WIN32_WCE)
// #else
// #endif

//static bool _isBitSet(_64bits bn, int which_bit);
//static void _setBit(_64bits &bn, int which_bit);
/*
 static void _clearBit(_64bits &bn, int which_bit);
 static void _copyBit(_64bits &dest_n, const int dest_bit, const _64bits src_n, const int src_bit);
 static int _countOnes(const _64bits src_n);
 */

//static int* toBitPattern(int b[], _64bits n, int n_bits);
//static _64bits fromBitPattern(int b[], int n_bits);

// static void printBitPattern(_64bits n, int n_bits);


@Namespace("ARToolKitPlus") @NoOffset public static class BCH extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BCH(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public BCH(int size) { allocateArray(size); }
    private native void allocateArray(int size);
    @Override public BCH position(int position) {
        return (BCH)super.position(position);
    }

    public BCH() { allocate(); }
    private native void allocate();

    public native void encode(IntPointer encoded_bits, @Cast("const ARToolKitPlus::_64bits") long orig_n);
    public native void encode(IntBuffer encoded_bits, @Cast("const ARToolKitPlus::_64bits") long orig_n);
    public native void encode(int[] encoded_bits, @Cast("const ARToolKitPlus::_64bits") long orig_n);
    public native @Cast("bool") boolean decode(@ByRef IntPointer err_n, @Cast("ARToolKitPlus::_64bits*") @ByRef LongPointer orig_n, @Const IntPointer encoded_bits);
    public native @Cast("bool") boolean decode(@ByRef IntBuffer err_n, @Cast("ARToolKitPlus::_64bits*") @ByRef LongBuffer orig_n, @Const IntBuffer encoded_bits);
    public native @Cast("bool") boolean decode(@ByRef int[] err_n, @Cast("ARToolKitPlus::_64bits*") @ByRef long[] orig_n, @Const int[] encoded_bits);

    public native void encode(@Cast("ARToolKitPlus::_64bits*") @ByRef LongPointer encoded_n, @Cast("const ARToolKitPlus::_64bits") long orig_n);
    public native void encode(@Cast("ARToolKitPlus::_64bits*") @ByRef LongBuffer encoded_n, @Cast("const ARToolKitPlus::_64bits") long orig_n);
    public native void encode(@Cast("ARToolKitPlus::_64bits*") @ByRef long[] encoded_n, @Cast("const ARToolKitPlus::_64bits") long orig_n);
    public native @Cast("bool") boolean decode(@ByRef IntPointer err_n, @Cast("ARToolKitPlus::_64bits*") @ByRef LongPointer orig_n, @Cast("const ARToolKitPlus::_64bits") long encoded_n);
    public native @Cast("bool") boolean decode(@ByRef IntBuffer err_n, @Cast("ARToolKitPlus::_64bits*") @ByRef LongBuffer orig_n, @Cast("const ARToolKitPlus::_64bits") long encoded_n);
    public native @Cast("bool") boolean decode(@ByRef int[] err_n, @Cast("ARToolKitPlus::_64bits*") @ByRef long[] orig_n, @Cast("const ARToolKitPlus::_64bits") long encoded_n);
}

 // namespace ARToolKitPlus


// #endif // __BCH_CODE__H__


// Parsed from <ARToolKitPlus/extra/Hull.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Daniel Wagner
 *  Pavel Rojtberg
 */

// #ifndef __ARTOOLKITPLUS_HULL_HEADERFILE__
// #define __ARTOOLKITPLUS_HULL_HEADERFILE__

// #include <ARToolKitPlus/config.h>

@Namespace("ARToolKitPlus") @MemberGetter public static native int MAX_HULL_POINTS(); // support up to 16 visible markers


@Namespace("ARToolKitPlus") public static class MarkerPoint extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public MarkerPoint() { allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(int)}. */
    public MarkerPoint(int size) { allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MarkerPoint(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(int size);
    @Override public MarkerPoint position(int position) {
        return (MarkerPoint)super.position(position);
    }


    public native @Cast("ARToolKitPlus::MarkerPoint::coord_type") int x(); public native MarkerPoint x(int x);
    public native @Cast("ARToolKitPlus::MarkerPoint::coord_type") int y(); public native MarkerPoint y(int y);
    public native @Cast("unsigned short") short markerIdx(); public native MarkerPoint markerIdx(short markerIdx);
    public native @Cast("unsigned short") short cornerIdx(); public native MarkerPoint cornerIdx(short cornerIdx);
}

@Namespace("ARToolKitPlus") public static native int iabs(int nValue);

@Namespace("ARToolKitPlus") public static native int nearHull_2D(@Const MarkerPoint P, int n, int k, MarkerPoint H);

@Namespace("ARToolKitPlus") public static native void findLongestDiameter(@Const MarkerPoint nPoints, int nNumPoints, @ByRef IntPointer nIdx0, @ByRef IntPointer nIdx1);
@Namespace("ARToolKitPlus") public static native void findLongestDiameter(@Const MarkerPoint nPoints, int nNumPoints, @ByRef IntBuffer nIdx0, @ByRef IntBuffer nIdx1);
@Namespace("ARToolKitPlus") public static native void findLongestDiameter(@Const MarkerPoint nPoints, int nNumPoints, @ByRef int[] nIdx0, @ByRef int[] nIdx1);

@Namespace("ARToolKitPlus") public static native void findFurthestAway(@Const MarkerPoint nPoints, int nNumPoints, int nIdx0, int nIdx1, @ByRef IntPointer nIdxFarthest);
@Namespace("ARToolKitPlus") public static native void findFurthestAway(@Const MarkerPoint nPoints, int nNumPoints, int nIdx0, int nIdx1, @ByRef IntBuffer nIdxFarthest);
@Namespace("ARToolKitPlus") public static native void findFurthestAway(@Const MarkerPoint nPoints, int nNumPoints, int nIdx0, int nIdx1, @ByRef int[] nIdxFarthest);

@Namespace("ARToolKitPlus") public static native void maximizeArea(@Const MarkerPoint nPoints, int nNumPoints, int nIdx0, int nIdx1, int nIdx2, @ByRef IntPointer nIdxMax);
@Namespace("ARToolKitPlus") public static native void maximizeArea(@Const MarkerPoint nPoints, int nNumPoints, int nIdx0, int nIdx1, int nIdx2, @ByRef IntBuffer nIdxMax);
@Namespace("ARToolKitPlus") public static native void maximizeArea(@Const MarkerPoint nPoints, int nNumPoints, int nIdx0, int nIdx1, int nIdx2, @ByRef int[] nIdxMax);

@Namespace("ARToolKitPlus") public static native void sortIntegers(@ByRef IntPointer nIdx0, @ByRef IntPointer nIdx1, @ByRef IntPointer nIdx2);
@Namespace("ARToolKitPlus") public static native void sortIntegers(@ByRef IntBuffer nIdx0, @ByRef IntBuffer nIdx1, @ByRef IntBuffer nIdx2);
@Namespace("ARToolKitPlus") public static native void sortIntegers(@ByRef int[] nIdx0, @ByRef int[] nIdx1, @ByRef int[] nIdx2);

@Namespace("ARToolKitPlus") public static native void sortInLastInteger(@ByRef IntPointer nIdx0, @ByRef IntPointer nIdx1, @ByRef IntPointer nIdx2, @ByRef IntPointer nIdx3);
@Namespace("ARToolKitPlus") public static native void sortInLastInteger(@ByRef IntBuffer nIdx0, @ByRef IntBuffer nIdx1, @ByRef IntBuffer nIdx2, @ByRef IntBuffer nIdx3);
@Namespace("ARToolKitPlus") public static native void sortInLastInteger(@ByRef int[] nIdx0, @ByRef int[] nIdx1, @ByRef int[] nIdx2, @ByRef int[] nIdx3);

 // namespace ARToolKitPlus


// #endif //__ARTOOLKITPLUS_HULL_HEADERFILE__


// Parsed from <ARToolKitPlus/extra/rpp.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Thomas Pintaric
 */

// #ifndef __LINK_WITH_RPP__
// #define __LINK_WITH_RPP__

// #include <ARToolKitPlus/config.h>

public static native void robustPlanarPose(@Cast("rpp_float*") @ByRef DoublePointer err, @ByRef @Cast("double(*)[3][3]") PointerPointer R, @Cast("rpp_vec*") @ByRef PointerPointer t, @Cast("const rpp_float*") DoublePointer cc, @Cast("const rpp_float*") DoublePointer fc,
        @Cast("const rpp_vec*") PointerPointer model, @Cast("const rpp_vec*") PointerPointer iprts, @Cast("const unsigned int") int model_iprts_size, @Cast("double(*)[3]") DoublePointer R_init,
        @Cast("const bool") boolean estimate_R_init, @Cast("const rpp_float") double epsilon, @Cast("const rpp_float") double tolerance,
        @Cast("const unsigned int") int max_iterations);
public static native void robustPlanarPose(@Cast("rpp_float*") @ByRef DoubleBuffer err, @ByRef @Cast("double(*)[3][3]") PointerPointer R, @Cast("rpp_vec*") @ByRef PointerPointer t, @Cast("const rpp_float*") DoubleBuffer cc, @Cast("const rpp_float*") DoubleBuffer fc,
        @Cast("const rpp_vec*") PointerPointer model, @Cast("const rpp_vec*") PointerPointer iprts, @Cast("const unsigned int") int model_iprts_size, @Cast("double(*)[3]") DoublePointer R_init,
        @Cast("const bool") boolean estimate_R_init, @Cast("const rpp_float") double epsilon, @Cast("const rpp_float") double tolerance,
        @Cast("const unsigned int") int max_iterations);
public static native void robustPlanarPose(@Cast("rpp_float*") @ByRef double[] err, @ByRef @Cast("double(*)[3][3]") PointerPointer R, @Cast("rpp_vec*") @ByRef PointerPointer t, @Cast("const rpp_float*") double[] cc, @Cast("const rpp_float*") double[] fc,
        @Cast("const rpp_vec*") PointerPointer model, @Cast("const rpp_vec*") PointerPointer iprts, @Cast("const unsigned int") int model_iprts_size, @Cast("double(*)[3]") DoublePointer R_init,
        @Cast("const bool") boolean estimate_R_init, @Cast("const rpp_float") double epsilon, @Cast("const rpp_float") double tolerance,
        @Cast("const unsigned int") int max_iterations);

// #endif // __LINK_WITH_RPP__


// Parsed from <ARToolKitPlus/Tracker.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Daniel Wagner
 *  Pavel Rojtberg
 */

// #ifndef __ARTOOLKIT_TRACKERIMPL_HEADERFILE__
// #define __ARTOOLKIT_TRACKERIMPL_HEADERFILE__

// #include <ARToolKitPlus/ARToolKitPlus.h>
// #include <ARToolKitPlus/ar.h>
// #include <ARToolKitPlus/arMulti.h>
// #include <ARToolKitPlus/vector.h>
// #include <ARToolKitPlus/Camera.h>
// #include <ARToolKitPlus/extra/BCH.h>
// #include <ARToolKitPlus/extra/Hull.h>

// #include <algorithm>
// #include <vector>

/**
 * Tracker is the vision core of ARToolKit.
 * Almost all original ARToolKit methods are included here.
 * Exceptions: matrix & vector.
 *
 * Tracker includes all methods that are needed to create a
 * basic ARToolKit application (e.g. the simple example
 * from the original ARToolKit package)
 *
 * Application developers should usually prefer using the
 * more high level classes:
 *  - TrackerSingleMarker
 *  - TrackerMultiMarker
 */
@Namespace("ARToolKitPlus") @NoOffset public static class Tracker extends Pointer {
    static { Loader.load(); }
    /** Empty constructor. */
    public Tracker() { }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Tracker(Pointer p) { super(p); }

    public Tracker(int imWidth, int imHeight, int maxImagePatterns/*=8*/, int pattWidth/*=6*/, int pattHeight/*=6*/, int pattSamples/*=6*/,
                int maxLoadPatterns/*=0*/) { allocate(imWidth, imHeight, maxImagePatterns, pattWidth, pattHeight, pattSamples, maxLoadPatterns); }
    private native void allocate(int imWidth, int imHeight, int maxImagePatterns/*=8*/, int pattWidth/*=6*/, int pattHeight/*=6*/, int pattSamples/*=6*/,
                int maxLoadPatterns/*=0*/);
    public Tracker(int imWidth, int imHeight) { allocate(imWidth, imHeight); }
    private native void allocate(int imWidth, int imHeight);

    /**
     * Sets the pixel format of the camera image
     *  Default format is RGB888 (PIXEL_FORMAT_RGB)
     */
    public native @Cast("bool") boolean setPixelFormat(@Cast("ARToolKitPlus::PIXEL_FORMAT") int nFormat);

    /**
     * Loads a camera calibration file and stores data internally
     *  To prevent memory leaks, this method internally deletes an existing camera.
     *  If you want to use more than one camera, retrieve the existing camera using getCamera()
     *  and call setCamera(NULL); before loading another camera file.
     *  On destruction, ARToolKitPlus will only destroy the currently set camera. All other
     *  cameras have to be destroyed manually.
     */
    public native @Cast("bool") boolean loadCameraFile(@Cast("const char*") BytePointer nCamParamFile, @Cast("ARFloat") float nNearClip, @Cast("ARFloat") float nFarClip);
    public native @Cast("bool") boolean loadCameraFile(String nCamParamFile, @Cast("ARFloat") float nNearClip, @Cast("ARFloat") float nFarClip);

    /**
     * Set to true to try loading camera undistortion table from a cache file
     *  On slow platforms (e.g. Smartphone) creation of the undistortion lookup-table
     *  can take quite a while. Consequently caching will speedup the start phase.
     *  If set to true and no cache file could be found a new one will be created.
     *  The cache file will get the same name as the camera file with the added extension '.LUT'
     */
    public native void setLoadUndistLUT(@Cast("bool") boolean nSet);

    /** marker detection using tracking history */
    public native int arDetectMarker(@Cast("const uint8_t*") BytePointer dataPtr, int thresh, @Cast("ARToolKitPlus::ARMarkerInfo**") PointerPointer marker_info, IntPointer marker_num);
    public native int arDetectMarker(@Cast("const uint8_t*") BytePointer dataPtr, int thresh, @ByPtrPtr ARMarkerInfo marker_info, IntPointer marker_num);
    public native int arDetectMarker(@Cast("const uint8_t*") ByteBuffer dataPtr, int thresh, @ByPtrPtr ARMarkerInfo marker_info, IntBuffer marker_num);
    public native int arDetectMarker(@Cast("const uint8_t*") byte[] dataPtr, int thresh, @ByPtrPtr ARMarkerInfo marker_info, int[] marker_num);

    /** marker detection without using tracking history */
    public native int arDetectMarkerLite(@Cast("const uint8_t*") BytePointer dataPtr, int thresh, @Cast("ARToolKitPlus::ARMarkerInfo**") PointerPointer marker_info, IntPointer marker_num);
    public native int arDetectMarkerLite(@Cast("const uint8_t*") BytePointer dataPtr, int thresh, @ByPtrPtr ARMarkerInfo marker_info, IntPointer marker_num);
    public native int arDetectMarkerLite(@Cast("const uint8_t*") ByteBuffer dataPtr, int thresh, @ByPtrPtr ARMarkerInfo marker_info, IntBuffer marker_num);
    public native int arDetectMarkerLite(@Cast("const uint8_t*") byte[] dataPtr, int thresh, @ByPtrPtr ARMarkerInfo marker_info, int[] marker_num);

    /** calculates the transformation matrix between camera and the given multi-marker config */
    public native @Cast("ARFloat") float arMultiGetTransMat(ARMarkerInfo marker_info, int marker_num, ARMultiMarkerInfoT config);

    public native @Cast("ARFloat") float arMultiGetTransMatHull(ARMarkerInfo marker_info, int marker_num, ARMultiMarkerInfoT config);

    /** calculates the transformation matrix between camera and the given marker */
    public native @Cast("ARFloat") float arGetTransMat(ARMarkerInfo marker_info, @Cast("ARFloat*") FloatPointer center, @Cast("ARFloat") float width, @Cast("ARFloat(*)[4]") FloatPointer conv);
    public native @Cast("ARFloat") float arGetTransMat(ARMarkerInfo marker_info, @Cast("ARFloat*") FloatBuffer center, @Cast("ARFloat") float width, @Cast("ARFloat(*)[4]") FloatBuffer conv);
    public native @Cast("ARFloat") float arGetTransMat(ARMarkerInfo marker_info, @Cast("ARFloat*") float[] center, @Cast("ARFloat") float width, @Cast("ARFloat(*)[4]") float[] conv);

    public native @Cast("ARFloat") float arGetTransMatCont(ARMarkerInfo marker_info, @Cast("ARFloat(*)[4]") FloatPointer prev_conv, @Cast("ARFloat*") FloatPointer center,
                @Cast("ARFloat") float width, @Cast("ARFloat(*)[4]") FloatPointer conv);
    public native @Cast("ARFloat") float arGetTransMatCont(ARMarkerInfo marker_info, @Cast("ARFloat(*)[4]") FloatBuffer prev_conv, @Cast("ARFloat*") FloatBuffer center,
                @Cast("ARFloat") float width, @Cast("ARFloat(*)[4]") FloatBuffer conv);
    public native @Cast("ARFloat") float arGetTransMatCont(ARMarkerInfo marker_info, @Cast("ARFloat(*)[4]") float[] prev_conv, @Cast("ARFloat*") float[] center,
                @Cast("ARFloat") float width, @Cast("ARFloat(*)[4]") float[] conv);

    // RPP integration -- [t.pintaric]
    public native @Cast("ARFloat") float rppMultiGetTransMat(ARMarkerInfo marker_info, int marker_num, ARMultiMarkerInfoT config);
    public native @Cast("ARFloat") float rppGetTransMat(ARMarkerInfo marker_info, @Cast("ARFloat*") FloatPointer center, @Cast("ARFloat") float width, @Cast("ARFloat(*)[4]") FloatPointer conv);
    public native @Cast("ARFloat") float rppGetTransMat(ARMarkerInfo marker_info, @Cast("ARFloat*") FloatBuffer center, @Cast("ARFloat") float width, @Cast("ARFloat(*)[4]") FloatBuffer conv);
    public native @Cast("ARFloat") float rppGetTransMat(ARMarkerInfo marker_info, @Cast("ARFloat*") float[] center, @Cast("ARFloat") float width, @Cast("ARFloat(*)[4]") float[] conv);

    /** loads a pattern from a file */
    public native int arLoadPatt(@Cast("char*") BytePointer filename);
    public native int arLoadPatt(@Cast("char*") ByteBuffer filename);
    public native int arLoadPatt(@Cast("char*") byte[] filename);

    /** frees a pattern from memory */
    public native int arFreePatt(int patno);

    public native int arMultiFreeConfig(ARMultiMarkerInfoT config);

    public native ARMultiMarkerInfoT arMultiReadConfigFile(@Cast("const char*") BytePointer filename);
    public native ARMultiMarkerInfoT arMultiReadConfigFile(String filename);

    /**
     * activates binary markers
     *  markers are converted to pure black/white during loading
     */
    public native void activateBinaryMarker(int nThreshold);

    /**
     * activate the usage of id-based markers rather than template based markers
     *  Template markers are the classic marker type used in ARToolKit.
     *  Id-based markers directly encode the marker id in the image.
     *  Simple markers use 3-times redundancy to increase robustness, while
     *  BCH markers use an advanced CRC algorithm to detect and repair marker damages.
     *  See arBitFieldPattern.h for more information.
     *  In order to use id-based markers, the marker size has to be 6x6, 12x12 or 18x18.
     */
    public native void setMarkerMode(@Cast("ARToolKitPlus::MARKER_MODE") int nMarkerMode);

    /**
     * activates the complensation of brightness falloff in the corners of the camera image
     *  some cameras have a falloff in brightness at the border of the image, which creates
     *  problems with thresholding the image. use this function to set a (linear) adapted
     *  threshold value. the threshold value will stay exactly the same at the center but
     *  will deviate near to the border. all values specify a difference, not absolute values!
     *  nCorners define the falloff a all four corners. nLeftRight defines the falloff
     *  at the half y-position at the left and right side of the image. nTopBottom defines the falloff
     *  at the half x-position at the top and bottom side of the image.
     *  all values between these 9 points (center, 4 corners, left, right, top, bottom) will
     *  be interpolated.
     */
    public native void activateVignettingCompensation(@Cast("bool") boolean nEnable, int nCorners/*=0*/, int nLeftRight/*=0*/, int nTopBottom/*=0*/);
    public native void activateVignettingCompensation(@Cast("bool") boolean nEnable);

    /**
     * Calculates the camera matrix from an ARToolKit camera file.
     * This method retrieves the OpenGL projection matrix that is stored
     * in an ARToolKit camera calibration file.
     * Returns true if loading of the camera file succeeded.
     */
    public static native @Cast("bool") boolean calcCameraMatrix(@Cast("const char*") BytePointer nCamParamFile, @Cast("ARFloat") float nNear, @Cast("ARFloat") float nFar, @Cast("ARFloat*") FloatPointer nMatrix);
    public static native @Cast("bool") boolean calcCameraMatrix(String nCamParamFile, @Cast("ARFloat") float nNear, @Cast("ARFloat") float nFar, @Cast("ARFloat*") FloatBuffer nMatrix);
    public static native @Cast("bool") boolean calcCameraMatrix(@Cast("const char*") BytePointer nCamParamFile, @Cast("ARFloat") float nNear, @Cast("ARFloat") float nFar, @Cast("ARFloat*") float[] nMatrix);
    public static native @Cast("bool") boolean calcCameraMatrix(String nCamParamFile, @Cast("ARFloat") float nNear, @Cast("ARFloat") float nFar, @Cast("ARFloat*") FloatPointer nMatrix);
    public static native @Cast("bool") boolean calcCameraMatrix(@Cast("const char*") BytePointer nCamParamFile, @Cast("ARFloat") float nNear, @Cast("ARFloat") float nFar, @Cast("ARFloat*") FloatBuffer nMatrix);
    public static native @Cast("bool") boolean calcCameraMatrix(String nCamParamFile, @Cast("ARFloat") float nNear, @Cast("ARFloat") float nFar, @Cast("ARFloat*") float[] nMatrix);

    /** Changes the resolution of the camera after the camerafile was already loaded */
    public native void changeCameraSize(int nWidth, int nHeight);

    /**
     * Changes the undistortion mode
     * Default value is UNDIST_STD which means that
     * artoolkit's standard undistortion method is used.
     */
    public native void setUndistortionMode(@Cast("ARToolKitPlus::UNDIST_MODE") int nMode);

    /**
     * Changes the Pose Estimation Algorithm
     * POSE_ESTIMATOR_ORIGINAL (default): arGetTransMat()
     * POSE_ESTIMATOR_CONT: original pose estimator with "Cont"
     * POSE_ESTIMATOR_RPP: "Robust Pose Estimation from a Planar Target"
     */
    public native @Cast("bool") boolean setPoseEstimator(@Cast("ARToolKitPlus::POSE_ESTIMATOR") int nMethod);

    /**
     * If true the alternative hull-algorithm will be used for multi-marker tracking
     *  Starting with version 2.2 ARToolKitPlus has a new mode for tracking multi-markers:
     *  Instead of using all points (as done by RPP multi-marker tracking)
     *  or tracking all markers independently and combine lateron
     *  (as done in ARToolKit's standard multi-marker pose estimator), ARToolKitPlus can now
     *  use only 4 'good' points of the convex hull to do the pose estimation.
     *  If the pose estimator is set to RPP then RPP will be used to track those 4 points.
     *  Otherwise, ARToolKit's standard single-marker pose estimator will be used to
     *  track the pose of these 4 points.
     */
    public native void setHullMode(@Cast("ARToolKitPlus::HULL_TRACKING_MODE") int nMode);

    /**
     * Sets a new relative border width. ARToolKit's default value is 0.25
     * Take caution that the markers need of course really have thiner borders.
     * Values other than 0.25 have not been tested for regular pattern-based matching,
     * but only for id-encoded markers. It might be that the pattern creation process
     * needs to be updated too.
     */
    public native void setBorderWidth(@Cast("ARFloat") float nFraction);

    /** Sets the threshold value that is used for black/white conversion */
    public native void setThreshold(int nValue);

    /** Returns the current threshold value. */
    public native int getThreshold();

    /** Turns automatic threshold calculation on/off */
    public native void activateAutoThreshold(@Cast("bool") boolean nEnable);

    /** Returns true if automatic threshold detection is enabled */
    public native @Cast("bool") boolean isAutoThresholdActivated();

    /**
     * Sets the number of times the threshold is randomized in case no marker was visible (Minimum: 1, Default: 2)
     *  Autothreshold requires a visible marker to estime the optimal thresholding value. If
     *  no marker is visible ARToolKitPlus randomizes the thresholding value until a marker is
     *  found. This function sets the number of times ARToolKitPlus will randomize the threshold
     *  value and research for a marker per calc() invokation until it gives up.
     *  A value of 2 means that ARToolKitPlus will analyze the image a second time with an other treshold value
     *  if it does not find a marker the first time. Each unsuccessful try uses less processing power
     *  than a single full successful position estimation.
     */
    public native void setNumAutoThresholdRetries(int nNumRetries);

    /**
     * Sets an image processing mode (half or full resolution)
     *  Half resolution is faster but less accurate. When using
     *  full resolution smaller markers will be detected at a
     *  higher accuracy (or even detected at all).
     */
    public native void setImageProcessingMode(@Cast("ARToolKitPlus::IMAGE_PROC_MODE") int nMode);

    /** Returns an opengl-style modelview transformation matrix */
    public native @Cast("const ARFloat*") FloatPointer getModelViewMatrix();

    /** Returns an opengl-style projection transformation matrix */
    public native @Cast("const ARFloat*") FloatPointer getProjectionMatrix();

    /** Returns the compiled-in pixel format */
    public native @Cast("ARToolKitPlus::PIXEL_FORMAT") int getPixelFormat();

    /** Returns the numbber of bits per pixel for the compiled-in pixel format */
    public native int getBitsPerPixel();

    /**
     * Returns the maximum number of patterns that can be loaded
     *  This maximum number of loadable patterns can be set via the
     *  maxLoadPatterns parameter
     */
    public native int getNumLoadablePatterns();

    /** Returns the current camera */
    public native Camera getCamera();

    /** Sets a new camera without specifying new near and far clip values */
    public native void setCamera(Camera nCamera);

    /** Sets a new camera including specifying new near and far clip values */
    public native void setCamera(Camera nCamera, @Cast("ARFloat") float nNearClip, @Cast("ARFloat") float nFarClip);

    /** Calculates the OpenGL transformation matrix for a specific marker info */
    public native @Cast("ARFloat") float calcOpenGLMatrixFromMarker(ARMarkerInfo nMarkerInfo, @Cast("ARFloat*") FloatPointer nPatternCenter,
                @Cast("ARFloat") float nPatternSize, @Cast("ARFloat*") FloatPointer nOpenGLMatrix);
    public native @Cast("ARFloat") float calcOpenGLMatrixFromMarker(ARMarkerInfo nMarkerInfo, @Cast("ARFloat*") FloatBuffer nPatternCenter,
                @Cast("ARFloat") float nPatternSize, @Cast("ARFloat*") FloatBuffer nOpenGLMatrix);
    public native @Cast("ARFloat") float calcOpenGLMatrixFromMarker(ARMarkerInfo nMarkerInfo, @Cast("ARFloat*") float[] nPatternCenter,
                @Cast("ARFloat") float nPatternSize, @Cast("ARFloat*") float[] nOpenGLMatrix);

    /** Calls the pose estimator set with setPoseEstimator() for single marker tracking */
    public native @Cast("ARFloat") float executeSingleMarkerPoseEstimator(ARMarkerInfo marker_info, @Cast("ARFloat*") FloatPointer center, @Cast("ARFloat") float width,
                @Cast("ARFloat(*)[4]") FloatPointer conv);
    public native @Cast("ARFloat") float executeSingleMarkerPoseEstimator(ARMarkerInfo marker_info, @Cast("ARFloat*") FloatBuffer center, @Cast("ARFloat") float width,
                @Cast("ARFloat(*)[4]") FloatBuffer conv);
    public native @Cast("ARFloat") float executeSingleMarkerPoseEstimator(ARMarkerInfo marker_info, @Cast("ARFloat*") float[] center, @Cast("ARFloat") float width,
                @Cast("ARFloat(*)[4]") float[] conv);

    /** Calls the pose estimator set with setPoseEstimator() for multi marker tracking */
    public native @Cast("ARFloat") float executeMultiMarkerPoseEstimator(ARMarkerInfo marker_info, int marker_num,
                ARMultiMarkerInfoT config);

    /*
     * Returns a vector with screen coordinates of all corners
     * that were used for marker tracking for the last image
     */
    public native @StdVector CornerPoint getTrackedCorners();
}

 // namespace ARToolKitPlus

// #endif //__ARTOOLKIT_TRACKERIMPL_HEADERFILE__


// Parsed from <ARToolKitPlus/TrackerMultiMarker.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Daniel Wagner
 *  Pavel Rojtberg
 */

// #pragma once

// #include <ARToolKitPlus/Tracker.h>

/**
 * Defines a simple interface for multi-marker tracking with ARToolKitPlus
 *  ARToolKit::TrackerMultiMarker provides all methods to access ARToolKit for
 *  multi marker tracking without needing to mess around with it directly.
 *
 *  Per default the tracker searches for Id-based markers with normal border and uses
 *  the RPP algorithm for pose estimation.
 *  Furthermore it uses only 4 'good' points of the convex hull to do the pose estimation.
 *  You can override this using the according methods.
 */
@Namespace("ARToolKitPlus") @NoOffset public static class TrackerMultiMarker extends Tracker {
    static { Loader.load(); }
    /** Empty constructor. */
    public TrackerMultiMarker() { }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrackerMultiMarker(Pointer p) { super(p); }

    /**
     * These parameters control the way the toolkit warps a found
     * marker to a perfect square. The square has size
     * pattWidth * pattHeight, the projected
     * square in the image is subsampled at a min of
     * pattWidth/pattHeight and a max of pattSamples
     * steps in both x and y direction
     *  @param imWidth width of the source image in px
     *  @param imHeight height of the source image in px
     *  @param maxImagePatterns describes the maximum number of patterns that can be analyzed in a camera image.
     *  @param pattWidth describes the pattern image width (must be 6 for binary markers)
     *  @param pattHeight describes the pattern image height (must be 6 for binary markers)
     *  @param pattSamples describes the maximum resolution at which a pattern is sampled from the camera image
     *  (6 by default, must a a multiple of pattWidth and pattHeight).
     *  @param maxLoadPatterns describes the maximum number of pattern files that can be loaded.
     *  Reduce maxLoadPatterns and maxImagePatterns to reduce memory footprint.
     */
    public TrackerMultiMarker(int imWidth, int imHeight, int maxImagePatterns/*=8*/, int pattWidth/*=6*/, int pattHeight/*=6*/, int pattSamples/*=6*/,
                int maxLoadPatterns/*=0*/) { allocate(imWidth, imHeight, maxImagePatterns, pattWidth, pattHeight, pattSamples, maxLoadPatterns); }
    private native void allocate(int imWidth, int imHeight, int maxImagePatterns/*=8*/, int pattWidth/*=6*/, int pattHeight/*=6*/, int pattSamples/*=6*/,
                int maxLoadPatterns/*=0*/);
    public TrackerMultiMarker(int imWidth, int imHeight) { allocate(imWidth, imHeight); }
    private native void allocate(int imWidth, int imHeight);

    /**
     * initializes ARToolKit
     *  nCamParamFile is the name of the camera parameter file
     *  nNearClip & nFarClip are near and far clipping values for the OpenGL projection matrix
     *  nLogger is an instance which implements the ARToolKit::Logger interface
     */
    public native @Cast("bool") boolean init(@Cast("const char*") BytePointer nCamParamFile, @Cast("const char*") BytePointer nMultiFile, @Cast("ARFloat") float nNearClip, @Cast("ARFloat") float nFarClip);
    public native @Cast("bool") boolean init(String nCamParamFile, String nMultiFile, @Cast("ARFloat") float nNearClip, @Cast("ARFloat") float nFarClip);

    /**
     * calculates the transformation matrix
     *	pass the image as RGBX (32-bits)
     */
    public native int calc(@Cast("const uint8_t*") BytePointer nImage);
    public native int calc(@Cast("const uint8_t*") ByteBuffer nImage);
    public native int calc(@Cast("const uint8_t*") byte[] nImage);

    /*
     * Returns the number of detected markers used for multi-marker tracking
     */
    public native int getNumDetectedMarkers();

    /** Enables usage of arDetectMarkerLite. Otherwise arDetectMarker is used
    /**
     * Enables usage of arDetectMarkerLite. Otherwise arDetectMarker is used
     * In general arDetectMarker is more powerful since it keeps history about markers.
     * In some cases such as very low camera refresh rates it is advantegous to change this.
     * Using the non-lite version treats each image independent.
     */
    public native void setUseDetectLite(@Cast("bool") boolean nEnable);

    /**
     * Returns array of detected marker IDs
     * Only access the first getNumDetectedMarkers() markers
     */
    public native void getDetectedMarkers(@ByPtrRef IntPointer nMarkerIDs);
    public native void getDetectedMarkers(@ByPtrRef IntBuffer nMarkerIDs);
    public native void getDetectedMarkers(@ByPtrRef int[] nMarkerIDs);

    /*
     * Returns the ARMarkerInfo object for a found marker
     */
    public native @Const @ByRef ARMarkerInfo getDetectedMarker(int nWhich);

    /**
     * Returns the loaded ARMultiMarkerInfoT object
     *  If loading the multi-marker config file failed then this method
     *  returns NULL.
     */
    public native @Const ARMultiMarkerInfoT getMultiMarkerConfig();

    /**
     * Provides access to ARToolKit' internal version of the transformation matrix
     *  This method is primarily for compatibility issues with code previously using
     *  ARToolKit rather than ARToolKitPlus. This is the original transformation
     *  matrix ARToolKit calculates rather than the OpenGL style version of this matrix
     *  that can be retrieved via getModelViewMatrix().
     */
    public native void getARMatrix(@Cast("ARFloat(*)[4]") FloatPointer nMatrix);
    public native void getARMatrix(@Cast("ARFloat(*)[4]") FloatBuffer nMatrix);
    public native void getARMatrix(@Cast("ARFloat(*)[4]") float[] nMatrix);
}

 // namespace ARToolKitPlus


// Parsed from <ARToolKitPlus/TrackerSingleMarker.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Daniel Wagner
 *  Pavel Rojtberg
 */

// #pragma once

// #include <ARToolKitPlus/Tracker.h>

/**
 * Defines a simple interface for single-marker tracking with ARToolKitPlus
 *  ARToolKitPlus::TrackerSingleMarker provides all methods to access ARToolKit for
 *  single marker tracking without needing to mess around with it low level methods directly.
 *
 *  Per default the tracker searches for Id-based markers with normal border and uses
 *  the RPP algorithm for pose estimation. You can override this using the according methods.
 *
 *  If you need multi-marker tracking use TrackerMultiMarker.
 */
@Namespace("ARToolKitPlus") @NoOffset public static class TrackerSingleMarker extends Tracker {
    static { Loader.load(); }
    /** Empty constructor. */
    public TrackerSingleMarker() { }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TrackerSingleMarker(Pointer p) { super(p); }

    /**
     * These parameters control the way the toolkit warps a found
     * marker to a perfect square. The square has size
     * pattWidth * pattHeight, the projected
     * square in the image is subsampled at a min of
     * pattWidth/pattHeight and a max of pattSamples
     * steps in both x and y direction
     *  @param imWidth width of the source image in px
     *  @param imHeight height of the source image in px
     *  @param maxImagePatterns describes the maximum number of patterns that can be analyzed in a camera image.
     *  @param pattWidth describes the pattern image width (must be 6 for binary markers)
     *  @param pattHeight describes the pattern image height (must be 6 for binary markers)
     *  @param pattSamples describes the maximum resolution at which a pattern is sampled from the camera image
     *  (6 by default, must a a multiple of pattWidth and pattHeight).
     *  @param maxLoadPatterns describes the maximum number of pattern files that can be loaded.
     *  Reduce maxLoadPatterns and maxImagePatterns to reduce memory footprint.
     */
    public TrackerSingleMarker(int imWidth, int imHeight, int maxImagePatterns/*=8*/, int pattWidth/*=6*/, int pattHeight/*=6*/, int pattSamples/*=6*/,
                int maxLoadPatterns/*=0*/) { allocate(imWidth, imHeight, maxImagePatterns, pattWidth, pattHeight, pattSamples, maxLoadPatterns); }
    private native void allocate(int imWidth, int imHeight, int maxImagePatterns/*=8*/, int pattWidth/*=6*/, int pattHeight/*=6*/, int pattSamples/*=6*/,
                int maxLoadPatterns/*=0*/);
    public TrackerSingleMarker(int imWidth, int imHeight) { allocate(imWidth, imHeight); }
    private native void allocate(int imWidth, int imHeight);

    /**
     * initializes TrackerSingleMarker
     * @param nCamParamFile is the name of the camera parameter file
     */
    public native @Cast("bool") boolean init(@Cast("const char*") BytePointer nCamParamFile, @Cast("ARFloat") float nNearClip, @Cast("ARFloat") float nFarClip);
    public native @Cast("bool") boolean init(String nCamParamFile, @Cast("ARFloat") float nNearClip, @Cast("ARFloat") float nFarClip);

    /**
     * adds a pattern to ARToolKit
     * pass the patterns filename
     */
    public native int addPattern(@Cast("const char*") BytePointer nFileName);
    public native int addPattern(String nFileName);

    /**
     * calculates the transformation matrix
     * pass the image as RGBX (32-bits)
     * @return detected markers in image
     */
    public native @StdVector IntPointer calc(@Cast("const uint8_t*") BytePointer nImage, @Cast("ARToolKitPlus::ARMarkerInfo**") PointerPointer nMarker_info/*=NULL*/, IntPointer nNumMarkers/*=NULL*/);
    public native @StdVector IntPointer calc(@Cast("const uint8_t*") BytePointer nImage);
    public native @StdVector IntPointer calc(@Cast("const uint8_t*") BytePointer nImage, @ByPtrPtr ARMarkerInfo nMarker_info/*=NULL*/, IntPointer nNumMarkers/*=NULL*/);
    public native @StdVector IntBuffer calc(@Cast("const uint8_t*") ByteBuffer nImage, @ByPtrPtr ARMarkerInfo nMarker_info/*=NULL*/, IntBuffer nNumMarkers/*=NULL*/);
    public native @StdVector IntBuffer calc(@Cast("const uint8_t*") ByteBuffer nImage);
    public native @StdVector int[] calc(@Cast("const uint8_t*") byte[] nImage, @ByPtrPtr ARMarkerInfo nMarker_info/*=NULL*/, int[] nNumMarkers/*=NULL*/);
    public native @StdVector int[] calc(@Cast("const uint8_t*") byte[] nImage);

    /**
     * manually select one of the detected markers
     * instead of using the best one
     */
    public native void selectDetectedMarker(int id);

    /**
     * Select the best marker based on Confidence
     */
    public native int selectBestMarkerByCf();

    /**
     * Sets the width and height of the patterns in OpenGL units
     * defaults to 2.0, so the unity cube fits the marker surface
     */
    public native void setPatternWidth(@Cast("ARFloat") float nWidth);

    /**
     * Provides access to ARToolKit' patt_trans matrix
     *  This method is primarily for compatibility issues with code previously using
     *  ARToolKit rather than ARToolKitPlus. patt_trans is the original transformation
     *  matrix ARToolKit calculates rather than the OpenGL style version of this matrix
     *  that can be retrieved via getModelViewMatrix().
     */
    public native void getARMatrix(@Cast("ARFloat(*)[4]") FloatPointer nMatrix);
    public native void getARMatrix(@Cast("ARFloat(*)[4]") FloatBuffer nMatrix);
    public native void getARMatrix(@Cast("ARFloat(*)[4]") float[] nMatrix);

    /**
     * Returns the confidence value of the currently best detected marker.
     */
    public native float getConfidence();
}

 // namespace ARToolKitPlus


// Parsed from <ARToolKitPlus/arBitFieldPattern.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Daniel Wagner
 */

// #ifndef __ARBITFIELDPATTERN_HEADERFILE__
// #define __ARBITFIELDPATTERN_HEADERFILE__

// #include <ARToolKitPlus/config.h>

/** enum ARToolKitPlus:: */
public static final int
    // size of the marker images
    idPattWidth = 6,
    idPattHeight = 6,

    // number of bits we can use for marker id
    idBits = 9,
    idMask =  (1 << idBits) - 1,
    idMax =  (1 << idBits) - 1,

    pattBits =  4 * idBits;

// we only use __int64 under windows.
// have to use unsigned long long othersie...
// #if defined(_MSC_VER) || defined(_WIN32_WCE)
// #else
@Namespace("ARToolKitPlus") @MemberGetter public static native @Cast("const ARToolKitPlus::IDPATTERN") long bchMask();
// #endif

@Namespace("ARToolKitPlus") @MemberGetter public static native @Cast("const ARToolKitPlus::IDPATTERN") long xorMask0();
@Namespace("ARToolKitPlus") @MemberGetter public static native @Cast("const ARToolKitPlus::IDPATTERN") long xorMask1();
@Namespace("ARToolKitPlus") @MemberGetter public static native @Cast("const ARToolKitPlus::IDPATTERN") long xorMask2();
@Namespace("ARToolKitPlus") @MemberGetter public static native @Cast("const ARToolKitPlus::IDPATTERN") long xorMask3();

@Namespace("ARToolKitPlus") @MemberGetter public static native int posMask0();
@Namespace("ARToolKitPlus") @MemberGetter public static native int posMask1();
@Namespace("ARToolKitPlus") @MemberGetter public static native int posMask2();
@Namespace("ARToolKitPlus") @MemberGetter public static native int posMask3();

// full mask that is used to xor raw pattern image
@Namespace("ARToolKitPlus") @MemberGetter public static native @Cast("const ARToolKitPlus::IDPATTERN") long fullMask();

@Namespace("ARToolKitPlus") @MemberGetter public static native @Cast("const unsigned int") int bchBits();
@Namespace("ARToolKitPlus") @MemberGetter public static native @Cast("const unsigned int") int idMaxBCH();

// array with indices for 90� CW rotated grid
@Namespace("ARToolKitPlus") @MemberGetter public static native int rotate90(int i);
@Namespace("ARToolKitPlus") @MemberGetter public static native @Const IntPointer rotate90();


// some internal methods. primarily needed for
// marker printing, etc.
@Namespace("ARToolKitPlus") public static native void generatePatternSimple(int nID, @Cast("ARToolKitPlus::IDPATTERN*") @ByRef LongPointer nPattern);
@Namespace("ARToolKitPlus") public static native void generatePatternSimple(int nID, @Cast("ARToolKitPlus::IDPATTERN*") @ByRef LongBuffer nPattern);
@Namespace("ARToolKitPlus") public static native void generatePatternSimple(int nID, @Cast("ARToolKitPlus::IDPATTERN*") @ByRef long[] nPattern);

@Namespace("ARToolKitPlus") public static native void generatePatternBCH(int nID, @Cast("ARToolKitPlus::IDPATTERN*") @ByRef LongPointer nPattern);
@Namespace("ARToolKitPlus") public static native void generatePatternBCH(int nID, @Cast("ARToolKitPlus::IDPATTERN*") @ByRef LongBuffer nPattern);
@Namespace("ARToolKitPlus") public static native void generatePatternBCH(int nID, @Cast("ARToolKitPlus::IDPATTERN*") @ByRef long[] nPattern);

// static void setBit(IDPATTERN& pat, int which);

@Namespace("ARToolKitPlus") public static native @Cast("bool") boolean isBitSet(@Cast("ARToolKitPlus::IDPATTERN") long pat, int which);

 // namespace ARToolKitPlus


// #endif //__ARBITFIELDPATTERN_HEADERFILE__


// Parsed from <ARToolKitPlus/arGetInitRot2Sub.h>

/**
 * Copyright (C) 2010  ARToolkitPlus Authors
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 * Authors:
 *  Daniel Wagner
 */

// #ifndef __ARTOOLKITPLUS_ARGETINITROT2SUB_HEADERFILE__
// #define __ARTOOLKITPLUS_ARGETINITROT2SUB_HEADERFILE__

// #include <ARToolKitPlus/extra/rpp.h>

@Namespace("rpp") public static native void arGetInitRot2_sub(@Cast("rpp_float*") @ByRef DoublePointer err, @ByRef @Cast("double(*)[3][3]") PointerPointer R, @Cast("rpp_vec*") @ByRef PointerPointer t, @Cast("const rpp_float*") DoublePointer cc, @Cast("const rpp_float*") DoublePointer fc,
        @Cast("const rpp_vec*") PointerPointer model, @Cast("const rpp_vec*") PointerPointer iprts, @Cast("const unsigned int") int model_iprts_size, @Cast("double(*)[3]") DoublePointer R_init,
        @Cast("const bool") boolean estimate_R_init, @Cast("const rpp_float") double epsilon, @Cast("const rpp_float") double tolerance,
        @Cast("const unsigned int") int max_iterations);
@Namespace("rpp") public static native void arGetInitRot2_sub(@Cast("rpp_float*") @ByRef DoubleBuffer err, @ByRef @Cast("double(*)[3][3]") PointerPointer R, @Cast("rpp_vec*") @ByRef PointerPointer t, @Cast("const rpp_float*") DoubleBuffer cc, @Cast("const rpp_float*") DoubleBuffer fc,
        @Cast("const rpp_vec*") PointerPointer model, @Cast("const rpp_vec*") PointerPointer iprts, @Cast("const unsigned int") int model_iprts_size, @Cast("double(*)[3]") DoublePointer R_init,
        @Cast("const bool") boolean estimate_R_init, @Cast("const rpp_float") double epsilon, @Cast("const rpp_float") double tolerance,
        @Cast("const unsigned int") int max_iterations);
@Namespace("rpp") public static native void arGetInitRot2_sub(@Cast("rpp_float*") @ByRef double[] err, @ByRef @Cast("double(*)[3][3]") PointerPointer R, @Cast("rpp_vec*") @ByRef PointerPointer t, @Cast("const rpp_float*") double[] cc, @Cast("const rpp_float*") double[] fc,
        @Cast("const rpp_vec*") PointerPointer model, @Cast("const rpp_vec*") PointerPointer iprts, @Cast("const unsigned int") int model_iprts_size, @Cast("double(*)[3]") DoublePointer R_init,
        @Cast("const bool") boolean estimate_R_init, @Cast("const rpp_float") double epsilon, @Cast("const rpp_float") double tolerance,
        @Cast("const unsigned int") int max_iterations);

 // namespace rpp


// #endif //__ARTOOLKITPLUS_ARGETINITROT2SUB_HEADERFILE__


}
