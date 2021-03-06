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
 * job parameter
 */
public class JobParameter implements org.apache.thrift.TBase<JobParameter, JobParameter._Fields>, java.io.Serializable, Cloneable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("JobParameter");

  private static final org.apache.thrift.protocol.TField JOB_PHASE_FIELD_DESC = new org.apache.thrift.protocol.TField("jobPhase", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CONTEXT_PARAMETER_LIST_FIELD_DESC = new org.apache.thrift.protocol.TField("contextParameterList", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new JobParameterStandardSchemeFactory());
    schemes.put(TupleScheme.class, new JobParameterTupleSchemeFactory());
  }

  /**
   * 
   * @see JobPhase
   */
  public JobPhase jobPhase; // required
  public List<ContextParameter> contextParameterList; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see JobPhase
     */
    JOB_PHASE((short)1, "jobPhase"),
    CONTEXT_PARAMETER_LIST((short)2, "contextParameterList");

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
        case 1: // JOB_PHASE
          return JOB_PHASE;
        case 2: // CONTEXT_PARAMETER_LIST
          return CONTEXT_PARAMETER_LIST;
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
  private _Fields optionals[] = {_Fields.CONTEXT_PARAMETER_LIST};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.JOB_PHASE, new org.apache.thrift.meta_data.FieldMetaData("jobPhase", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, JobPhase.class)));
    tmpMap.put(_Fields.CONTEXT_PARAMETER_LIST, new org.apache.thrift.meta_data.FieldMetaData("contextParameterList", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, ContextParameter.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(JobParameter.class, metaDataMap);
  }

  public JobParameter() {
  }

  public JobParameter(
    JobPhase jobPhase)
  {
    this();
    this.jobPhase = jobPhase;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public JobParameter(JobParameter other) {
    if (other.isSetJobPhase()) {
      this.jobPhase = other.jobPhase;
    }
    if (other.isSetContextParameterList()) {
      List<ContextParameter> __this__contextParameterList = new ArrayList<ContextParameter>();
      for (ContextParameter other_element : other.contextParameterList) {
        __this__contextParameterList.add(new ContextParameter(other_element));
      }
      this.contextParameterList = __this__contextParameterList;
    }
  }

  public JobParameter deepCopy() {
    return new JobParameter(this);
  }

  @Override
  public void clear() {
    this.jobPhase = null;
    this.contextParameterList = null;
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
  public JobParameter setJobPhase(JobPhase jobPhase) {
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

  public int getContextParameterListSize() {
    return (this.contextParameterList == null) ? 0 : this.contextParameterList.size();
  }

  public java.util.Iterator<ContextParameter> getContextParameterListIterator() {
    return (this.contextParameterList == null) ? null : this.contextParameterList.iterator();
  }

  public void addToContextParameterList(ContextParameter elem) {
    if (this.contextParameterList == null) {
      this.contextParameterList = new ArrayList<ContextParameter>();
    }
    this.contextParameterList.add(elem);
  }

  public List<ContextParameter> getContextParameterList() {
    return this.contextParameterList;
  }

  public JobParameter setContextParameterList(List<ContextParameter> contextParameterList) {
    this.contextParameterList = contextParameterList;
    return this;
  }

  public void unsetContextParameterList() {
    this.contextParameterList = null;
  }

  /** Returns true if field contextParameterList is set (has been assigned a value) and false otherwise */
  public boolean isSetContextParameterList() {
    return this.contextParameterList != null;
  }

  public void setContextParameterListIsSet(boolean value) {
    if (!value) {
      this.contextParameterList = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case JOB_PHASE:
      if (value == null) {
        unsetJobPhase();
      } else {
        setJobPhase((JobPhase)value);
      }
      break;

    case CONTEXT_PARAMETER_LIST:
      if (value == null) {
        unsetContextParameterList();
      } else {
        setContextParameterList((List<ContextParameter>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case JOB_PHASE:
      return getJobPhase();

    case CONTEXT_PARAMETER_LIST:
      return getContextParameterList();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case JOB_PHASE:
      return isSetJobPhase();
    case CONTEXT_PARAMETER_LIST:
      return isSetContextParameterList();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof JobParameter)
      return this.equals((JobParameter)that);
    return false;
  }

  public boolean equals(JobParameter that) {
    if (that == null)
      return false;

    boolean this_present_jobPhase = true && this.isSetJobPhase();
    boolean that_present_jobPhase = true && that.isSetJobPhase();
    if (this_present_jobPhase || that_present_jobPhase) {
      if (!(this_present_jobPhase && that_present_jobPhase))
        return false;
      if (!this.jobPhase.equals(that.jobPhase))
        return false;
    }

    boolean this_present_contextParameterList = true && this.isSetContextParameterList();
    boolean that_present_contextParameterList = true && that.isSetContextParameterList();
    if (this_present_contextParameterList || that_present_contextParameterList) {
      if (!(this_present_contextParameterList && that_present_contextParameterList))
        return false;
      if (!this.contextParameterList.equals(that.contextParameterList))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public int compareTo(JobParameter other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;
    JobParameter typedOther = (JobParameter)other;

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
    lastComparison = Boolean.valueOf(isSetContextParameterList()).compareTo(typedOther.isSetContextParameterList());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContextParameterList()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contextParameterList, typedOther.contextParameterList);
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
    StringBuilder sb = new StringBuilder("JobParameter(");
    boolean first = true;

    sb.append("jobPhase:");
    if (this.jobPhase == null) {
      sb.append("null");
    } else {
      sb.append(this.jobPhase);
    }
    first = false;
    if (isSetContextParameterList()) {
      if (!first) sb.append(", ");
      sb.append("contextParameterList:");
      if (this.contextParameterList == null) {
        sb.append("null");
      } else {
        sb.append(this.contextParameterList);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class JobParameterStandardSchemeFactory implements SchemeFactory {
    public JobParameterStandardScheme getScheme() {
      return new JobParameterStandardScheme();
    }
  }

  private static class JobParameterStandardScheme extends StandardScheme<JobParameter> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, JobParameter struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // JOB_PHASE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.jobPhase = JobPhase.findByValue(iprot.readI32());
              struct.setJobPhaseIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CONTEXT_PARAMETER_LIST
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                struct.contextParameterList = new ArrayList<ContextParameter>(_list0.size);
                for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                {
                  ContextParameter _elem2; // required
                  _elem2 = new ContextParameter();
                  _elem2.read(iprot);
                  struct.contextParameterList.add(_elem2);
                }
                iprot.readListEnd();
              }
              struct.setContextParameterListIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, JobParameter struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.jobPhase != null) {
        oprot.writeFieldBegin(JOB_PHASE_FIELD_DESC);
        oprot.writeI32(struct.jobPhase.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.contextParameterList != null) {
        if (struct.isSetContextParameterList()) {
          oprot.writeFieldBegin(CONTEXT_PARAMETER_LIST_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.contextParameterList.size()));
            for (ContextParameter _iter3 : struct.contextParameterList)
            {
              _iter3.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class JobParameterTupleSchemeFactory implements SchemeFactory {
    public JobParameterTupleScheme getScheme() {
      return new JobParameterTupleScheme();
    }
  }

  private static class JobParameterTupleScheme extends TupleScheme<JobParameter> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, JobParameter struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.jobPhase.getValue());
      BitSet optionals = new BitSet();
      if (struct.isSetContextParameterList()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetContextParameterList()) {
        {
          oprot.writeI32(struct.contextParameterList.size());
          for (ContextParameter _iter4 : struct.contextParameterList)
          {
            _iter4.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, JobParameter struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.jobPhase = JobPhase.findByValue(iprot.readI32());
      struct.setJobPhaseIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.contextParameterList = new ArrayList<ContextParameter>(_list5.size);
          for (int _i6 = 0; _i6 < _list5.size; ++_i6)
          {
            ContextParameter _elem7; // required
            _elem7 = new ContextParameter();
            _elem7.read(iprot);
            struct.contextParameterList.add(_elem7);
          }
        }
        struct.setContextParameterListIsSet(true);
      }
    }
  }

}

