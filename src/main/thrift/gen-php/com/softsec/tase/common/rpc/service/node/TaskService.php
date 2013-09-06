<?php
namespace com\softsec\tase\common\rpc\service\node;
/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Exception\TApplicationException;


interface TaskServiceIf {
  public function submitContext(\com\softsec\tase\common\rpc\domain\container\Context $context);
  public function terminateContext($taskId);
  public function updateProgram($programName);
  public function updateNodeInfo();
}

class TaskServiceClient implements \com\softsec\tase\common\rpc\service\node\TaskServiceIf {
  protected $input_ = null;
  protected $output_ = null;

  protected $seqid_ = 0;

  public function __construct($input, $output=null) {
    $this->input_ = $input;
    $this->output_ = $output ? $output : $input;
  }

  public function submitContext(\com\softsec\tase\common\rpc\domain\container\Context $context)
  {
    $this->send_submitContext($context);
    return $this->recv_submitContext();
  }

  public function send_submitContext(\com\softsec\tase\common\rpc\domain\container\Context $context)
  {
    $args = new \com\softsec\tase\common\rpc\service\node\TaskService_submitContext_args();
    $args->context = $context;
    $bin_accel = ($this->output_ instanceof TProtocol::$TBINARYPROTOCOLACCELERATED) && function_exists('thrift_protocol_write_binary');
    if ($bin_accel)
    {
      thrift_protocol_write_binary($this->output_, 'submitContext', TMessageType::CALL, $args, $this->seqid_, $this->output_->isStrictWrite());
    }
    else
    {
      $this->output_->writeMessageBegin('submitContext', TMessageType::CALL, $this->seqid_);
      $args->write($this->output_);
      $this->output_->writeMessageEnd();
      $this->output_->getTransport()->flush();
    }
  }

  public function recv_submitContext()
  {
    $bin_accel = ($this->input_ instanceof TProtocol::$TBINARYPROTOCOLACCELERATED) && function_exists('thrift_protocol_read_binary');
    if ($bin_accel) $result = thrift_protocol_read_binary($this->input_, '\com\softsec\tase\common\rpc\service\node\TaskService_submitContext_result', $this->input_->isStrictRead());
    else
    {
      $rseqid = 0;
      $fname = null;
      $mtype = 0;

      $this->input_->readMessageBegin($fname, $mtype, $rseqid);
      if ($mtype == TMessageType::EXCEPTION) {
        $x = new TApplicationException();
        $x->read($this->input_);
        $this->input_->readMessageEnd();
        throw $x;
      }
      $result = new \com\softsec\tase\common\rpc\service\node\TaskService_submitContext_result();
      $result->read($this->input_);
      $this->input_->readMessageEnd();
    }
    if ($result->success !== null) {
      return $result->success;
    }
    if ($result->ire !== null) {
      throw $result->ire;
    }
    if ($result->ue !== null) {
      throw $result->ue;
    }
    if ($result->te !== null) {
      throw $result->te;
    }
    throw new \Exception("submitContext failed: unknown result");
  }

  public function terminateContext($taskId)
  {
    $this->send_terminateContext($taskId);
    return $this->recv_terminateContext();
  }

  public function send_terminateContext($taskId)
  {
    $args = new \com\softsec\tase\common\rpc\service\node\TaskService_terminateContext_args();
    $args->taskId = $taskId;
    $bin_accel = ($this->output_ instanceof TProtocol::$TBINARYPROTOCOLACCELERATED) && function_exists('thrift_protocol_write_binary');
    if ($bin_accel)
    {
      thrift_protocol_write_binary($this->output_, 'terminateContext', TMessageType::CALL, $args, $this->seqid_, $this->output_->isStrictWrite());
    }
    else
    {
      $this->output_->writeMessageBegin('terminateContext', TMessageType::CALL, $this->seqid_);
      $args->write($this->output_);
      $this->output_->writeMessageEnd();
      $this->output_->getTransport()->flush();
    }
  }

