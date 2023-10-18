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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MediaSnapshotByTimeOffsetInfo extends AbstractModel {

    /**
    * Information set of time point screenshots with a specified specification. Currently, there can be only one set of screenshots for each specification.
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("SnapshotByTimeOffsetSet")
    @Expose
    private MediaSnapshotByTimeOffsetItem [] SnapshotByTimeOffsetSet;

    /**
     * Get Information set of time point screenshots with a specified specification. Currently, there can be only one set of screenshots for each specification.
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return SnapshotByTimeOffsetSet Information set of time point screenshots with a specified specification. Currently, there can be only one set of screenshots for each specification.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public MediaSnapshotByTimeOffsetItem [] getSnapshotByTimeOffsetSet() {
        return this.SnapshotByTimeOffsetSet;
    }

    /**
     * Set Information set of time point screenshots with a specified specification. Currently, there can be only one set of screenshots for each specification.
Note: this field may return null, indicating that no valid values can be obtained.
     * @param SnapshotByTimeOffsetSet Information set of time point screenshots with a specified specification. Currently, there can be only one set of screenshots for each specification.
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setSnapshotByTimeOffsetSet(MediaSnapshotByTimeOffsetItem [] SnapshotByTimeOffsetSet) {
        this.SnapshotByTimeOffsetSet = SnapshotByTimeOffsetSet;
    }

    public MediaSnapshotByTimeOffsetInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public MediaSnapshotByTimeOffsetInfo(MediaSnapshotByTimeOffsetInfo source) {
        if (source.SnapshotByTimeOffsetSet != null) {
            this.SnapshotByTimeOffsetSet = new MediaSnapshotByTimeOffsetItem[source.SnapshotByTimeOffsetSet.length];
            for (int i = 0; i < source.SnapshotByTimeOffsetSet.length; i++) {
                this.SnapshotByTimeOffsetSet[i] = new MediaSnapshotByTimeOffsetItem(source.SnapshotByTimeOffsetSet[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "SnapshotByTimeOffsetSet.", this.SnapshotByTimeOffsetSet);

    }
}

