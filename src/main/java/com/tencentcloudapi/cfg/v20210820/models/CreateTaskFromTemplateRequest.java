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
package com.tencentcloudapi.cfg.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateTaskFromTemplateRequest extends AbstractModel {

    /**
    * Template ID retrieved from the template library
    */
    @SerializedName("TemplateId")
    @Expose
    private Long TemplateId;

    /**
    * Experiment configuration parameters
    */
    @SerializedName("TaskConfig")
    @Expose
    private TaskConfig TaskConfig;

    /**
     * Get Template ID retrieved from the template library 
     * @return TemplateId Template ID retrieved from the template library
     */
    public Long getTemplateId() {
        return this.TemplateId;
    }

    /**
     * Set Template ID retrieved from the template library
     * @param TemplateId Template ID retrieved from the template library
     */
    public void setTemplateId(Long TemplateId) {
        this.TemplateId = TemplateId;
    }

    /**
     * Get Experiment configuration parameters 
     * @return TaskConfig Experiment configuration parameters
     */
    public TaskConfig getTaskConfig() {
        return this.TaskConfig;
    }

    /**
     * Set Experiment configuration parameters
     * @param TaskConfig Experiment configuration parameters
     */
    public void setTaskConfig(TaskConfig TaskConfig) {
        this.TaskConfig = TaskConfig;
    }

    public CreateTaskFromTemplateRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateTaskFromTemplateRequest(CreateTaskFromTemplateRequest source) {
        if (source.TemplateId != null) {
            this.TemplateId = new Long(source.TemplateId);
        }
        if (source.TaskConfig != null) {
            this.TaskConfig = new TaskConfig(source.TaskConfig);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TemplateId", this.TemplateId);
        this.setParamObj(map, prefix + "TaskConfig.", this.TaskConfig);

    }
}
