/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import javax.annotation.*;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Structure specifying the parameters of a newly created buffer object.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code size} <b>must</b> be greater than 0</li>
 * <li>If {@code sharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, {@code pQueueFamilyIndices} <b>must</b> be a valid pointer to an array of {@code queueFamilyIndexCount} {@code uint32_t} values</li>
 * <li>If {@code sharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, {@code queueFamilyIndexCount} <b>must</b> be greater than 1</li>
 * <li>If {@code sharingMode} is {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}, each element of {@code pQueueFamilyIndices} <b>must</b> be unique and <b>must</b> be less than {@code pQueueFamilyPropertyCount} returned by either {@link VK10#vkGetPhysicalDeviceQueueFamilyProperties GetPhysicalDeviceQueueFamilyProperties} or {@link VK11#vkGetPhysicalDeviceQueueFamilyProperties2 GetPhysicalDeviceQueueFamilyProperties2} for the {@code physicalDevice} that was used to create {@code device}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-sparseBinding">sparse bindings</a> feature is not enabled, {@code flags} <b>must</b> not contain {@link VK10#VK_BUFFER_CREATE_SPARSE_BINDING_BIT BUFFER_CREATE_SPARSE_BINDING_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-sparseResidencyBuffer">sparse buffer residency</a> feature is not enabled, {@code flags} <b>must</b> not contain {@link VK10#VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT BUFFER_CREATE_SPARSE_RESIDENCY_BIT}</li>
 * <li>If the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/html/vkspec.html#features-features-sparseResidencyAliased">sparse aliased residency</a> feature is not enabled, {@code flags} <b>must</b> not contain {@link VK10#VK_BUFFER_CREATE_SPARSE_ALIASED_BIT BUFFER_CREATE_SPARSE_ALIASED_BIT}</li>
 * <li>If {@code flags} contains {@link VK10#VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT BUFFER_CREATE_SPARSE_RESIDENCY_BIT} or {@link VK10#VK_BUFFER_CREATE_SPARSE_ALIASED_BIT BUFFER_CREATE_SPARSE_ALIASED_BIT}, it <b>must</b> also contain {@link VK10#VK_BUFFER_CREATE_SPARSE_BINDING_BIT BUFFER_CREATE_SPARSE_BINDING_BIT}</li>
 * <li>If the {@code pNext} chain contains an instance of {@link VkExternalMemoryBufferCreateInfo}, its {@code handleTypes} member <b>must</b> only contain bits that are also in {@link VkExternalBufferProperties}{@code ::externalMemoryProperties}.compatibleHandleTypes, as returned by {@link VK11#vkGetPhysicalDeviceExternalBufferProperties GetPhysicalDeviceExternalBufferProperties} with {@code pExternalBufferInfo}-&gt;{@code handleType} equal to any one of the handle types specified in {@link VkExternalMemoryBufferCreateInfo}{@code ::handleTypes}</li>
 * <li>If the protected memory feature is not enabled, {@code flags} <b>must</b> not contain {@link VK11#VK_BUFFER_CREATE_PROTECTED_BIT BUFFER_CREATE_PROTECTED_BIT}</li>
 * <li>If any of the bits {@link VK10#VK_BUFFER_CREATE_SPARSE_BINDING_BIT BUFFER_CREATE_SPARSE_BINDING_BIT}, {@link VK10#VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT BUFFER_CREATE_SPARSE_RESIDENCY_BIT}, or {@link VK10#VK_BUFFER_CREATE_SPARSE_ALIASED_BIT BUFFER_CREATE_SPARSE_ALIASED_BIT} are set, {@link VK11#VK_BUFFER_CREATE_PROTECTED_BIT BUFFER_CREATE_PROTECTED_BIT} <b>must</b> not also be set</li>
 * <li>If the {@code pNext} chain contains an instance of {@link VkDedicatedAllocationBufferCreateInfoNV}, and the {@code dedicatedAllocation} member of the chained structure is {@link VK10#VK_TRUE TRUE}, then {@code flags} <b>must</b> not include {@link VK10#VK_BUFFER_CREATE_SPARSE_BINDING_BIT BUFFER_CREATE_SPARSE_BINDING_BIT}, {@link VK10#VK_BUFFER_CREATE_SPARSE_RESIDENCY_BIT BUFFER_CREATE_SPARSE_RESIDENCY_BIT}, or {@link VK10#VK_BUFFER_CREATE_SPARSE_ALIASED_BIT BUFFER_CREATE_SPARSE_ALIASED_BIT}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_BUFFER_CREATE_INFO STRUCTURE_TYPE_BUFFER_CREATE_INFO}</li>
 * <li>Each {@code pNext} member of any structure (including this one) in the {@code pNext} chain <b>must</b> be either {@code NULL} or a pointer to a valid instance of {@link VkDedicatedAllocationBufferCreateInfoNV} or {@link VkExternalMemoryBufferCreateInfo}</li>
 * <li>Each {@code sType} member in the {@code pNext} chain <b>must</b> be unique</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkBufferCreateFlagBits} values</li>
 * <li>{@code usage} <b>must</b> be a valid combination of {@code VkBufferUsageFlagBits} values</li>
 * <li>{@code usage} <b>must</b> not be 0</li>
 * <li>{@code sharingMode} <b>must</b> be a valid {@code VkSharingMode} value</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VK10#vkCreateBuffer CreateBuffer}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; a bitmask of {@code VkBufferCreateFlagBits} specifying additional parameters of the buffer.</li>
 * <li>{@code size} &ndash; the size in bytes of the buffer to be created.</li>
 * <li>{@code usage} &ndash; a bitmask of {@code VkBufferUsageFlagBits} specifying allowed usages of the buffer.</li>
 * <li>{@code sharingMode} &ndash; a {@code VkSharingMode} value specifying the sharing mode of the buffer when it will be accessed by multiple queue families.</li>
 * <li>{@code queueFamilyIndexCount} &ndash; the number of entries in the {@code pQueueFamilyIndices} array.</li>
 * <li>{@code pQueueFamilyIndices} &ndash; a list of queue families that will access this buffer (ignored if {@code sharingMode} is not {@link VK10#VK_SHARING_MODE_CONCURRENT SHARING_MODE_CONCURRENT}).</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>
 * struct VkBufferCreateInfo {
 *     VkStructureType sType;
 *     void const * pNext;
 *     VkBufferCreateFlags flags;
 *     VkDeviceSize size;
 *     VkBufferUsageFlags usage;
 *     VkSharingMode sharingMode;
 *     uint32_t queueFamilyIndexCount;
 *     uint32_t const * pQueueFamilyIndices;
 * }</code></pre>
 */
public class VkBufferCreateInfo extends Struct implements NativeResource {

    /** The struct size in bytes. */
    public static final int SIZEOF;

    /** The struct alignment in bytes. */
    public static final int ALIGNOF;

    /** The struct member offsets. */
    public static final int
        STYPE,
        PNEXT,
        FLAGS,
        SIZE,
        USAGE,
        SHARINGMODE,
        QUEUEFAMILYINDEXCOUNT,
        PQUEUEFAMILYINDICES;

    static {
        Layout layout = __struct(
            __member(4),
            __member(POINTER_SIZE),
            __member(4),
            __member(8),
            __member(4),
            __member(4),
            __member(4),
            __member(POINTER_SIZE)
        );

        SIZEOF = layout.getSize();
        ALIGNOF = layout.getAlignment();

        STYPE = layout.offsetof(0);
        PNEXT = layout.offsetof(1);
        FLAGS = layout.offsetof(2);
        SIZE = layout.offsetof(3);
        USAGE = layout.offsetof(4);
        SHARINGMODE = layout.offsetof(5);
        QUEUEFAMILYINDEXCOUNT = layout.offsetof(6);
        PQUEUEFAMILYINDICES = layout.offsetof(7);
    }

    VkBufferCreateInfo(long address, @Nullable ByteBuffer container) {
        super(address, container);
    }

    /**
     * Creates a {@link VkBufferCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
     * visible to the struct instance and vice versa.
     *
     * <p>The created instance holds a strong reference to the container object.</p>
     */
    public VkBufferCreateInfo(ByteBuffer container) {
        this(memAddress(container), __checkContainer(container, SIZEOF));
    }

    @Override
    public int sizeof() { return SIZEOF; }

    /** Returns the value of the {@code sType} field. */
    @NativeType("VkStructureType")
    public int sType() { return nsType(address()); }
    /** Returns the value of the {@code pNext} field. */
    @NativeType("void const *")
    public long pNext() { return npNext(address()); }
    /** Returns the value of the {@code flags} field. */
    @NativeType("VkBufferCreateFlags")
    public int flags() { return nflags(address()); }
    /** Returns the value of the {@code size} field. */
    @NativeType("VkDeviceSize")
    public long size() { return nsize(address()); }
    /** Returns the value of the {@code usage} field. */
    @NativeType("VkBufferUsageFlags")
    public int usage() { return nusage(address()); }
    /** Returns the value of the {@code sharingMode} field. */
    @NativeType("VkSharingMode")
    public int sharingMode() { return nsharingMode(address()); }
    /** Returns the value of the {@code queueFamilyIndexCount} field. */
    @NativeType("uint32_t")
    public int queueFamilyIndexCount() { return nqueueFamilyIndexCount(address()); }
    /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pQueueFamilyIndices} field. */
    @Nullable
    @NativeType("uint32_t const *")
    public IntBuffer pQueueFamilyIndices() { return npQueueFamilyIndices(address()); }

    /** Sets the specified value to the {@code sType} field. */
    public VkBufferCreateInfo sType(@NativeType("VkStructureType") int value) { nsType(address(), value); return this; }
    /** Sets the specified value to the {@code pNext} field. */
    public VkBufferCreateInfo pNext(@NativeType("void const *") long value) { npNext(address(), value); return this; }
    /** Sets the specified value to the {@code flags} field. */
    public VkBufferCreateInfo flags(@NativeType("VkBufferCreateFlags") int value) { nflags(address(), value); return this; }
    /** Sets the specified value to the {@code size} field. */
    public VkBufferCreateInfo size(@NativeType("VkDeviceSize") long value) { nsize(address(), value); return this; }
    /** Sets the specified value to the {@code usage} field. */
    public VkBufferCreateInfo usage(@NativeType("VkBufferUsageFlags") int value) { nusage(address(), value); return this; }
    /** Sets the specified value to the {@code sharingMode} field. */
    public VkBufferCreateInfo sharingMode(@NativeType("VkSharingMode") int value) { nsharingMode(address(), value); return this; }
    /** Sets the address of the specified {@link IntBuffer} to the {@code pQueueFamilyIndices} field. */
    public VkBufferCreateInfo pQueueFamilyIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { npQueueFamilyIndices(address(), value); return this; }

    /** Initializes this struct with the specified values. */
    public VkBufferCreateInfo set(
        int sType,
        long pNext,
        int flags,
        long size,
        int usage,
        int sharingMode,
        @Nullable IntBuffer pQueueFamilyIndices
    ) {
        sType(sType);
        pNext(pNext);
        flags(flags);
        size(size);
        usage(usage);
        sharingMode(sharingMode);
        pQueueFamilyIndices(pQueueFamilyIndices);

        return this;
    }

    /**
     * Copies the specified struct data to this struct.
     *
     * @param src the source struct
     *
     * @return this struct
     */
    public VkBufferCreateInfo set(VkBufferCreateInfo src) {
        memCopy(src.address(), address(), SIZEOF);
        return this;
    }

    // -----------------------------------

    /** Returns a new {@link VkBufferCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
    public static VkBufferCreateInfo malloc() {
        return create(nmemAllocChecked(SIZEOF));
    }

    /** Returns a new {@link VkBufferCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
    public static VkBufferCreateInfo calloc() {
        return create(nmemCallocChecked(1, SIZEOF));
    }

    /** Returns a new {@link VkBufferCreateInfo} instance allocated with {@link BufferUtils}. */
    public static VkBufferCreateInfo create() {
        return new VkBufferCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
    }

    /** Returns a new {@link VkBufferCreateInfo} instance for the specified memory address. */
    public static VkBufferCreateInfo create(long address) {
        return new VkBufferCreateInfo(address, null);
    }

    /** Like {@link #create(long) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferCreateInfo createSafe(long address) {
        return address == NULL ? null : create(address);
    }

    /**
     * Returns a new {@link VkBufferCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferCreateInfo.Buffer malloc(int capacity) {
        return create(__malloc(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferCreateInfo.Buffer calloc(int capacity) {
        return create(nmemCallocChecked(capacity, SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferCreateInfo.Buffer create(int capacity) {
        return new Buffer(__create(capacity, SIZEOF));
    }

    /**
     * Create a {@link VkBufferCreateInfo.Buffer} instance at the specified memory.
     *
     * @param address  the memory address
     * @param capacity the buffer capacity
     */
    public static VkBufferCreateInfo.Buffer create(long address, int capacity) {
        return new Buffer(address, capacity);
    }

    /** Like {@link #create(long, int) create}, but returns {@code null} if {@code address} is {@code NULL}. */
    @Nullable
    public static VkBufferCreateInfo.Buffer createSafe(long address, int capacity) {
        return address == NULL ? null : create(address, capacity);
    }

    // -----------------------------------

    /** Returns a new {@link VkBufferCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
    public static VkBufferCreateInfo mallocStack() {
        return mallocStack(stackGet());
    }

    /** Returns a new {@link VkBufferCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
    public static VkBufferCreateInfo callocStack() {
        return callocStack(stackGet());
    }

    /**
     * Returns a new {@link VkBufferCreateInfo} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferCreateInfo mallocStack(MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, SIZEOF));
    }

    /**
     * Returns a new {@link VkBufferCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     */
    public static VkBufferCreateInfo callocStack(MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
    }

    /**
     * Returns a new {@link VkBufferCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferCreateInfo.Buffer mallocStack(int capacity) {
        return mallocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBufferCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param capacity the buffer capacity
     */
    public static VkBufferCreateInfo.Buffer callocStack(int capacity) {
        return callocStack(capacity, stackGet());
    }

    /**
     * Returns a new {@link VkBufferCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferCreateInfo.Buffer mallocStack(int capacity, MemoryStack stack) {
        return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
    }

    /**
     * Returns a new {@link VkBufferCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
     *
     * @param stack the stack from which to allocate
     * @param capacity the buffer capacity
     */
    public static VkBufferCreateInfo.Buffer callocStack(int capacity, MemoryStack stack) {
        return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
    }

    // -----------------------------------

    /** Unsafe version of {@link #sType}. */
    public static int nsType(long struct) { return memGetInt(struct + VkBufferCreateInfo.STYPE); }
    /** Unsafe version of {@link #pNext}. */
    public static long npNext(long struct) { return memGetAddress(struct + VkBufferCreateInfo.PNEXT); }
    /** Unsafe version of {@link #flags}. */
    public static int nflags(long struct) { return memGetInt(struct + VkBufferCreateInfo.FLAGS); }
    /** Unsafe version of {@link #size}. */
    public static long nsize(long struct) { return memGetLong(struct + VkBufferCreateInfo.SIZE); }
    /** Unsafe version of {@link #usage}. */
    public static int nusage(long struct) { return memGetInt(struct + VkBufferCreateInfo.USAGE); }
    /** Unsafe version of {@link #sharingMode}. */
    public static int nsharingMode(long struct) { return memGetInt(struct + VkBufferCreateInfo.SHARINGMODE); }
    /** Unsafe version of {@link #queueFamilyIndexCount}. */
    public static int nqueueFamilyIndexCount(long struct) { return memGetInt(struct + VkBufferCreateInfo.QUEUEFAMILYINDEXCOUNT); }
    /** Unsafe version of {@link #pQueueFamilyIndices() pQueueFamilyIndices}. */
    @Nullable public static IntBuffer npQueueFamilyIndices(long struct) { return memIntBufferSafe(memGetAddress(struct + VkBufferCreateInfo.PQUEUEFAMILYINDICES), nqueueFamilyIndexCount(struct)); }

    /** Unsafe version of {@link #sType(int) sType}. */
    public static void nsType(long struct, int value) { memPutInt(struct + VkBufferCreateInfo.STYPE, value); }
    /** Unsafe version of {@link #pNext(long) pNext}. */
    public static void npNext(long struct, long value) { memPutAddress(struct + VkBufferCreateInfo.PNEXT, value); }
    /** Unsafe version of {@link #flags(int) flags}. */
    public static void nflags(long struct, int value) { memPutInt(struct + VkBufferCreateInfo.FLAGS, value); }
    /** Unsafe version of {@link #size(long) size}. */
    public static void nsize(long struct, long value) { memPutLong(struct + VkBufferCreateInfo.SIZE, value); }
    /** Unsafe version of {@link #usage(int) usage}. */
    public static void nusage(long struct, int value) { memPutInt(struct + VkBufferCreateInfo.USAGE, value); }
    /** Unsafe version of {@link #sharingMode(int) sharingMode}. */
    public static void nsharingMode(long struct, int value) { memPutInt(struct + VkBufferCreateInfo.SHARINGMODE, value); }
    /** Sets the specified value to the {@code queueFamilyIndexCount} field of the specified {@code struct}. */
    public static void nqueueFamilyIndexCount(long struct, int value) { memPutInt(struct + VkBufferCreateInfo.QUEUEFAMILYINDEXCOUNT, value); }
    /** Unsafe version of {@link #pQueueFamilyIndices(IntBuffer) pQueueFamilyIndices}. */
    public static void npQueueFamilyIndices(long struct, @Nullable IntBuffer value) { memPutAddress(struct + VkBufferCreateInfo.PQUEUEFAMILYINDICES, memAddressSafe(value)); nqueueFamilyIndexCount(struct, value == null ? 0 : value.remaining()); }

    /**
     * Validates pointer members that should not be {@code NULL}.
     *
     * @param struct the struct to validate
     */
    public static void validate(long struct) {
        if (nqueueFamilyIndexCount(struct) != 0) {
            check(memGetAddress(struct + VkBufferCreateInfo.PQUEUEFAMILYINDICES));
        }
    }

    /**
     * Calls {@link #validate(long)} for each struct contained in the specified struct array.
     *
     * @param array the struct array to validate
     * @param count the number of structs in {@code array}
     */
    public static void validate(long array, int count) {
        for (int i = 0; i < count; i++) {
            validate(array + i * SIZEOF);
        }
    }

    // -----------------------------------

    /** An array of {@link VkBufferCreateInfo} structs. */
    public static class Buffer extends StructBuffer<VkBufferCreateInfo, Buffer> implements NativeResource {

        /**
         * Creates a new {@link VkBufferCreateInfo.Buffer} instance backed by the specified container.
         *
         * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
         * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
         * by {@link VkBufferCreateInfo#SIZEOF}, and its mark will be undefined.
         *
         * <p>The created buffer instance holds a strong reference to the container object.</p>
         */
        public Buffer(ByteBuffer container) {
            super(container, container.remaining() / SIZEOF);
        }

        public Buffer(long address, int cap) {
            super(address, null, -1, 0, cap, cap);
        }

        Buffer(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            super(address, container, mark, pos, lim, cap);
        }

        @Override
        protected Buffer self() {
            return this;
        }

        @Override
        protected Buffer newBufferInstance(long address, @Nullable ByteBuffer container, int mark, int pos, int lim, int cap) {
            return new Buffer(address, container, mark, pos, lim, cap);
        }

        @Override
        protected VkBufferCreateInfo newInstance(long address) {
            return new VkBufferCreateInfo(address, container);
        }

        @Override
        public int sizeof() {
            return SIZEOF;
        }

        /** Returns the value of the {@code sType} field. */
        @NativeType("VkStructureType")
        public int sType() { return VkBufferCreateInfo.nsType(address()); }
        /** Returns the value of the {@code pNext} field. */
        @NativeType("void const *")
        public long pNext() { return VkBufferCreateInfo.npNext(address()); }
        /** Returns the value of the {@code flags} field. */
        @NativeType("VkBufferCreateFlags")
        public int flags() { return VkBufferCreateInfo.nflags(address()); }
        /** Returns the value of the {@code size} field. */
        @NativeType("VkDeviceSize")
        public long size() { return VkBufferCreateInfo.nsize(address()); }
        /** Returns the value of the {@code usage} field. */
        @NativeType("VkBufferUsageFlags")
        public int usage() { return VkBufferCreateInfo.nusage(address()); }
        /** Returns the value of the {@code sharingMode} field. */
        @NativeType("VkSharingMode")
        public int sharingMode() { return VkBufferCreateInfo.nsharingMode(address()); }
        /** Returns the value of the {@code queueFamilyIndexCount} field. */
        @NativeType("uint32_t")
        public int queueFamilyIndexCount() { return VkBufferCreateInfo.nqueueFamilyIndexCount(address()); }
        /** Returns a {@link IntBuffer} view of the data pointed to by the {@code pQueueFamilyIndices} field. */
        @Nullable
        @NativeType("uint32_t const *")
        public IntBuffer pQueueFamilyIndices() { return VkBufferCreateInfo.npQueueFamilyIndices(address()); }

        /** Sets the specified value to the {@code sType} field. */
        public VkBufferCreateInfo.Buffer sType(@NativeType("VkStructureType") int value) { VkBufferCreateInfo.nsType(address(), value); return this; }
        /** Sets the specified value to the {@code pNext} field. */
        public VkBufferCreateInfo.Buffer pNext(@NativeType("void const *") long value) { VkBufferCreateInfo.npNext(address(), value); return this; }
        /** Sets the specified value to the {@code flags} field. */
        public VkBufferCreateInfo.Buffer flags(@NativeType("VkBufferCreateFlags") int value) { VkBufferCreateInfo.nflags(address(), value); return this; }
        /** Sets the specified value to the {@code size} field. */
        public VkBufferCreateInfo.Buffer size(@NativeType("VkDeviceSize") long value) { VkBufferCreateInfo.nsize(address(), value); return this; }
        /** Sets the specified value to the {@code usage} field. */
        public VkBufferCreateInfo.Buffer usage(@NativeType("VkBufferUsageFlags") int value) { VkBufferCreateInfo.nusage(address(), value); return this; }
        /** Sets the specified value to the {@code sharingMode} field. */
        public VkBufferCreateInfo.Buffer sharingMode(@NativeType("VkSharingMode") int value) { VkBufferCreateInfo.nsharingMode(address(), value); return this; }
        /** Sets the address of the specified {@link IntBuffer} to the {@code pQueueFamilyIndices} field. */
        public VkBufferCreateInfo.Buffer pQueueFamilyIndices(@Nullable @NativeType("uint32_t const *") IntBuffer value) { VkBufferCreateInfo.npQueueFamilyIndices(address(), value); return this; }

    }

}