  public function recv_terminateContext()
  {
    $bin_accel = ($this->input_ instanceof TProtocol::$TBINARYPROTOCOLACCELERATED) && function_exists('thrift_protocol_read_binary');
    if ($bin_accel) $result = thrift_protocol_read_binary($this->input_, '\com\softsec\tase\common\rpc\service\node\TaskService_terminateContext_result', $this->input_->isStrictRead());
    else
    {
      $rseqid = 0;
      $fname = null;
      $mtype = 0;

      $this->input_->readMessageBegin($fname, $mtype, $rseqid);
      if ($mtype == TMessageType::EXCEPTION) {
        $x = new TApplicationException();
        $x->read($this->input_);
        $this->input_->readMessageEnd();
        throw $x;
      }
      $result = new \com\softsec\tase\common\rpc\service\node\TaskService_terminateContext_result();
      $result->read($this->input_);
      $this->input_->readMessageEnd();
    }
    if ($result->success !== null) {
      return $result->success;
    }
    if ($result->ire !== null) {
      throw $result->ire;
    }
    if ($result->ue !== null) {
      throw $result->ue;
    }
    if ($result->nfe !== null) {
      throw $result->nfe;
    }
    if ($result->te !== null) {
      throw $result->te;
    }
    throw new \Exception("terminateContext failed: unknown result");
  }

  public function updateProgram($programName)
  {
    $this->send_updateProgram($programName);
    return $this->recv_updateProgram();
  }

  public function send_updateProgram($programName)
  {
    $args = new \com\softsec\tase\common\rpc\service\node\TaskService_updateProgram_args();
    $args->programName = $programName;
    $bin_accel = ($this->output_ instanceof TProtocol::$TBINARYPROTOCOLACCELERATED) && function_exists('thrift_protocol_write_binary');
    if ($bin_accel)
    {
      thrift_protocol_write_binary($this->output_, 'updateProgram', TMessageType::CALL, $args, $this->seqid_, $this->output_->isStrictWrite());
    }
    else
    {
      $this->output_->writeMessageBegin('updateProgram', TMessageType::CALL, $this->seqid_);
      $args->write($this->output_);
      $this->output_->writeMessageEnd();
      $this->output_->getTransport()->flush();
    }
  }

  public function recv_updateProgram()
  {
    $bin_accel = ($this->input_ instanceof TProtocol::$TBINARYPROTOCOLACCELERATED) && function_exists('thrift_protocol_read_binary');
    if ($bin_accel) $result = thrift_protocol_read_binary($this->input_, '\com\softsec\tase\common\rpc\service\node\TaskService_updateProgram_result', $this->input_->isStrictRead());
    else
    {
      $rseqid = 0;
      $fname = null;
      $mtype = 0;

      $this->input_->readMessageBegin($fname, $mtype, $rseqid);
      if ($mtype == TMessageType::EXCEPTION) {
        $x = new TApplicationException();
        $x->read($this->input_);
        $this->input_->readMessageEnd();
        throw $x;
      }
      $result = new \com\softsec\tase\common\rpc\service\node\TaskService_updateProgram_result();
      $result->read($this->input_);
      $this->input_->readMessageEnd();
    }
    if ($result->success !== null) {
      return $result->success;
    }
    if ($result->ire !== null) {
      throw $result->ire;
    }
    if ($result->ue !== null) {
      throw $result->ue;
    }
    if ($result->nfe !== null) {
      throw $result->nfe;
    }
    if ($result->te !== null) {
      throw $result->te;
    }
    throw new \Exception("updateProgram failed: unknown result");
  }

  public function updateNodeInfo()
  {
    $this->send_updateNodeInfo();
    return $this->recv_updateNodeInfo();
  }

