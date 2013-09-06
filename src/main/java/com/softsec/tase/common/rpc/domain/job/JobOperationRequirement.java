/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.softsec.tase.common.rpc.domain.job;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * job operation requirement
 */
public class JobOperationRequirement implements org.apache.thrift.TBase<JobOperationRequirement, JobOperationRequirement._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobOperationRequirement");

  private static final org.apache.thrift.protocol.TField JOB_LIFECYCLE_FIELD_DESC = new org.apache.thrift.protocol.TField("jobLifecycle", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField JOB_PHASE_FIELD_DESC = new org.apache.thrift.protocol.TField("jobPhase", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField JOB_EXECUTION_MODE_FIELD_DESC = new org.apache.thrift.protocol.TField("jobExecutionMode", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField JOB_RETURN_MODE_FIELD_DESC = new org.apache.thrift.protocol.TField("jobReturnMode", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField TIMEOUT_FIELD_DESC = new org.apache.thrift.protocol.TField("timeout", org.apache.thrift.protocol.TType.I64, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new JobOperationRequirementStandardSchemeFactory());
    schemes.put(TupleScheme.class, new JobOperationRequirementTupleSchemeFactory());
  }

  /**
   * 
   * @see JobLifecycle
   */
  public JobLifecycle jobLifecycle; // required
  /**
   * 
   * @see JobPhase
   */
  public JobPhase jobPhase; // required
  /**
   * 
   * @see JobExecutionMode
   */
  public JobExecutionMode jobExecutionMode; // optional
  /**
   * 
   * @see JobReturnMode
   */
  public JobReturnMode jobReturnMode; // optional
  public long timeout; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see JobLifecycle
     */
    JOB_LIFECYCLE((short)1, "jobLifecycle"),
    /**
     * 
     * @see JobPhase
     */
    JOB_PHASE((short)2, "jobPhase"),
    /**
     * 
     * @see JobExecutionMode
     */
    JOB_EXECUTION_MODE((short)3, "jobExecutionMode"),
    /**
     * 
     * @see JobReturnMode
     */
    JOB_RETURN_MODE((short)4, "jobReturnMode"),
    TIMEOUT((short)5, "timeout");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // JOB_LIFECYCLE
          return JOB_LIFECYCLE;
        case 2: // JOB_PHASE
          return JOB_PHASE;
        case 3: // JOB_EXECUTION_MODE
          return JOB_EXECUTION_MODE;
        case 4: // JOB_RETURN_MODE
          return JOB_RETURN_MODE;
        case 5: // TIMEOUT
          return TIMEOUT;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __TIMEOUT_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private _Fields optionals[] = {_Fields.JOB_EXECUTION_MODE,_Fields.JOB_RETURN_MODE,_Fields.TIMEOUT};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JOB_LIFECYCLE, new org.apache.thrift.meta_data.FieldMetaData("jobLifecycle", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, JobLifecycle.class)));
    tmpMap.put(_Fields.JOB_PHASE, new org.apache.thrift.meta_data.FieldMetaData("jobPhase", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, JobPhase.class)));
    tmpMap.put(_Fields.JOB_EXECUTION_MODE, new org.apache.thrift.meta_data.FieldMetaData("jobExecutionMode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, JobExecutionMode.class)));
    tmpMap.put(_Fields.JOB_RETURN_MODE, new org.apache.thrift.meta_data.FieldMetaData("jobReturnMode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, JobReturnMode.class)));
    tmpMap.put(_Fields.TIMEOUT, new org.apache.thrift.meta_data.FieldMetaData("timeout", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobOperationRequirement.class, metaDataMap);
  }

  public JobOperationRequirement() {
  }

  public JobOperationRequirement(
    JobLifecycle jobLifecycle,
    JobPhase jobPhase)
  {
    this();
    this.jobLifecycle = jobLifecycle;
    this.jobPhase = jobPhase;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobOperationRequirement(JobOperationRequirement other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetJobLifecycle()) {
      this.jobLifecycle = other.jobLifecycle;
    }
    if (other.isSetJobPhase()) {
      this.jobPhase = other.jobPhase;
    }
    if (other.isSetJobExecutionMode()) {
      this.jobExecutionMode = other.jobExecutionMode;
    }
    if (other.isSetJobReturnMode()) {
      this.jobReturnMode = other.jobReturnMode;
    }
    this.timeout = other.timeout;
  }

  public JobOperationRequirement deepCopy() {
    return new JobOperationRequirement(this);
  }

  @Override
  public void clear() {
    this.jobLifecycle = null;
    this.jobPhase = null;
    this.jobExecutionMode = null;
    this.jobReturnMode = null;
    setTimeoutIsSet(false);
    this.timeout = 0;
  }

  /**
   * 
   * @see JobLifecycle
   */
  public JobLifecycle getJobLifecycle() {
    return this.jobLifecycle;
  }

  /**
   * 
   * @see JobLifecycle
   */
  public JobOperationRequirement setJobLifecycle(JobLifecycle jobLifecycle) {
    this.jobLifecycle = jobLifecycle;
    return this;
  }

  public void unsetJobLifecycle() {
    this.jobLifecycle = null;
  }

  /** Returns true if field jobLifecycle is set (has been assigned a value) and false otherwise */
  public boolean isSetJobLifecycle() {
    return this.jobLifecycle != null;
  }

  public void setJobLifecycleIsSet(boolean value) {
    if (!value) {
      this.jobLifecycle = null;
    }
  }

  /**
   * 
   * @see JobPhase
   */
  public JobPhase getJobPhase() {
    return this.jobPhase;
  }

  /**
   * 
   * @see JobPhase
   */
  public JobOperationRequirement setJobPhase(JobPhase jobPhase) {
    this.jobPhase = jobPhase;
    return this;
  }

  public void unsetJobPhase() {
    this.jobPhase = null;
  }

  /** Returns true if field jobPhase is set (has been assigned a value) and false otherwise */
  public boolean isSetJobPhase() {
    return this.jobPhase != null;
  }

  public void setJobPhaseIsSet(boolean value) {
    if (!value) {
      this.jobPhase = null;
    }
  }

  /**
   * 
   * @see JobExecutionMode
   */
  public JobExecutionMode getJobExecutionMode() {
    return this.jobExecutionMode;
  }

  /**
   * 
   * @see JobExecutionMode
   */
  public JobOperationRequirement setJobExecutionMode(JobExecutionMode jobExecutionMode) {
    this.jobExecutionMode = jobExecutionMode;
    return this;
  }

  public void unsetJobExecutionMode() {
    this.jobExecutionMode = null;
  }

  /** Returns true if field jobExecutionMode is set (has been assigned a value) and false otherwise */
  public boolean isSetJobExecutionMode() {
    return this.jobExecutionMode != null;
  }

  public void setJobExecutionModeIsSet(boolean value) {
    if (!value) {
      this.jobExecutionMode = null;
    }
  }

  /**
   * 
   * @see JobReturnMode
   */
  public JobReturnMode getJobReturnMode() {
    return this.jobReturnMode;
  }

  /**
   * 
   * @see JobReturnMode
   */
  public JobOperationRequirement setJobReturnMode(JobReturnMode jobReturnMode) {
    this.jobReturnMode = jobReturnMode;
    return this;
  }

  public void unsetJobReturnMode() {
    this.jobReturnMode = null;
  }

  /** Returns true if field jobReturnMode is set (has been assigned a value) and false otherwise */
  public boolean isSetJobReturnMode() {
    return this.jobReturnMode != null;
  }

  public void setJobReturnModeIsSet(boolean value) {
    if (!value) {
      this.jobReturnMode = null;
    }
  }

  public long getTimeout() {
    return this.timeout;
  }

  public JobOperationRequirement setTimeout(long timeout) {
    this.timeout = timeout;
    setTimeoutIsSet(true);
    return this;
  }

  public void unsetTimeout() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMEOUT_ISSET_ID);
  }

  /** Returns true if field timeout is set (has been assigned a value) and false otherwise */
  public boolean isSetTimeout() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMEOUT_ISSET_ID);
  }

  public void setTimeoutIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMEOUT_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case JOB_LIFECYCLE:
      if (value == null) {
        unsetJobLifecycle();
      } else {
        setJobLifecycle((JobLifecycle)value);
      }
      break;

    case JOB_PHASE:
      if (value == null) {
        unsetJobPhase();
      } else {
        setJobPhase((JobPhase)value);
      }
      break;

    case JOB_EXECUTION_MODE:
      if (value == null) {
        unsetJobExecutionMode();
      } else {
        setJobExecutionMode((JobExecutionMode)value);
      }
      break;

    case JOB_RETURN_MODE:
      if (value == null) {
        unsetJobReturnMode();
      } else {
        setJobReturnMode((JobReturnMode)value);
      }
      break;

    case TIMEOUT:
      if (value == null) {
        unsetTimeout();
      } else {
        setTimeout((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JOB_LIFECYCLE:
      return getJobLifecycle();

    case JOB_PHASE:
      return getJobPhase();

    case JOB_EXECUTION_MODE:
      return getJobExecutionMode();

    case JOB_RETURN_MODE:
      return getJobReturnMode();

    case TIMEOUT:
      return Long.valueOf(getTimeout());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case JOB_LIFECYCLE:
      return isSetJobLifecycle();
    case JOB_PHASE:
      return isSetJobPhase();
    case JOB_EXECUTION_MODE:
      return isSetJobExecutionMode();
    case JOB_RETURN_MODE:
      return isSetJobReturnMode();
    case TIMEOUT:
      return isSetTimeout();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JobOperationRequirement)
      return this.equals((JobOperationRequirement)that);
    return false;
  }

  public boolean equals(JobOperationRequirement that) {
    if (that == null)
      return false;

    boolean this_present_jobLifecycle = true && this.isSetJobLifecycle();
    boolean that_present_jobLifecycle = true && that.isSetJobLifecycle();
    if (this_present_jobLifecycle || that_present_jobLifecycle) {
      if (!(this_present_jobLifecycle && that_present_jobLifecycle))
        return false;
      if (!this.jobLifecycle.equals(that.jobLifecycle))
        return false;
    }

    boolean this_present_jobPhase = true && this.isSetJobPhase();
    boolean that_present_jobPhase = true && that.isSetJobPhase();
    if (this_present_jobPhase || that_present_jobPhase) {
      if (!(this_present_jobPhase && that_present_jobPhase))
        return false;
      if (!this.jobPhase.equals(that.jobPhase))
        return false;
    }

    boolean this_present_jobExecutionMode = true && this.isSetJobExecutionMode();
    boolean that_present_jobExecutionMode = true && that.isSetJobExecutionMode();
    if (this_present_jobExecutionMode || that_present_jobExecutionMode) {
      if (!(this_present_jobExecutionMode && that_present_jobExecutionMode))
        return false;
      if (!this.jobExecutionMode.equals(that.jobExecutionMode))
        return false;
    }

    boolean this_present_jobReturnMode = true && this.isSetJobReturnMode();
    boolean that_present_jobReturnMode = true && that.isSetJobReturnMode();
    if (this_present_jobReturnMode || that_present_jobReturnMode) {
      if (!(this_present_jobReturnMode && that_present_jobReturnMode))
        return false;
      if (!this.jobReturnMode.equals(that.jobReturnMode))
        return false;
    }

    boolean this_present_timeout = true && this.isSetTimeout();
    boolean that_present_timeout = true && that.isSetTimeout();
    if (this_present_timeout || that_present_timeout) {
      if (!(this_present_timeout && that_present_timeout))
        return false;
      if (this.timeout != that.timeout)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(JobOperationRequirement other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    JobOperationRequirement typedOther = (JobOperationRequirement)other;

    lastComparison = Boolean.valueOf(isSetJobLifecycle()).compareTo(typedOther.isSetJobLifecycle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobLifecycle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobLifecycle, typedOther.jobLifecycle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJobPhase()).compareTo(typedOther.isSetJobPhase());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobPhase()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobPhase, typedOther.jobPhase);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJobExecutionMode()).compareTo(typedOther.isSetJobExecutionMode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobExecutionMode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobExecutionMode, typedOther.jobExecutionMode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetJobReturnMode()).compareTo(typedOther.isSetJobReturnMode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetJobReturnMode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.jobReturnMode, typedOther.jobReturnMode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTimeout()).compareTo(typedOther.isSetTimeout());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimeout()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timeout, typedOther.timeout);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("JobOperationRequirement(");
    boolean first = true;

    sb.append("jobLifecycle:");
    if (this.jobLifecycle == null) {
      sb.append("null");
    } else {
      sb.append(this.jobLifecycle);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("jobPhase:");
    if (this.jobPhase == null) {
      sb.append("null");
    } else {
      sb.append(this.jobPhase);
    }
    first = false;
    if (isSetJobExecutionMode()) {
      if (!first) sb.append(", ");
      sb.append("jobExecutionMode:");
      if (this.jobExecutionMode == null) {
        sb.append("null");
      } else {
        sb.append(this.jobExecutionMode);
      }
      first = false;
    }
    if (isSetJobReturnMode()) {
      if (!first) sb.append(", ");
      sb.append("jobReturnMode:");
      if (this.jobReturnMode == null) {
        sb.append("null");
      } else {
        sb.append(this.jobReturnMode);
      }
      first = false;
    }
    if (isSetTimeout()) {
      if (!first) sb.append(", ");
      sb.append("timeout:");
      sb.append(this.timeout);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (jobLifecycle == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'jobLifecycle' was not present! Struct: " + toString());
    }
    if (jobPhase == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'jobPhase' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class JobOperationRequirementStandardSchemeFactory implements SchemeFactory {
    public JobOperationRequirementStandardScheme getScheme() {
      return new JobOperationRequirementStandardScheme();
    }
  }

  private static class JobOperationRequirementStandardScheme extends StandardScheme<JobOperationRequirement> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JobOperationRequirement struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JOB_LIFECYCLE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.jobLifecycle = JobLifecycle.findByValue(iprot.readI32());
              struct.setJobLifecycleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // JOB_PHASE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.jobPhase = JobPhase.findByValue(iprot.readI32());
              struct.setJobPhaseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // JOB_EXECUTION_MODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.jobExecutionMode = JobExecutionMode.findByValue(iprot.readI32());
              struct.setJobExecutionModeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // JOB_RETURN_MODE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.jobReturnMode = JobReturnMode.findByValue(iprot.readI32());
              struct.setJobReturnModeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TIMEOUT
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timeout = iprot.readI64();
              struct.setTimeoutIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, JobOperationRequirement struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.jobLifecycle != null) {
        oprot.writeFieldBegin(JOB_LIFECYCLE_FIELD_DESC);
        oprot.writeI32(struct.jobLifecycle.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.jobPhase != null) {
        oprot.writeFieldBegin(JOB_PHASE_FIELD_DESC);
        oprot.writeI32(struct.jobPhase.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.jobExecutionMode != null) {
        if (struct.isSetJobExecutionMode()) {
          oprot.writeFieldBegin(JOB_EXECUTION_MODE_FIELD_DESC);
          oprot.writeI32(struct.jobExecutionMode.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.jobReturnMode != null) {
        if (struct.isSetJobReturnMode()) {
          oprot.writeFieldBegin(JOB_RETURN_MODE_FIELD_DESC);
          oprot.writeI32(struct.jobReturnMode.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetTimeout()) {
        oprot.writeFieldBegin(TIMEOUT_FIELD_DESC);
        oprot.writeI64(struct.timeout);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JobOperationRequirementTupleSchemeFactory implements SchemeFactory {
    public JobOperationRequirementTupleScheme getScheme() {
      return new JobOperationRequirementTupleScheme();
    }
  }

  private static class JobOperationRequirementTupleScheme extends TupleScheme<JobOperationRequirement> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JobOperationRequirement struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.jobLifecycle.getValue());
      oprot.writeI32(struct.jobPhase.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetJobExecutionMode()) {
        optionals.set(0);
      }
      if (struct.isSetJobReturnMode()) {
        optionals.set(1);
      }
      if (struct.isSetTimeout()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetJobExecutionMode()) {
        oprot.writeI32(struct.jobExecutionMode.getValue());
      }
      if (struct.isSetJobReturnMode()) {
        oprot.writeI32(struct.jobReturnMode.getValue());
      }
      if (struct.isSetTimeout()) {
        oprot.writeI64(struct.timeout);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JobOperationRequirement struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.jobLifecycle = JobLifecycle.findByValue(iprot.readI32());
      struct.setJobLifecycleIsSet(true);
      struct.jobPhase = JobPhase.findByValue(iprot.readI32());
      struct.setJobPhaseIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.jobExecutionMode = JobExecutionMode.findByValue(iprot.readI32());
        struct.setJobExecutionModeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.jobReturnMode = JobReturnMode.findByValue(iprot.readI32());
        struct.setJobReturnModeIsSet(true);
      }
      if (incoming.get(2)) {
        struct.timeout = iprot.readI64();
        struct.setTimeoutIsSet(true);
      }
    }
  }

}
