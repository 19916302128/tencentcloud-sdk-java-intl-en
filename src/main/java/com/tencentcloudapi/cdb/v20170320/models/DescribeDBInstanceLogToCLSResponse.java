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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBInstanceLogToCLSResponse extends AbstractModel {

    /**
    * Configurations of sending error logs to CLS.
Note: The return value may be null, indicating that no valid data can be obtained.
    */
    @SerializedName("ErrorLog")
    @Expose
    private LogToCLSConfig ErrorLog;

    /**
    * Configurations of sending slow logs to CLS.
Note: The return value may be null, indicating that no valid data can be obtained.
    */
    @SerializedName("SlowLog")
    @Expose
    private LogToCLSConfig SlowLog;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Configurations of sending error logs to CLS.
Note: The return value may be null, indicating that no valid data can be obtained. 
     * @return ErrorLog Configurations of sending error logs to CLS.
Note: The return value may be null, indicating that no valid data can be obtained.
     */
    public LogToCLSConfig getErrorLog() {
        return this.ErrorLog;
    }

    /**
     * Set Configurations of sending error logs to CLS.
Note: The return value may be null, indicating that no valid data can be obtained.
     * @param ErrorLog Configurations of sending error logs to CLS.
Note: The return value may be null, indicating that no valid data can be obtained.
     */
    public void setErrorLog(LogToCLSConfig ErrorLog) {
        this.ErrorLog = ErrorLog;
    }

    /**
     * Get Configurations of sending slow logs to CLS.
Note: The return value may be null, indicating that no valid data can be obtained. 
     * @return SlowLog Configurations of sending slow logs to CLS.
Note: The return value may be null, indicating that no valid data can be obtained.
     */
    public LogToCLSConfig getSlowLog() {
        return this.SlowLog;
    }

    /**
     * Set Configurations of sending slow logs to CLS.
Note: The return value may be null, indicating that no valid data can be obtained.
     * @param SlowLog Configurations of sending slow logs to CLS.
Note: The return value may be null, indicating that no valid data can be obtained.
     */
    public void setSlowLog(LogToCLSConfig SlowLog) {
        this.SlowLog = SlowLog;
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

    public DescribeDBInstanceLogToCLSResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDBInstanceLogToCLSResponse(DescribeDBInstanceLogToCLSResponse source) {
        if (source.ErrorLog != null) {
            this.ErrorLog = new LogToCLSConfig(source.ErrorLog);
        }
        if (source.SlowLog != null) {
            this.SlowLog = new LogToCLSConfig(source.SlowLog);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "ErrorLog.", this.ErrorLog);
        this.setParamObj(map, prefix + "SlowLog.", this.SlowLog);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