  public function send_updateNodeInfo()
  {
    $args = new \com\softsec\tase\common\rpc\service\node\TaskService_updateNodeInfo_args();
    $bin_accel = ($this->output_ instanceof TProtocol::$TBINARYPROTOCOLACCELERATED) && function_exists('thrift_protocol_write_binary');
    if ($bin_accel)
    {
      thrift_protocol_write_binary($this->output_, 'updateNodeInfo', TMessageType::CALL, $args, $this->seqid_, $this->output_->isStrictWrite());
    }
    else
    {
      $this->output_->writeMessageBegin('updateNodeInfo', TMessageType::CALL, $this->seqid_);
      $args->write($this->output_);
      $this->output_->writeMessageEnd();
      $this->output_->getTransport()->flush();
    }
  }

  public function recv_updateNodeInfo()
  {
    $bin_accel = ($this->input_ instanceof TProtocol::$TBINARYPROTOCOLACCELERATED) && function_exists('thrift_protocol_read_binary');
    if ($bin_accel) $result = thrift_protocol_read_binary($this->input_, '\com\softsec\tase\common\rpc\service\node\TaskService_updateNodeInfo_result', $this->input_->isStrictRead());
    else
    {
      $rseqid = 0;
      $fname = null;
      $mtype = 0;

      $this->input_->readMessageBegin($fname, $mtype, $rseqid);
      if ($mtype == TMessageType::EXCEPTION) {
        $x = new TApplicationException();
        $x->read($this->input_);
        $this->input_->readMessageEnd();
        throw $x;
      }
      $result = new \com\softsec\tase\common\rpc\service\node\TaskService_updateNodeInfo_result();
      $result->read($this->input_);
      $this->input_->readMessageEnd();
    }
    if ($result->success !== null) {
      return $result->success;
    }
    if ($result->ue !== null) {
      throw $result->ue;
    }
    if ($result->te !== null) {
      throw $result->te;
    }
    throw new \Exception("updateNodeInfo failed: unknown result");
  }

}

// HELPER FUNCTIONS AND STRUCTURES

class TaskService_submitContext_args {
  static $_TSPEC;

