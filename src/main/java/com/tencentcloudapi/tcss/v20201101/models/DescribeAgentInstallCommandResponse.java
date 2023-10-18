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
package com.tencentcloudapi.tcss.v20201101.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentInstallCommandResponse extends AbstractModel {

    /**
    * Linux installation command
    */
    @SerializedName("LinuxCommand")
    @Expose
    private String LinuxCommand;

    /**
    * Windows installation command (Windows 2008 or later)
    */
    @SerializedName("WindowsCommand")
    @Expose
    private String WindowsCommand;

    /**
    * Step 1 in the Window installation command (Windows 2003)
    */
    @SerializedName("WindowsStepOne")
    @Expose
    private String WindowsStepOne;

    /**
    * Step 2 in the Window installation command (Windows 2003)
    */
    @SerializedName("WindowsStepTwo")
    @Expose
    private String WindowsStepTwo;

    /**
    * Download URL of the agent for Windows
    */
    @SerializedName("WindowsDownloadUrl")
    @Expose
    private String WindowsDownloadUrl;

    /**
    * The unique request ID, which is returned for each request. RequestId is required for locating a problem.
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get Linux installation command 
     * @return LinuxCommand Linux installation command
     */
    public String getLinuxCommand() {
        return this.LinuxCommand;
    }

    /**
     * Set Linux installation command
     * @param LinuxCommand Linux installation command
     */
    public void setLinuxCommand(String LinuxCommand) {
        this.LinuxCommand = LinuxCommand;
    }

    /**
     * Get Windows installation command (Windows 2008 or later) 
     * @return WindowsCommand Windows installation command (Windows 2008 or later)
     */
    public String getWindowsCommand() {
        return this.WindowsCommand;
    }

    /**
     * Set Windows installation command (Windows 2008 or later)
     * @param WindowsCommand Windows installation command (Windows 2008 or later)
     */
    public void setWindowsCommand(String WindowsCommand) {
        this.WindowsCommand = WindowsCommand;
    }

    /**
     * Get Step 1 in the Window installation command (Windows 2003) 
     * @return WindowsStepOne Step 1 in the Window installation command (Windows 2003)
     */
    public String getWindowsStepOne() {
        return this.WindowsStepOne;
    }

    /**
     * Set Step 1 in the Window installation command (Windows 2003)
     * @param WindowsStepOne Step 1 in the Window installation command (Windows 2003)
     */
    public void setWindowsStepOne(String WindowsStepOne) {
        this.WindowsStepOne = WindowsStepOne;
    }

    /**
     * Get Step 2 in the Window installation command (Windows 2003) 
     * @return WindowsStepTwo Step 2 in the Window installation command (Windows 2003)
     */
    public String getWindowsStepTwo() {
        return this.WindowsStepTwo;
    }

    /**
     * Set Step 2 in the Window installation command (Windows 2003)
     * @param WindowsStepTwo Step 2 in the Window installation command (Windows 2003)
     */
    public void setWindowsStepTwo(String WindowsStepTwo) {
        this.WindowsStepTwo = WindowsStepTwo;
    }

    /**
     * Get Download URL of the agent for Windows 
     * @return WindowsDownloadUrl Download URL of the agent for Windows
     */
    public String getWindowsDownloadUrl() {
        return this.WindowsDownloadUrl;
    }

    /**
     * Set Download URL of the agent for Windows
     * @param WindowsDownloadUrl Download URL of the agent for Windows
     */
    public void setWindowsDownloadUrl(String WindowsDownloadUrl) {
        this.WindowsDownloadUrl = WindowsDownloadUrl;
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

    public DescribeAgentInstallCommandResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeAgentInstallCommandResponse(DescribeAgentInstallCommandResponse source) {
        if (source.LinuxCommand != null) {
            this.LinuxCommand = new String(source.LinuxCommand);
        }
        if (source.WindowsCommand != null) {
            this.WindowsCommand = new String(source.WindowsCommand);
        }
        if (source.WindowsStepOne != null) {
            this.WindowsStepOne = new String(source.WindowsStepOne);
        }
        if (source.WindowsStepTwo != null) {
            this.WindowsStepTwo = new String(source.WindowsStepTwo);
        }
        if (source.WindowsDownloadUrl != null) {
            this.WindowsDownloadUrl = new String(source.WindowsDownloadUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "LinuxCommand", this.LinuxCommand);
        this.setParamSimple(map, prefix + "WindowsCommand", this.WindowsCommand);
        this.setParamSimple(map, prefix + "WindowsStepOne", this.WindowsStepOne);
        this.setParamSimple(map, prefix + "WindowsStepTwo", this.WindowsStepTwo);
        this.setParamSimple(map, prefix + "WindowsDownloadUrl", this.WindowsDownloadUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

