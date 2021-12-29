/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PartitionsTopic extends AbstractModel{

    /**
    * Average size of the messages published in the last interval in bytes.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("AverageMsgSize")
    @Expose
    private String AverageMsgSize;

    /**
    * Number of consumers.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ConsumerCount")
    @Expose
    private String ConsumerCount;

    /**
    * Total number of recorded messages.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastConfirmedEntry")
    @Expose
    private String LastConfirmedEntry;

    /**
    * Time when the last ledger was created.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("LastLedgerCreatedTimestamp")
    @Expose
    private String LastLedgerCreatedTimestamp;

    /**
    * Number of messages published by local and replicated publishers per second.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgRateIn")
    @Expose
    private String MsgRateIn;

    /**
    * Sum of the numbers of messages delivered by local and replicated consumers per second.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgRateOut")
    @Expose
    private String MsgRateOut;

    /**
    * Number of bytes of messages published by local and replicated publishers per second.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgThroughputIn")
    @Expose
    private String MsgThroughputIn;

    /**
    * Number of bytes of messages delivered by local and replicated consumers per second.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("MsgThroughputOut")
    @Expose
    private String MsgThroughputOut;

    /**
    * Total number of recorded messages.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("NumberOfEntries")
    @Expose
    private String NumberOfEntries;

    /**
    * Subpartition ID.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("Partitions")
    @Expose
    private Long Partitions;

    /**
    * Number of producers.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ProducerCount")
    @Expose
    private String ProducerCount;

    /**
    * Total amount of all stored messages in bytes.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalSize")
    @Expose
    private String TotalSize;

    /**
    * Topic type description.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TopicType")
    @Expose
    private Long TopicType;

    /**
     * Get Average size of the messages published in the last interval in bytes.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return AverageMsgSize Average size of the messages published in the last interval in bytes.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getAverageMsgSize() {
        return this.AverageMsgSize;
    }

    /**
     * Set Average size of the messages published in the last interval in bytes.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param AverageMsgSize Average size of the messages published in the last interval in bytes.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setAverageMsgSize(String AverageMsgSize) {
        this.AverageMsgSize = AverageMsgSize;
    }

    /**
     * Get Number of consumers.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ConsumerCount Number of consumers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getConsumerCount() {
        return this.ConsumerCount;
    }

    /**
     * Set Number of consumers.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ConsumerCount Number of consumers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setConsumerCount(String ConsumerCount) {
        this.ConsumerCount = ConsumerCount;
    }

    /**
     * Get Total number of recorded messages.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LastConfirmedEntry Total number of recorded messages.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLastConfirmedEntry() {
        return this.LastConfirmedEntry;
    }

    /**
     * Set Total number of recorded messages.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LastConfirmedEntry Total number of recorded messages.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLastConfirmedEntry(String LastConfirmedEntry) {
        this.LastConfirmedEntry = LastConfirmedEntry;
    }

    /**
     * Get Time when the last ledger was created.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return LastLedgerCreatedTimestamp Time when the last ledger was created.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getLastLedgerCreatedTimestamp() {
        return this.LastLedgerCreatedTimestamp;
    }

    /**
     * Set Time when the last ledger was created.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param LastLedgerCreatedTimestamp Time when the last ledger was created.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setLastLedgerCreatedTimestamp(String LastLedgerCreatedTimestamp) {
        this.LastLedgerCreatedTimestamp = LastLedgerCreatedTimestamp;
    }

    /**
     * Get Number of messages published by local and replicated publishers per second.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MsgRateIn Number of messages published by local and replicated publishers per second.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMsgRateIn() {
        return this.MsgRateIn;
    }

    /**
     * Set Number of messages published by local and replicated publishers per second.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MsgRateIn Number of messages published by local and replicated publishers per second.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgRateIn(String MsgRateIn) {
        this.MsgRateIn = MsgRateIn;
    }

    /**
     * Get Sum of the numbers of messages delivered by local and replicated consumers per second.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MsgRateOut Sum of the numbers of messages delivered by local and replicated consumers per second.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMsgRateOut() {
        return this.MsgRateOut;
    }

    /**
     * Set Sum of the numbers of messages delivered by local and replicated consumers per second.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MsgRateOut Sum of the numbers of messages delivered by local and replicated consumers per second.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgRateOut(String MsgRateOut) {
        this.MsgRateOut = MsgRateOut;
    }

    /**
     * Get Number of bytes of messages published by local and replicated publishers per second.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MsgThroughputIn Number of bytes of messages published by local and replicated publishers per second.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMsgThroughputIn() {
        return this.MsgThroughputIn;
    }

    /**
     * Set Number of bytes of messages published by local and replicated publishers per second.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MsgThroughputIn Number of bytes of messages published by local and replicated publishers per second.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgThroughputIn(String MsgThroughputIn) {
        this.MsgThroughputIn = MsgThroughputIn;
    }

    /**
     * Get Number of bytes of messages delivered by local and replicated consumers per second.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return MsgThroughputOut Number of bytes of messages delivered by local and replicated consumers per second.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getMsgThroughputOut() {
        return this.MsgThroughputOut;
    }

    /**
     * Set Number of bytes of messages delivered by local and replicated consumers per second.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param MsgThroughputOut Number of bytes of messages delivered by local and replicated consumers per second.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setMsgThroughputOut(String MsgThroughputOut) {
        this.MsgThroughputOut = MsgThroughputOut;
    }

    /**
     * Get Total number of recorded messages.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return NumberOfEntries Total number of recorded messages.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getNumberOfEntries() {
        return this.NumberOfEntries;
    }

    /**
     * Set Total number of recorded messages.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param NumberOfEntries Total number of recorded messages.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setNumberOfEntries(String NumberOfEntries) {
        this.NumberOfEntries = NumberOfEntries;
    }

    /**
     * Get Subpartition ID.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return Partitions Subpartition ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getPartitions() {
        return this.Partitions;
    }

    /**
     * Set Subpartition ID.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param Partitions Subpartition ID.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setPartitions(Long Partitions) {
        this.Partitions = Partitions;
    }

    /**
     * Get Number of producers.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ProducerCount Number of producers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getProducerCount() {
        return this.ProducerCount;
    }

    /**
     * Set Number of producers.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ProducerCount Number of producers.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setProducerCount(String ProducerCount) {
        this.ProducerCount = ProducerCount;
    }

    /**
     * Get Total amount of all stored messages in bytes.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TotalSize Total amount of all stored messages in bytes.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public String getTotalSize() {
        return this.TotalSize;
    }

    /**
     * Set Total amount of all stored messages in bytes.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TotalSize Total amount of all stored messages in bytes.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalSize(String TotalSize) {
        this.TotalSize = TotalSize;
    }

    /**
     * Get Topic type description.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TopicType Topic type description.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTopicType() {
        return this.TopicType;
    }

    /**
     * Set Topic type description.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TopicType Topic type description.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTopicType(Long TopicType) {
        this.TopicType = TopicType;
    }

    public PartitionsTopic() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PartitionsTopic(PartitionsTopic source) {
        if (source.AverageMsgSize != null) {
            this.AverageMsgSize = new String(source.AverageMsgSize);
        }
        if (source.ConsumerCount != null) {
            this.ConsumerCount = new String(source.ConsumerCount);
        }
        if (source.LastConfirmedEntry != null) {
            this.LastConfirmedEntry = new String(source.LastConfirmedEntry);
        }
        if (source.LastLedgerCreatedTimestamp != null) {
            this.LastLedgerCreatedTimestamp = new String(source.LastLedgerCreatedTimestamp);
        }
        if (source.MsgRateIn != null) {
            this.MsgRateIn = new String(source.MsgRateIn);
        }
        if (source.MsgRateOut != null) {
            this.MsgRateOut = new String(source.MsgRateOut);
        }
        if (source.MsgThroughputIn != null) {
            this.MsgThroughputIn = new String(source.MsgThroughputIn);
        }
        if (source.MsgThroughputOut != null) {
            this.MsgThroughputOut = new String(source.MsgThroughputOut);
        }
        if (source.NumberOfEntries != null) {
            this.NumberOfEntries = new String(source.NumberOfEntries);
        }
        if (source.Partitions != null) {
            this.Partitions = new Long(source.Partitions);
        }
        if (source.ProducerCount != null) {
            this.ProducerCount = new String(source.ProducerCount);
        }
        if (source.TotalSize != null) {
            this.TotalSize = new String(source.TotalSize);
        }
        if (source.TopicType != null) {
            this.TopicType = new Long(source.TopicType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AverageMsgSize", this.AverageMsgSize);
        this.setParamSimple(map, prefix + "ConsumerCount", this.ConsumerCount);
        this.setParamSimple(map, prefix + "LastConfirmedEntry", this.LastConfirmedEntry);
        this.setParamSimple(map, prefix + "LastLedgerCreatedTimestamp", this.LastLedgerCreatedTimestamp);
        this.setParamSimple(map, prefix + "MsgRateIn", this.MsgRateIn);
        this.setParamSimple(map, prefix + "MsgRateOut", this.MsgRateOut);
        this.setParamSimple(map, prefix + "MsgThroughputIn", this.MsgThroughputIn);
        this.setParamSimple(map, prefix + "MsgThroughputOut", this.MsgThroughputOut);
        this.setParamSimple(map, prefix + "NumberOfEntries", this.NumberOfEntries);
        this.setParamSimple(map, prefix + "Partitions", this.Partitions);
        this.setParamSimple(map, prefix + "ProducerCount", this.ProducerCount);
        this.setParamSimple(map, prefix + "TotalSize", this.TotalSize);
        this.setParamSimple(map, prefix + "TopicType", this.TopicType);

    }
}

