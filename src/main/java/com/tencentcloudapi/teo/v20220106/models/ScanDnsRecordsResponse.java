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
package com.tencentcloudapi.teo.v20220106.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ScanDnsRecordsResponse extends AbstractModel{

    /**
    * Scan status
- `doing`: Scanning
- `done`: Scanned
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * Number of DNS records added after scanning
    */
    @SerializedName("RecordsAdded")
    @Expose
    private Long RecordsAdded;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Scan status
- `doing`: Scanning
- `done`: Scanned 
     * @return Status Scan status
- `doing`: Scanning
- `done`: Scanned
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set Scan status
- `doing`: Scanning
- `done`: Scanned
     * @param Status Scan status
- `doing`: Scanning
- `done`: Scanned
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get Number of DNS records added after scanning 
     * @return RecordsAdded Number of DNS records added after scanning
     */
    public Long getRecordsAdded() {
        return this.RecordsAdded;
    }

    /**
     * Set Number of DNS records added after scanning
     * @param RecordsAdded Number of DNS records added after scanning
     */
    public void setRecordsAdded(Long RecordsAdded) {
        this.RecordsAdded = RecordsAdded;
    }

    /**
     * Get The unique request ID, which is returned for each request. RequestId is required for locating a problem. 
     * @return RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     * @param RequestId The unique request ID, which is returned for each request. RequestId is required for locating a problem.
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public ScanDnsRecordsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ScanDnsRecordsResponse(ScanDnsRecordsResponse source) {
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.RecordsAdded != null) {
            this.RecordsAdded = new Long(source.RecordsAdded);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "RecordsAdded", this.RecordsAdded);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

