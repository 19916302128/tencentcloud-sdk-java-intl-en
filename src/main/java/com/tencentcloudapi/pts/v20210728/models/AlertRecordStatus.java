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
package com.tencentcloudapi.pts.v20210728.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AlertRecordStatus extends AbstractModel {

    /**
    * Success or failure of stopping performance test job.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("AbortJob")
    @Expose
    private Long AbortJob;

    /**
    * Success or failure of sending alert notification.

Note: This field may return null, indicating that no valid value is found.
    */
    @SerializedName("SendNotice")
    @Expose
    private Long SendNotice;

    /**
     * Get Success or failure of stopping performance test job.

Note: This field may return null, indicating that no valid value is found. 
     * @return AbortJob Success or failure of stopping performance test job.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getAbortJob() {
        return this.AbortJob;
    }

    /**
     * Set Success or failure of stopping performance test job.

Note: This field may return null, indicating that no valid value is found.
     * @param AbortJob Success or failure of stopping performance test job.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setAbortJob(Long AbortJob) {
        this.AbortJob = AbortJob;
    }

    /**
     * Get Success or failure of sending alert notification.

Note: This field may return null, indicating that no valid value is found. 
     * @return SendNotice Success or failure of sending alert notification.

Note: This field may return null, indicating that no valid value is found.
     */
    public Long getSendNotice() {
        return this.SendNotice;
    }

    /**
     * Set Success or failure of sending alert notification.

Note: This field may return null, indicating that no valid value is found.
     * @param SendNotice Success or failure of sending alert notification.

Note: This field may return null, indicating that no valid value is found.
     */
    public void setSendNotice(Long SendNotice) {
        this.SendNotice = SendNotice;
    }

    public AlertRecordStatus() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AlertRecordStatus(AlertRecordStatus source) {
        if (source.AbortJob != null) {
            this.AbortJob = new Long(source.AbortJob);
        }
        if (source.SendNotice != null) {
            this.SendNotice = new Long(source.SendNotice);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AbortJob", this.AbortJob);
        this.setParamSimple(map, prefix + "SendNotice", this.SendNotice);

    }
}

