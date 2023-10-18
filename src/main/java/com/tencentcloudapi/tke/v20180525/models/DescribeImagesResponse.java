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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeImagesResponse extends AbstractModel {

    /**
    * Number of images
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("TotalCount")
    @Expose
    private Long TotalCount;

    /**
    * Image information list
Note: this field may return null, indicating that no valid values can be obtained.
    */
    @SerializedName("ImageInstanceSet")
    @Expose
    private ImageInstance [] ImageInstanceSet;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Number of images
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return TotalCount Number of images
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public Long getTotalCount() {
        return this.TotalCount;
    }

    /**
     * Set Number of images
Note: this field may return null, indicating that no valid values can be obtained.
     * @param TotalCount Number of images
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setTotalCount(Long TotalCount) {
        this.TotalCount = TotalCount;
    }

    /**
     * Get Image information list
Note: this field may return null, indicating that no valid values can be obtained. 
     * @return ImageInstanceSet Image information list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public ImageInstance [] getImageInstanceSet() {
        return this.ImageInstanceSet;
    }

    /**
     * Set Image information list
Note: this field may return null, indicating that no valid values can be obtained.
     * @param ImageInstanceSet Image information list
Note: this field may return null, indicating that no valid values can be obtained.
     */
    public void setImageInstanceSet(ImageInstance [] ImageInstanceSet) {
        this.ImageInstanceSet = ImageInstanceSet;
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

    public DescribeImagesResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeImagesResponse(DescribeImagesResponse source) {
        if (source.TotalCount != null) {
            this.TotalCount = new Long(source.TotalCount);
        }
        if (source.ImageInstanceSet != null) {
            this.ImageInstanceSet = new ImageInstance[source.ImageInstanceSet.length];
            for (int i = 0; i < source.ImageInstanceSet.length; i++) {
                this.ImageInstanceSet[i] = new ImageInstance(source.ImageInstanceSet[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TotalCount", this.TotalCount);
        this.setParamArrayObj(map, prefix + "ImageInstanceSet.", this.ImageInstanceSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