  public $context = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'context',
          'type' => TType::STRUCT,
          'class' => '\com\softsec\tase\common\rpc\domain\container\Context',
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['context'])) {
        $this->context = $vals['context'];
      }
    }
  }

  public function getName() {
    return 'TaskService_submitContext_args';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRUCT) {
            $this->context = new \com\softsec\tase\common\rpc\domain\container\Context();
            $xfer += $this->context->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('TaskService_submitContext_args');
    if ($this->context !== null) {
      if (!is_object($this->context)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('context', TType::STRUCT, 1);
      $xfer += $this->context->write($output);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class TaskService_submitContext_result {
  static $_TSPEC;

  public $success = null;
  public $ire = null;
  public $ue = null;
  public $te = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        0 => array(
          'var' => 'success',
          'type' => TType::I32,
          ),
        1 => array(
          'var' => 'ire',
          'type' => TType::STRUCT,
          'class' => '\com\softsec\tase\common\rpc\exception\InvalidRequestException',
          ),
        2 => array(
          'var' => 'ue',
          'type' => TType::STRUCT,
          'class' => '\com\softsec\tase\common\rpc\exception\UnavailableException',
          ),
        3 => array(
          'var' => 'te',
          'type' => TType::STRUCT,
          'class' => '\com\softsec\tase\common\rpc\exception\TimeoutException',
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['success'])) {
        $this->success = $vals['success'];
      }
      if (isset($vals['ire'])) {
        $this->ire = $vals['ire'];
      }
      if (isset($vals['ue'])) {
        $this->ue = $vals['ue'];
      }
      if (isset($vals['te'])) {
        $this->te = $vals['te'];
      }
    }
  }

  public function getName() {
    return 'TaskService_submitContext_result';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 0:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->success);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 1:
          if ($ftype == TType::STRUCT) {
            $this->ire = new \com\softsec\tase\common\rpc\exception\InvalidRequestException();
            $xfer += $this->ire->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRUCT) {
            $this->ue = new \com\softsec\tase\common\rpc\exception\UnavailableException();
            $xfer += $this->ue->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRUCT) {
            $this->te = new \com\softsec\tase\common\rpc\exception\TimeoutException();
            $xfer += $this->te->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('TaskService_submitContext_result');
    if ($this->success !== null) {
      $xfer += $output->writeFieldBegin('success', TType::I32, 0);
      $xfer += $output->writeI32($this->success);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->ire !== null) {
      $xfer += $output->writeFieldBegin('ire', TType::STRUCT, 1);
      $xfer += $this->ire->write($output);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->ue !== null) {
      $xfer += $output->writeFieldBegin('ue', TType::STRUCT, 2);
      $xfer += $this->ue->write($output);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->te !== null) {
      $xfer += $output->writeFieldBegin('te', TType::STRUCT, 3);
      $xfer += $this->te->write($output);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class TaskService_terminateContext_args {
  static $_TSPEC;

  public $taskId = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'taskId',
          'type' => TType::STRING,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['taskId'])) {
        $this->taskId = $vals['taskId'];
      }
    }
  }

  public function getName() {
    return 'TaskService_terminateContext_args';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->taskId);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('TaskService_terminateContext_args');
    if ($this->taskId !== null) {
      $xfer += $output->writeFieldBegin('taskId', TType::STRING, 1);
      $xfer += $output->writeString($this->taskId);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class TaskService_terminateContext_result {
  static $_TSPEC;

  public $success = null;
  public $ire = null;
  public $ue = null;
  public $nfe = null;
  public $te = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        0 => array(
          'var' => 'success',
          'type' => TType::I32,
          ),
        1 => array(
          'var' => 'ire',
          'type' => TType::STRUCT,
          'class' => '\com\softsec\tase\common\rpc\exception\InvalidRequestException',
          ),
        2 => array(
          'var' => 'ue',
          'type' => TType::STRUCT,
          'class' => '\com\softsec\tase\common\rpc\exception\UnavailableException',
          ),
        3 => array(
          'var' => 'nfe',
          'type' => TType::STRUCT,
          'class' => '\com\softsec\tase\common\rpc\exception\NotFoundException',
          ),
        4 => array(
          'var' => 'te',
          'type' => TType::STRUCT,
          'class' => '\com\softsec\tase\common\rpc\exception\TimeoutException',
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['success'])) {
        $this->success = $vals['success'];
      }
      if (isset($vals['ire'])) {
        $this->ire = $vals['ire'];
      }
      if (isset($vals['ue'])) {
        $this->ue = $vals['ue'];
      }
      if (isset($vals['nfe'])) {
        $this->nfe = $vals['nfe'];
      }
      if (isset($vals['te'])) {
        $this->te = $vals['te'];
      }
    }
  }

  public function getName() {
    return 'TaskService_terminateContext_result';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 0:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->success);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 1:
          if ($ftype == TType::STRUCT) {
            $this->ire = new \com\softsec\tase\common\rpc\exception\InvalidRequestException();
            $xfer += $this->ire->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRUCT) {
            $this->ue = new \com\softsec\tase\common\rpc\exception\UnavailableException();
            $xfer += $this->ue->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRUCT) {
            $this->nfe = new \com\softsec\tase\common\rpc\exception\NotFoundException();
            $xfer += $this->nfe->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::STRUCT) {
            $this->te = new \com\softsec\tase\common\rpc\exception\TimeoutException();
            $xfer += $this->te->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('TaskService_terminateContext_result');
    if ($this->success !== null) {
      $xfer += $output->writeFieldBegin('success', TType::I32, 0);
      $xfer += $output->writeI32($this->success);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->ire !== null) {
      $xfer += $output->writeFieldBegin('ire', TType::STRUCT, 1);
      $xfer += $this->ire->write($output);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->ue !== null) {
      $xfer += $output->writeFieldBegin('ue', TType::STRUCT, 2);
      $xfer += $this->ue->write($output);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->nfe !== null) {
      $xfer += $output->writeFieldBegin('nfe', TType::STRUCT, 3);
      $xfer += $this->nfe->write($output);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->te !== null) {
      $xfer += $output->writeFieldBegin('te', TType::STRUCT, 4);
      $xfer += $this->te->write($output);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class TaskService_updateProgram_args {
  static $_TSPEC;

  public $programName = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        1 => array(
          'var' => 'programName',
          'type' => TType::STRING,
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['programName'])) {
        $this->programName = $vals['programName'];
      }
    }
  }

  public function getName() {
    return 'TaskService_updateProgram_args';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 1:
          if ($ftype == TType::STRING) {
            $xfer += $input->readString($this->programName);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('TaskService_updateProgram_args');
    if ($this->programName !== null) {
      $xfer += $output->writeFieldBegin('programName', TType::STRING, 1);
      $xfer += $output->writeString($this->programName);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class TaskService_updateProgram_result {
  static $_TSPEC;

  public $success = null;
  public $ire = null;
  public $ue = null;
  public $nfe = null;
  public $te = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        0 => array(
          'var' => 'success',
          'type' => TType::I32,
          ),
        1 => array(
          'var' => 'ire',
          'type' => TType::STRUCT,
          'class' => '\com\softsec\tase\common\rpc\exception\InvalidRequestException',
          ),
        2 => array(
          'var' => 'ue',
          'type' => TType::STRUCT,
          'class' => '\com\softsec\tase\common\rpc\exception\UnavailableException',
          ),
        3 => array(
          'var' => 'nfe',
          'type' => TType::STRUCT,
          'class' => '\com\softsec\tase\common\rpc\exception\NotFoundException',
          ),
        4 => array(
          'var' => 'te',
          'type' => TType::STRUCT,
          'class' => '\com\softsec\tase\common\rpc\exception\TimeoutException',
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['success'])) {
        $this->success = $vals['success'];
      }
      if (isset($vals['ire'])) {
        $this->ire = $vals['ire'];
      }
      if (isset($vals['ue'])) {
        $this->ue = $vals['ue'];
      }
      if (isset($vals['nfe'])) {
        $this->nfe = $vals['nfe'];
      }
      if (isset($vals['te'])) {
        $this->te = $vals['te'];
      }
    }
  }

  public function getName() {
    return 'TaskService_updateProgram_result';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 0:
          if ($ftype == TType::I32) {
            $xfer += $input->readI32($this->success);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 1:
          if ($ftype == TType::STRUCT) {
            $this->ire = new \com\softsec\tase\common\rpc\exception\InvalidRequestException();
            $xfer += $this->ire->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRUCT) {
            $this->ue = new \com\softsec\tase\common\rpc\exception\UnavailableException();
            $xfer += $this->ue->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 3:
          if ($ftype == TType::STRUCT) {
            $this->nfe = new \com\softsec\tase\common\rpc\exception\NotFoundException();
            $xfer += $this->nfe->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 4:
          if ($ftype == TType::STRUCT) {
            $this->te = new \com\softsec\tase\common\rpc\exception\TimeoutException();
            $xfer += $this->te->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('TaskService_updateProgram_result');
    if ($this->success !== null) {
      $xfer += $output->writeFieldBegin('success', TType::I32, 0);
      $xfer += $output->writeI32($this->success);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->ire !== null) {
      $xfer += $output->writeFieldBegin('ire', TType::STRUCT, 1);
      $xfer += $this->ire->write($output);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->ue !== null) {
      $xfer += $output->writeFieldBegin('ue', TType::STRUCT, 2);
      $xfer += $this->ue->write($output);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->nfe !== null) {
      $xfer += $output->writeFieldBegin('nfe', TType::STRUCT, 3);
      $xfer += $this->nfe->write($output);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->te !== null) {
      $xfer += $output->writeFieldBegin('te', TType::STRUCT, 4);
      $xfer += $this->te->write($output);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class TaskService_updateNodeInfo_args {
  static $_TSPEC;


  public function __construct() {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        );
    }
  }

  public function getName() {
    return 'TaskService_updateNodeInfo_args';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('TaskService_updateNodeInfo_args');
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

class TaskService_updateNodeInfo_result {
  static $_TSPEC;

  public $success = null;
  public $ue = null;
  public $te = null;

  public function __construct($vals=null) {
    if (!isset(self::$_TSPEC)) {
      self::$_TSPEC = array(
        0 => array(
          'var' => 'success',
          'type' => TType::STRUCT,
          'class' => '\com\softsec\tase\common\rpc\domain\node\NodeInfo',
          ),
        1 => array(
          'var' => 'ue',
          'type' => TType::STRUCT,
          'class' => '\com\softsec\tase\common\rpc\exception\UnavailableException',
          ),
        2 => array(
          'var' => 'te',
          'type' => TType::STRUCT,
          'class' => '\com\softsec\tase\common\rpc\exception\TimeoutException',
          ),
        );
    }
    if (is_array($vals)) {
      if (isset($vals['success'])) {
        $this->success = $vals['success'];
      }
      if (isset($vals['ue'])) {
        $this->ue = $vals['ue'];
      }
      if (isset($vals['te'])) {
        $this->te = $vals['te'];
      }
    }
  }

  public function getName() {
    return 'TaskService_updateNodeInfo_result';
  }

  public function read($input)
  {
    $xfer = 0;
    $fname = null;
    $ftype = 0;
    $fid = 0;
    $xfer += $input->readStructBegin($fname);
    while (true)
    {
      $xfer += $input->readFieldBegin($fname, $ftype, $fid);
      if ($ftype == TType::STOP) {
        break;
      }
      switch ($fid)
      {
        case 0:
          if ($ftype == TType::STRUCT) {
            $this->success = new \com\softsec\tase\common\rpc\domain\node\NodeInfo();
            $xfer += $this->success->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 1:
          if ($ftype == TType::STRUCT) {
            $this->ue = new \com\softsec\tase\common\rpc\exception\UnavailableException();
            $xfer += $this->ue->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        case 2:
          if ($ftype == TType::STRUCT) {
            $this->te = new \com\softsec\tase\common\rpc\exception\TimeoutException();
            $xfer += $this->te->read($input);
          } else {
            $xfer += $input->skip($ftype);
          }
          break;
        default:
          $xfer += $input->skip($ftype);
          break;
      }
      $xfer += $input->readFieldEnd();
    }
    $xfer += $input->readStructEnd();
    return $xfer;
  }

  public function write($output) {
    $xfer = 0;
    $xfer += $output->writeStructBegin('TaskService_updateNodeInfo_result');
    if ($this->success !== null) {
      if (!is_object($this->success)) {
        throw new TProtocolException('Bad type in structure.', TProtocolException::INVALID_DATA);
      }
      $xfer += $output->writeFieldBegin('success', TType::STRUCT, 0);
      $xfer += $this->success->write($output);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->ue !== null) {
      $xfer += $output->writeFieldBegin('ue', TType::STRUCT, 1);
      $xfer += $this->ue->write($output);
      $xfer += $output->writeFieldEnd();
    }
    if ($this->te !== null) {
      $xfer += $output->writeFieldBegin('te', TType::STRUCT, 2);
      $xfer += $this->te->write($output);
      $xfer += $output->writeFieldEnd();
    }
    $xfer += $output->writeFieldStop();
    $xfer += $output->writeStructEnd();
    return $xfer;
  }

}

