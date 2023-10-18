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
package com.tencentcloudapi.vpc.v20170312;

import java.lang.reflect.Type;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;
import com.tencentcloudapi.common.exception.TencentCloudSDKException;
import com.tencentcloudapi.common.AbstractClient;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.JsonResponseModel;
import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.vpc.v20170312.models.*;

public class VpcClient extends AbstractClient{
    private static String endpoint = "vpc.tencentcloudapi.com";
    private static String service = "vpc";
    private static String version = "2017-03-12";
    
    public VpcClient(Credential credential, String region) {
        this(credential, region, new ClientProfile());
    }

    public VpcClient(Credential credential, String region, ClientProfile profile) {
        super(VpcClient.endpoint, VpcClient.version, credential, region, profile);
    }

    /**
     *This API (AcceptAttachCcnInstances) is used to associate instances across accounts. Cloud Connect Network (CCN) owners accept and agree to the operations.
     * @param req AcceptAttachCcnInstancesRequest
     * @return AcceptAttachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AcceptAttachCcnInstancesResponse AcceptAttachCcnInstances(AcceptAttachCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AcceptAttachCcnInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AcceptAttachCcnInstances", AcceptAttachCcnInstancesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add resources to a bandwidth package, including [Elastic IP](https://intl.cloud.tencent.com/document/product/213/1941?from_cn_redirect=1), [Cloud Load Balancer](https://intl.cloud.tencent.com/document/product/214/517?from_cn_redirect=1), and so on.
     * @param req AddBandwidthPackageResourcesRequest
     * @return AddBandwidthPackageResourcesResponse
     * @throws TencentCloudSDKException
     */
    public AddBandwidthPackageResourcesResponse AddBandwidthPackageResources(AddBandwidthPackageResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AddBandwidthPackageResourcesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AddBandwidthPackageResources", AddBandwidthPackageResourcesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to change the public IP of a CVM or the EIP of the associated bandwidth package.
     * @param req AdjustPublicAddressRequest
     * @return AdjustPublicAddressResponse
     * @throws TencentCloudSDKException
     */
    public AdjustPublicAddressResponse AdjustPublicAddress(AdjustPublicAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AdjustPublicAddressResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AdjustPublicAddress", AdjustPublicAddressResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to apply for one or more [Elastic IP Addresses](https://intl.cloud.tencent.com/document/product/213/1941?from_cn_redirect=1) (EIPs for short).
* An EIP is a static IP address that is dedicated for dynamic cloud computing. You can quickly re-map an EIP to another instance under your account to protect against instance failures.
* Your EIP is associated with your Tencent Cloud account rather than an instance. It remains associated with your Tencent Cloud account until you choose to explicitly release it or your account is in arrears for more than 24 hours.
* The maximum number of EIPs that can be applied for a Tencent Cloud account in each region is restricted. For more information, see [EIP Product Introduction](https://intl.cloud.tencent.com/document/product/213/5733?from_cn_redirect=1). You can get the quota information through the DescribeAddressQuota API.
     * @param req AllocateAddressesRequest
     * @return AllocateAddressesResponse
     * @throws TencentCloudSDKException
     */
    public AllocateAddressesResponse AllocateAddresses(AllocateAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AllocateAddressesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AllocateAddresses", AllocateAddressesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to apply for an IPv6 address for the ENI. <br />
This API is completed asynchronously. If you need to query the execution result of an async task, please use the `RequestId` returned by this API to poll the `DescribeVpcTaskResult` API.
* The number of IPs bound with an ENI is limited. For more information, see <a href="/document/product/576/18527">ENI Use Limits</a>.
* You can apply for a specified IPv6 address. Currently, the IPv6 address can only be used as a secondary IP, instead of the primary IP.
* The address must be an idle IP in the subnet to which the ENI belongs.
* When applying for one or more secondary IPv6 addresses for an ENI, the API will return the specified number of secondary IPv6 addresses in the subnet range where the ENI is located.
     * @param req AssignIpv6AddressesRequest
     * @return AssignIpv6AddressesResponse
     * @throws TencentCloudSDKException
     */
    public AssignIpv6AddressesResponse AssignIpv6Addresses(AssignIpv6AddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssignIpv6AddressesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AssignIpv6Addresses", AssignIpv6AddressesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to assign IPv6 ranges.
* To use this API, you must already have a VPC instance. If you do not have a VPC instance yet, use the <a href="https://intl.cloud.tencent.com/document/api/215/15774?from_cn_redirect=1" title="CreateVpc" target="_blank">CreateVpc</a> API to create one.
* Each VPC can apply for only one IPv6 range.
     * @param req AssignIpv6CidrBlockRequest
     * @return AssignIpv6CidrBlockResponse
     * @throws TencentCloudSDKException
     */
    public AssignIpv6CidrBlockResponse AssignIpv6CidrBlock(AssignIpv6CidrBlockRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssignIpv6CidrBlockResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AssignIpv6CidrBlock", AssignIpv6CidrBlockResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (AssignIpv6SubnetCidrBlock) is used to assign IPv6 subnet IP ranges.
* To assign an `IPv6` IP range to a subnet, the `VPC` that the subnet belongs to should have obtained the `IPv6` IP range. If this has not been assigned, use the `AssignIpv6CidrBlock` API to assign an `IPv6` IP range to the `VPC` to which the subnet belongs. Otherwise, the `IPv6` subnet IP range cannot be assigned.
* Each subnet can only be assigned one IPv6 IP range.
     * @param req AssignIpv6SubnetCidrBlockRequest
     * @return AssignIpv6SubnetCidrBlockResponse
     * @throws TencentCloudSDKException
     */
    public AssignIpv6SubnetCidrBlockResponse AssignIpv6SubnetCidrBlock(AssignIpv6SubnetCidrBlockRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssignIpv6SubnetCidrBlockResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AssignIpv6SubnetCidrBlock", AssignIpv6SubnetCidrBlockResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to apply for private IPs for an ENI.
* An ENI can only be bound with a limited number of IP addresses. For more information about resource limits, see <a href="/document/product/576/18527">ENI Use Limits</a>.
* You can apply for a specified private IP. It cannot be a primary IP because the primary IP already exists and cannot be modified. The private IP address must be an idle IP in the subnet to which the ENI belongs.
* You can apply for more than one secondary private IP on the ENI. The API will return the specified number of secondary private IPs in the subnet IP range.
>?This API is async. You can call the [`DescribeVpcTaskResult`](https://intl.cloud.tencent.com/document/api/215/59037?from_cn_redirect=1) API to query the task result. When the task is completed, you can continue other tasks.
>
     * @param req AssignPrivateIpAddressesRequest
     * @return AssignPrivateIpAddressesResponse
     * @throws TencentCloudSDKException
     */
    public AssignPrivateIpAddressesResponse AssignPrivateIpAddresses(AssignPrivateIpAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssignPrivateIpAddressesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AssignPrivateIpAddresses", AssignPrivateIpAddressesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to bind an [Elastic IP](https://intl.cloud.tencent.com/document/product/213/1941?from_cn_redirect=1) (EIP for short) to the specified private IP of an instance or ENI.
* Binding an EIP to a CVM instance is actually binding the EIP to the primary private IP of the primary ENI on the CVM instance.
* When an EIP is bound, the public IP previously bound to the CVM instance will be unbound and released automatically.
* To bind another EIP to the private IP of the specified ENI, you must first unbind the EIP.
* To bind an EIP to a NAT Gateway, use the API [AssociateNatGatewayAddress](https://intl.cloud.tencent.com/document/product/215/36722?from_cn_redirect=1).
* An EIP cannot be bound if it’s overdue or blocked
* Only EIP in the `UNBIND` status can be bound.
     * @param req AssociateAddressRequest
     * @return AssociateAddressResponse
     * @throws TencentCloudSDKException
     */
    public AssociateAddressResponse AssociateAddress(AssociateAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateAddressResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AssociateAddress", AssociateAddressResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to bind a direct connect gateway with a NAT gateway,  and direct its default route to the NAT Gateway.
     * @param req AssociateDirectConnectGatewayNatGatewayRequest
     * @return AssociateDirectConnectGatewayNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public AssociateDirectConnectGatewayNatGatewayResponse AssociateDirectConnectGatewayNatGateway(AssociateDirectConnectGatewayNatGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateDirectConnectGatewayNatGatewayResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AssociateDirectConnectGatewayNatGateway", AssociateDirectConnectGatewayNatGatewayResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to bind an EIP to a NAT gateway.
     * @param req AssociateNatGatewayAddressRequest
     * @return AssociateNatGatewayAddressResponse
     * @throws TencentCloudSDKException
     */
    public AssociateNatGatewayAddressResponse AssociateNatGatewayAddress(AssociateNatGatewayAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateNatGatewayAddressResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AssociateNatGatewayAddress", AssociateNatGatewayAddressResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to associate a network ACL with subnets in a VPC instance.
     * @param req AssociateNetworkAclSubnetsRequest
     * @return AssociateNetworkAclSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateNetworkAclSubnetsResponse AssociateNetworkAclSubnets(AssociateNetworkAclSubnetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateNetworkAclSubnetsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AssociateNetworkAclSubnets", AssociateNetworkAclSubnetsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (AssociateNetworkInterfaceSecurityGroups) is used to attach a security group to an ENI.
     * @param req AssociateNetworkInterfaceSecurityGroupsRequest
     * @return AssociateNetworkInterfaceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public AssociateNetworkInterfaceSecurityGroupsResponse AssociateNetworkInterfaceSecurityGroups(AssociateNetworkInterfaceSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AssociateNetworkInterfaceSecurityGroupsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AssociateNetworkInterfaceSecurityGroups", AssociateNetworkInterfaceSecurityGroupsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add a network instance to a CCN instance. Network instances include VPCs and Direct Connect gateways. <br />
The number of network instances that each CCN can be associated with is limited. For more information, see the product documentation. If you need to associate more instances, please submit a ticket.
     * @param req AttachCcnInstancesRequest
     * @return AttachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AttachCcnInstancesResponse AttachCcnInstances(AttachCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachCcnInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AttachCcnInstances", AttachCcnInstancesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a Classiclink between a VPC instance and a classic network device.
* The VPC instance and the classic network device must be in the same region.
* For differences between VPC and the classic network, see <a href="https://intl.cloud.tencent.com/document/product/215/30720?from_cn_redirect=1">VPC and Classic Network</a>.
>?This API is async. You can call the [`DescribeVpcTaskResult`](https://intl.cloud.tencent.com/document/api/215/59037?from_cn_redirect=1) API to query the task result. When the task is completed, you can continue other tasks.
>
     * @param req AttachClassicLinkVpcRequest
     * @return AttachClassicLinkVpcResponse
     * @throws TencentCloudSDKException
     */
    public AttachClassicLinkVpcResponse AttachClassicLinkVpc(AttachClassicLinkVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachClassicLinkVpcResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AttachClassicLinkVpc", AttachClassicLinkVpcResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to bind an ENI to a CVM.
* An ENI must be bound with one security group at least. To bind it, see <a href="https://intl.cloud.tencent.com/document/product/215/43132?from_cn_redirect=1">AssociateNetworkInterfaceSecurityGroups</a>.
* One CVM can be bound with multiple ENIs, but only one can be the primary ENI. For more information about the limits, see <a href="https://intl.cloud.tencent.com/document/product/576/18527?from_cn_redirect=1">ENI Use Limits</a>.
* An ENI can only be bound to one CVM.
* Only the running or shutdown CVMs can be bound with ENIs. For more information about the CVM status, see <a href="https://intl.cloud.tencent.com/document/api/213/9452?from_cn_redirect=1#InstanceStatus">InstanceStatus</a> in the Data Types.
* An ENI can only be bound to a VPC-based CVM under the same availability zone as the ENI subnet.

This API is completed asynchronously. If you need to query the execution result of an async task, please use the `RequestId` returned by this API to poll the `DescribeVpcTaskResult` API.
     * @param req AttachNetworkInterfaceRequest
     * @return AttachNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public AttachNetworkInterfaceResponse AttachNetworkInterface(AttachNetworkInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachNetworkInterfaceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AttachNetworkInterface", AttachNetworkInterfaceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to associate a snapshot policy with specified instances.
     * @param req AttachSnapshotInstancesRequest
     * @return AttachSnapshotInstancesResponse
     * @throws TencentCloudSDKException
     */
    public AttachSnapshotInstancesResponse AttachSnapshotInstances(AttachSnapshotInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AttachSnapshotInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AttachSnapshotInstances", AttachSnapshotInstancesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used by the service provider to perform a compliance audit.
* This API is only provided for service providers to audit compliance review requests received. Tencent Cloud will verify the identity of the service provider by the `APPID`. 
* The status of the review request can be changed between `APPROVED` and `DENY`.
     * @param req AuditCrossBorderComplianceRequest
     * @return AuditCrossBorderComplianceResponse
     * @throws TencentCloudSDKException
     */
    public AuditCrossBorderComplianceResponse AuditCrossBorderCompliance(AuditCrossBorderComplianceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<AuditCrossBorderComplianceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "AuditCrossBorderCompliance", AuditCrossBorderComplianceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to check whether the secondary CIDR block conflicts with existing routes, peering connections (peer VPC CIDR blocks), and other resources. 
* Check whether the secondary CIDR block overlaps with the primary/secondary CIDR block of the current VPC.
* Check whether the secondary CIDR block overlaps with the routing destination of the current VPC.
* If the current VPC is used in a peering connection, check whether the secondary CIDR block overlaps with the primary/secondary CIDR block of the peer VPC.
     * @param req CheckAssistantCidrRequest
     * @return CheckAssistantCidrResponse
     * @throws TencentCloudSDKException
     */
    public CheckAssistantCidrResponse CheckAssistantCidr(CheckAssistantCidrRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckAssistantCidrResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CheckAssistantCidr", CheckAssistantCidrResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to verify the network detection status.
     * @param req CheckNetDetectStateRequest
     * @return CheckNetDetectStateResponse
     * @throws TencentCloudSDKException
     */
    public CheckNetDetectStateResponse CheckNetDetectState(CheckNetDetectStateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CheckNetDetectStateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CheckNetDetectState", CheckNetDetectStateResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a security group with the same rule configurations as an existing security group. The cloning only copies the security group and its rules, but not the security group tags.
     * @param req CloneSecurityGroupRequest
     * @return CloneSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public CloneSecurityGroupResponse CloneSecurityGroup(CloneSecurityGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CloneSecurityGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CloneSecurityGroup", CloneSecurityGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an IP address template.
     * @param req CreateAddressTemplateRequest
     * @return CreateAddressTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateAddressTemplateResponse CreateAddressTemplate(CreateAddressTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAddressTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateAddressTemplate", CreateAddressTemplateResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an IP address template group.
     * @param req CreateAddressTemplateGroupRequest
     * @return CreateAddressTemplateGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateAddressTemplateGroupResponse CreateAddressTemplateGroup(CreateAddressTemplateGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAddressTemplateGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateAddressTemplateGroup", CreateAddressTemplateGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an ENI and bind it to a CVM.
* You can specify private IP addresses and a primary IP when creating an ENI. The specified private IP must be idle and in the same subnet as the ENI.
* When creating an ENI, you can specify the number of private IPs that you want to apply for. The system will randomly generate private IP addresses.
* The number of IPs bound with an ENI is limited. For more information, see <a href="/document/product/576/18527">ENI Use Limits</a>.
* You can bind an existing security group when creating an ENI.
* You can bind a tag when creating an ENI. The tag list in the response indicates the tags that have been successfully added.
>?This API is async. You can call the [`DescribeVpcTaskResult`](https://intl.cloud.tencent.com/document/api/215/59037?from_cn_redirect=1) API to query the task result. When the task is completed, you can continue other tasks.
>
     * @param req CreateAndAttachNetworkInterfaceRequest
     * @return CreateAndAttachNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateAndAttachNetworkInterfaceResponse CreateAndAttachNetworkInterface(CreateAndAttachNetworkInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAndAttachNetworkInterfaceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateAndAttachNetworkInterface", CreateAndAttachNetworkInterfaceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to batch create secondary CIDR blocks.
     * @param req CreateAssistantCidrRequest
     * @return CreateAssistantCidrResponse
     * @throws TencentCloudSDKException
     */
    public CreateAssistantCidrResponse CreateAssistantCidr(CreateAssistantCidrRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateAssistantCidrResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateAssistantCidr", CreateAssistantCidrResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a [device bandwidth package](https://intl.cloud.tencent.com/document/product/684/15245?from_cn_redirect=1#bwptype) or an [IP bandwidth package](https://intl.cloud.tencent.com/document/product/684/15245?from_cn_redirect=1#bwptype).
     * @param req CreateBandwidthPackageRequest
     * @return CreateBandwidthPackageResponse
     * @throws TencentCloudSDKException
     */
    public CreateBandwidthPackageResponse CreateBandwidthPackage(CreateBandwidthPackageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateBandwidthPackageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateBandwidthPackage", CreateBandwidthPackageResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a CCN instance.
* You can add tags to a CCN instance upon the creation. The tags are added successfully if they are listed in the response.
* There is a quota of CCN instances for each account. For more information, see product documentation. To increase the quota, please submit a ticket.
     * @param req CreateCcnRequest
     * @return CreateCcnResponse
     * @throws TencentCloudSDKException
     */
    public CreateCcnResponse CreateCcn(CreateCcnRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCcnResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateCcn", CreateCcnResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (CreateCustomerGateway) is used to create customer gateways.
     * @param req CreateCustomerGatewayRequest
     * @return CreateCustomerGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateCustomerGatewayResponse CreateCustomerGateway(CreateCustomerGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateCustomerGatewayResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateCustomerGateway", CreateCustomerGatewayResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a VPC with default settings.

To create a VPC with custom settings, such as VPC name, IP range, subnet IP range, and subnet availability zone, use `CreateVpc` instead.

This API may not create a default VPC. It depends on the network attributes (`DescribeAccountAttributes`) of your account.
* If both basic network and VPC are supported, the returned `VpcId` is 0.
* If only VPC is supported, the default VPC information is returned.

You can also use the `Force` parameter to forcibly return a default VPC.
     * @param req CreateDefaultVpcRequest
     * @return CreateDefaultVpcResponse
     * @throws TencentCloudSDKException
     */
    public CreateDefaultVpcResponse CreateDefaultVpc(CreateDefaultVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDefaultVpcResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateDefaultVpc", CreateDefaultVpcResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a direct connect gateway.
     * @param req CreateDirectConnectGatewayRequest
     * @return CreateDirectConnectGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateDirectConnectGatewayResponse CreateDirectConnectGateway(CreateDirectConnectGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDirectConnectGatewayResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateDirectConnectGateway", CreateDirectConnectGatewayResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (CreateDirectConnectGatewayCcnRoutes) is used to create the CCN route (IDC IP range) of a Direct Connect gateway.
     * @param req CreateDirectConnectGatewayCcnRoutesRequest
     * @return CreateDirectConnectGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public CreateDirectConnectGatewayCcnRoutesResponse CreateDirectConnectGatewayCcnRoutes(CreateDirectConnectGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateDirectConnectGatewayCcnRoutesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateDirectConnectGatewayCcnRoutes", CreateDirectConnectGatewayCcnRoutesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a flow log.
     * @param req CreateFlowLogRequest
     * @return CreateFlowLogResponse
     * @throws TencentCloudSDKException
     */
    public CreateFlowLogResponse CreateFlowLog(CreateFlowLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateFlowLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateFlowLog", CreateFlowLogResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a highly available virtual IP (HAVIP).
     * @param req CreateHaVipRequest
     * @return CreateHaVipResponse
     * @throws TencentCloudSDKException
     */
    public CreateHaVipResponse CreateHaVip(CreateHaVipRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateHaVipResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateHaVip", CreateHaVipResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a local gateway for a CDC instance.
     * @param req CreateLocalGatewayRequest
     * @return CreateLocalGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateLocalGatewayResponse CreateLocalGateway(CreateLocalGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateLocalGatewayResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateLocalGateway", CreateLocalGatewayResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a NAT Gateway.
Before taking actions on a NAT gateway, ensure that it has been successfully created, namely, the `State` field in the response of the `DescribeNatGateway` API is `AVAILABLE`.
     * @param req CreateNatGatewayRequest
     * @return CreateNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateNatGatewayResponse CreateNatGateway(CreateNatGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNatGatewayResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateNatGateway", CreateNatGatewayResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create the port forwarding rules of a NAT gateway.
     * @param req CreateNatGatewayDestinationIpPortTranslationNatRuleRequest
     * @return CreateNatGatewayDestinationIpPortTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateNatGatewayDestinationIpPortTranslationNatRuleResponse CreateNatGatewayDestinationIpPortTranslationNatRule(CreateNatGatewayDestinationIpPortTranslationNatRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNatGatewayDestinationIpPortTranslationNatRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateNatGatewayDestinationIpPortTranslationNatRule", CreateNatGatewayDestinationIpPortTranslationNatRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create SNAT rules for a NAT gateway.
     * @param req CreateNatGatewaySourceIpTranslationNatRuleRequest
     * @return CreateNatGatewaySourceIpTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public CreateNatGatewaySourceIpTranslationNatRuleResponse CreateNatGatewaySourceIpTranslationNatRule(CreateNatGatewaySourceIpTranslationNatRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNatGatewaySourceIpTranslationNatRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateNatGatewaySourceIpTranslationNatRule", CreateNatGatewaySourceIpTranslationNatRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a network probe.
     * @param req CreateNetDetectRequest
     * @return CreateNetDetectResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetDetectResponse CreateNetDetect(CreateNetDetectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNetDetectResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateNetDetect", CreateNetDetectResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a <a href="https://intl.cloud.tencent.com/document/product/215/20088?from_cn_redirect=1">network ACL</a>.
* The inbound and outbound rules for a new network ACL are "Deny All" by default. You need to call `ModifyNetworkAclEntries` to set rules for the new network ACL as needed.
     * @param req CreateNetworkAclRequest
     * @return CreateNetworkAclResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetworkAclResponse CreateNetworkAcl(CreateNetworkAclRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNetworkAclResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateNetworkAcl", CreateNetworkAclResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to add one or more in/outbound rules of the network ACL quintuple.
     * @param req CreateNetworkAclQuintupleEntriesRequest
     * @return CreateNetworkAclQuintupleEntriesResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetworkAclQuintupleEntriesResponse CreateNetworkAclQuintupleEntries(CreateNetworkAclQuintupleEntriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNetworkAclQuintupleEntriesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateNetworkAclQuintupleEntries", CreateNetworkAclQuintupleEntriesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an ENI.
* You can specify private IP addresses and a primary IP when creating an ENI. The specified private IP must be in the same subnet as the ENI and is not occupied.
* When creating an ENI, you can specify the number of private IP addresses that you want to apply for. The system will randomly generate private IP addresses.
* An ENI can only be bound with a limited number of IP addresses. For more information about resource limits, see <a href="/document/product/576/18527">ENI Use Limits</a>.
* You can bind an existing security group when creating an ENI.
* You can bind a tag when creating an ENI. The tag list in the response indicates the tags that have been successfully added.
>?This API is async. You can call the [`DescribeVpcTaskResult`](https://intl.cloud.tencent.com/document/api/215/59037?from_cn_redirect=1) API to query the task result. When the task is completed, you can continue other tasks.
>
     * @param req CreateNetworkInterfaceRequest
     * @return CreateNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public CreateNetworkInterfaceResponse CreateNetworkInterface(CreateNetworkInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateNetworkInterfaceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateNetworkInterface", CreateNetworkInterfaceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a route table.
* After the VPC instance has been created, the system creates a default route table with which all newly created subnets will be associated. By default, you can use this route table to manage your routing policies. If you have multiple routing policies, you can call the API for creating route tables to create more route tables to manage these routing policies.
* You can bind a tag when creating a route table. The tag list in the response indicates the tags that have been successfully added.
     * @param req CreateRouteTableRequest
     * @return CreateRouteTableResponse
     * @throws TencentCloudSDKException
     */
    public CreateRouteTableResponse CreateRouteTable(CreateRouteTableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRouteTableResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateRouteTable", CreateRouteTableResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create routes. 
* You can batch add routes to a specified route table.
     * @param req CreateRoutesRequest
     * @return CreateRoutesResponse
     * @throws TencentCloudSDKException
     */
    public CreateRoutesResponse CreateRoutes(CreateRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateRoutesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateRoutes", CreateRoutesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a security group (SecurityGroup).
* Note the <a href="https://intl.cloud.tencent.com/document/product/213/12453?from_cn_redirect=1">maximum number of security groups</a> per project in each region under each account.
* Both the inbound and outbound rules for a newly created security group are "Deny All" by default. You need to call CreateSecurityGroupPolicies to set security group rules based on your needs.
* You can bind a tag when creating a security group. The tag list in the response indicates the tags that have been successfully added.
     * @param req CreateSecurityGroupRequest
     * @return CreateSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupResponse CreateSecurityGroup(CreateSecurityGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateSecurityGroup", CreateSecurityGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create security group policies (`SecurityGroupPolicy`).

For parameters of `SecurityGroupPolicySet`,
<ul>
<li>`Version`: The version number of a security group policy, which automatically increases by one each time you update the security policy, to prevent expiration of the updated routing policies. If it is left empty, any conflicts will be ignored.</li>
<li>When creating the `Egress` and `Ingress` polices,<ul>
<li>`Protocol`: Allows `TCP`, `UDP`, `ICMP`, `ICMPV6`, `GRE` and `ALL`.</li>
<li>`CidrBlock`: For the classic network, the `CidrBlock` can contain private IPs of Tencent Cloud resources that are not under your account. It does not mean that you can access these devices. The network isolation policies between tenants take priority over the private network policies in security groups.</li>
<li>`Ipv6CidrBlock`: For the classic network, `Ipv6CidrBlock` can contain private IPv6 addresses of Tencent Cloud resources that are not under your account. It does not mean that you can access these devices. The network isolation policies between tenants take priority over the private network policies in security groups.</li>
<li>`SecurityGroupId`: ID of the security group to create policies. </li>
<li>`Port`: A single port (“80”) or a port range ("8000-8010"). This parameter is only available when `Protocol` is `TCP` or `UDP`.</li>
<li>`Action`: `ACCEPT` or `DROP`.</li>
<li><code>CidrBlock</code>, <code>Ipv6CidrBlock</code>, <code>SecurityGroupId</code>, and <code>AddressTemplate</code> are mutually exclusive. <code>Protocol</code> + <code>Port</code> and <code>ServiceTemplate</code> are mutually exclusive. <code>IPv6CidrBlock</code> and <code>ICMP</code> are mutually exclusive; to use them, enter <code>ICMPV6</code>.</li>
<li>You can only create policies in one direction in each request. To specify the `PolicyIndex` parameter, use the same index number in policies. If you want to insert a rule before the first rule, enter 0; if you want to add a rule after the last rule, leave it empty.</li>
</ul></li></ul>
     * @param req CreateSecurityGroupPoliciesRequest
     * @return CreateSecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupPoliciesResponse CreateSecurityGroupPolicies(CreateSecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityGroupPoliciesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateSecurityGroupPolicies", CreateSecurityGroupPoliciesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create u200da security group, and add security group policies.
* For the the upper limit of security groups per project in each region under each account, <a href="https://intl.cloud.tencent.com/document/product/213/12453?from_cn_redirect=1">see here</a>
* u200dFor u200dnewly u200dcreated security groups, u200dthe inbound and outbound policies are set to `Deny All` by default. You need to call <a href="https://intl.cloud.tencent.com/document/product/215/15807?from_cn_redirect=1">CreateSecurityGroupPolicies</a>
to change it.

Description:
* `Version`: The version number of a security group policy. It automatically increments by 1 every time you update the security policy, so to prevent the expiration of the updated policies. If this field is left empty, any conflicts will be ignored.
* `Protocol`: Values can be `TCP`, `UDP`, `ICMP`, `ICMPV6`, `GRE`, and `ALL`.
* `CidrBlock`: Enter a CIDR block in the correct format. In the classic network, even if the CIDR block specified in u200d`CidrBlock` contains the Tencent Cloud private IPs not used for CVMs under your Tencent Cloud account, it does not mean this policy allows you to access those resources. The network isolation policies between tenants take priority over the private network policies in security groups.
* `Ipv6CidrBlock`: Enter an IPv6 CIDR block in the correct format. In the classic network, even if the CIDR block specified in `Ipv6CidrBlock` contains the Tencent Cloud private IPv6 addresses not used for CVMs under your Tencent Cloud account, it does not mean this policy allows you to access those resources. The network isolation policies between tenants take priority over the private network policies in security groups.
* `SecurityGroupId`: ID of the security group. It can be the ID of a security group to be modified, or the ID of another security group in the same project. All private IPs of all CVMs under the security group will be covered. If this field is used, the policy will automatically change according to the CVM associated with the group ID while being used to match network messages. You don't need to change it manually.
* `Port`: Enter a single port number (such as `80`), or a port range (such as `8000-8010`). `Port` is only applicable when `Protocol` is `TCP` or `UDP`. If `Protocol` is not `TCP` or `UDP`, `Protocol` and `Port` cannot be both specified. 
* `Action`: Values can be `ACCEPT` or `DROP`.
* `CidrBlock`, `Ipv6CidrBlock`, `SecurityGroupId`, and `AddressTemplate` are exclusive u200dto one another. “Protocol + Port” and `ServiceTemplate` are mutually exclusive.
* Only policies in one direction can be created in each request. If you need to specify the `PolicyIndex` parameter, the indexes of policies must be consistent.
     * @param req CreateSecurityGroupWithPoliciesRequest
     * @return CreateSecurityGroupWithPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public CreateSecurityGroupWithPoliciesResponse CreateSecurityGroupWithPolicies(CreateSecurityGroupWithPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSecurityGroupWithPoliciesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateSecurityGroupWithPolicies", CreateSecurityGroupWithPoliciesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (CreateServiceTemplate) is used to create a protocol port template.
     * @param req CreateServiceTemplateRequest
     * @return CreateServiceTemplateResponse
     * @throws TencentCloudSDKException
     */
    public CreateServiceTemplateResponse CreateServiceTemplate(CreateServiceTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateServiceTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateServiceTemplate", CreateServiceTemplateResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (CreateServiceTemplateGroup) is used to create a protocol port template group.
     * @param req CreateServiceTemplateGroupRequest
     * @return CreateServiceTemplateGroupResponse
     * @throws TencentCloudSDKException
     */
    public CreateServiceTemplateGroupResponse CreateServiceTemplateGroup(CreateServiceTemplateGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateServiceTemplateGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateServiceTemplateGroup", CreateServiceTemplateGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create snapshot policies.
     * @param req CreateSnapshotPoliciesRequest
     * @return CreateSnapshotPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public CreateSnapshotPoliciesResponse CreateSnapshotPolicies(CreateSnapshotPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSnapshotPoliciesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateSnapshotPolicies", CreateSnapshotPoliciesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a subnet.
* You must create a VPC instance before creating a subnet.
* After the subnet is successfully created, its IP address range cannot be modified. The subnet IP address range must fall within the VPC IP address range. They can be the same if the VPC instance has only one subnet. We recommend that you keep the subnet IP address range within the VPC IP address range to reserve IP address ranges for other subnets.
* The subnet mask of the smallest IP address range that can be created is 28 (16 IP addresses), and that of the largest IP address range is 16 (65,536 IP addresses).
* IP address ranges of different subnets cannot overlap with each other within the same VPC instance.
* A subnet is automatically associated with the default route table once created.
* You can bind a tag when creating a subnet. The tag list in the response indicates the tags that have been successfully added.
     * @param req CreateSubnetRequest
     * @return CreateSubnetResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubnetResponse CreateSubnet(CreateSubnetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSubnetResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateSubnet", CreateSubnetResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create subnets in batches.
* You must create a VPC instance before creating a subnet.
* After the subnet is successfully created, its IP address range cannot be modified. The subnet IP address range must fall within the VPC IP address range. They can be the same if the VPC has only one subnet. We recommend that you keep the subnet IP address range within the VPC IP address range to reserve IP address ranges for other subnets.
* The subnet mask of the smallest IP address range that can be created is 28 (16 IP addresses), and that of the largest IP address range is 16 (65,536 IP addresses).
* IP address ranges of different subnets cannot overlap with each other within the same VPC instance.
* A subnet is automatically associated with the default route table once created.
* You can bind a tag when creating a subnet. The tag list in the response indicates the tags that have been successfully added.
     * @param req CreateSubnetsRequest
     * @return CreateSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public CreateSubnetsResponse CreateSubnets(CreateSubnetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateSubnetsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateSubnets", CreateSubnetsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a VPC instance.
* The subnet mask of the smallest IP address range that can be created is 28 (16 IP addresses), that of the largest IP address ranges 10.0.0.0/12 and 172.16.0.0/12 is 12 (1,048,576 IP addresses), and that of the largest IP address range 192.168.0.0/16 is 16 (65,536 IP addresses). For more information on how to plan VPC IP ranges, see [Network Planning](https://intl.cloud.tencent.com/document/product/215/30313?from_cn_redirect=1).
* The number of VPC instances that can be created in a region is limited. For more information, see <a href="https://intl.cloud.tencent.com/doc/product/215/537?from_cn_redirect=1" title="VPC Use Limits">VPC Use Limits</a>. To request more resources, [submit a ticket](https://console.cloud.tencent.com/workorder/category).
* You can bind tags when creating a VPC instance. The tag list in the response indicates the tags that have been successfully added.
     * @param req CreateVpcRequest
     * @return CreateVpcResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpcResponse CreateVpc(CreateVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVpcResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateVpc", CreateVpcResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an endpoint.
     * @param req CreateVpcEndPointRequest
     * @return CreateVpcEndPointResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpcEndPointResponse CreateVpcEndPoint(CreateVpcEndPointRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVpcEndPointResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateVpcEndPoint", CreateVpcEndPointResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create an endpoint service.
     * @param req CreateVpcEndPointServiceRequest
     * @return CreateVpcEndPointServiceResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpcEndPointServiceResponse CreateVpcEndPointService(CreateVpcEndPointServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVpcEndPointServiceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateVpcEndPointService", CreateVpcEndPointServiceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create the endpoint service allowlist.
     * @param req CreateVpcEndPointServiceWhiteListRequest
     * @return CreateVpcEndPointServiceWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpcEndPointServiceWhiteListResponse CreateVpcEndPointServiceWhiteList(CreateVpcEndPointServiceWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVpcEndPointServiceWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateVpcEndPointServiceWhiteList", CreateVpcEndPointServiceWhiteListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create a VPN tunnel.
>?This API is async. You can call the [`DescribeVpcTaskResult`](https://intl.cloud.tencent.com/document/api/215/59037?from_cn_redirect=1) API to query the task result. When the task is completed, you can continue other tasks.
>
     * @param req CreateVpnConnectionRequest
     * @return CreateVpnConnectionResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpnConnectionResponse CreateVpnConnection(CreateVpnConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVpnConnectionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateVpnConnection", CreateVpnConnectionResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (CreateVpnGateway) is used to create a VPN gateway.
     * @param req CreateVpnGatewayRequest
     * @return CreateVpnGatewayResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpnGatewayResponse CreateVpnGateway(CreateVpnGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVpnGatewayResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateVpnGateway", CreateVpnGatewayResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to create destination routes of a route-based VPN gateway.
     * @param req CreateVpnGatewayRoutesRequest
     * @return CreateVpnGatewayRoutesResponse
     * @throws TencentCloudSDKException
     */
    public CreateVpnGatewayRoutesResponse CreateVpnGatewayRoutes(CreateVpnGatewayRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<CreateVpnGatewayRoutesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "CreateVpnGatewayRoutes", CreateVpnGatewayRoutesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DeleteAddressTemplate) is used to delete an IP address template.
     * @param req DeleteAddressTemplateRequest
     * @return DeleteAddressTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAddressTemplateResponse DeleteAddressTemplate(DeleteAddressTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAddressTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteAddressTemplate", DeleteAddressTemplateResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DeleteAddressTemplateGroup) is used to delete an IP address template group.
     * @param req DeleteAddressTemplateGroupRequest
     * @return DeleteAddressTemplateGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAddressTemplateGroupResponse DeleteAddressTemplateGroup(DeleteAddressTemplateGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAddressTemplateGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteAddressTemplateGroup", DeleteAddressTemplateGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a secondary CIDR block.
     * @param req DeleteAssistantCidrRequest
     * @return DeleteAssistantCidrResponse
     * @throws TencentCloudSDKException
     */
    public DeleteAssistantCidrResponse DeleteAssistantCidr(DeleteAssistantCidrRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteAssistantCidrResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteAssistantCidr", DeleteAssistantCidrResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete bandwidth packages, including [device bandwidth packages](https://intl.cloud.tencent.com/document/product/684/15246?from_cn_redirect=1#.E8.AE.BE.E5.A4.87.E5.B8.A6.E5.AE.BD.E5.8C.85) and [IP bandwidth packages](https://intl.cloud.tencent.com/document/product/684/15246?from_cn_redirect=1#ip-.E5.B8.A6.E5.AE.BD.E5.8C.85).
     * @param req DeleteBandwidthPackageRequest
     * @return DeleteBandwidthPackageResponse
     * @throws TencentCloudSDKException
     */
    public DeleteBandwidthPackageResponse DeleteBandwidthPackage(DeleteBandwidthPackageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteBandwidthPackageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteBandwidthPackage", DeleteBandwidthPackageResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DeleteCcn) is used to delete CCNs.
* After deletion, the routes between all instances associated with the CCN will be deleted, and the network will be interrupted. Please confirm this operation in advance.
* CCN deletion is an irreversible operation. Please proceed with caution.

     * @param req DeleteCcnRequest
     * @return DeleteCcnResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCcnResponse DeleteCcn(DeleteCcnRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCcnResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteCcn", DeleteCcnResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DeleteCustomerGateway) is used to delete customer gateways.
     * @param req DeleteCustomerGatewayRequest
     * @return DeleteCustomerGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteCustomerGatewayResponse DeleteCustomerGateway(DeleteCustomerGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteCustomerGatewayResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteCustomerGateway", DeleteCustomerGatewayResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a direct connect gateway.
<li>For a NAT gateway, NAT and ACL rules will be cleared upon the deletion of a direct connect gateway.
<li>After the deletion of a direct connect gateway, the routing policy associated with the gateway in the route table will also be deleted.
This API is completed asynchronously. If you need to query the async job execution results, please use the `RequestId` returned by this API to poll the `QueryTask` API.
     * @param req DeleteDirectConnectGatewayRequest
     * @return DeleteDirectConnectGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDirectConnectGatewayResponse DeleteDirectConnectGateway(DeleteDirectConnectGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDirectConnectGatewayResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteDirectConnectGateway", DeleteDirectConnectGatewayResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DeleteDirectConnectGatewayCcnRoutes) is used to delete the CCN routes (IDC IP range) of a Direct Connect gateway.
     * @param req DeleteDirectConnectGatewayCcnRoutesRequest
     * @return DeleteDirectConnectGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteDirectConnectGatewayCcnRoutesResponse DeleteDirectConnectGatewayCcnRoutes(DeleteDirectConnectGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteDirectConnectGatewayCcnRoutesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteDirectConnectGatewayCcnRoutes", DeleteDirectConnectGatewayCcnRoutesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a flow log.
     * @param req DeleteFlowLogRequest
     * @return DeleteFlowLogResponse
     * @throws TencentCloudSDKException
     */
    public DeleteFlowLogResponse DeleteFlowLog(DeleteFlowLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteFlowLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteFlowLog", DeleteFlowLogResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an HAVIP. <br />
This API is completed asynchronously. If you need to query the execution result of an async task, please use the `RequestId` returned by this API to poll the `DescribeVpcTaskResult` API.
     * @param req DeleteHaVipRequest
     * @return DeleteHaVipResponse
     * @throws TencentCloudSDKException
     */
    public DeleteHaVipResponse DeleteHaVip(DeleteHaVipRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteHaVipResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteHaVip", DeleteHaVipResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete the local gateway of a CDC instance.
     * @param req DeleteLocalGatewayRequest
     * @return DeleteLocalGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteLocalGatewayResponse DeleteLocalGateway(DeleteLocalGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteLocalGatewayResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteLocalGateway", DeleteLocalGatewayResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a NAT gateway.
When a NAT gateway is deleted, all routes containing this gateway are deleted automatically, and the elastic IP is unbound.
     * @param req DeleteNatGatewayRequest
     * @return DeleteNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNatGatewayResponse DeleteNatGateway(DeleteNatGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNatGatewayResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteNatGateway", DeleteNatGatewayResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete the port forwarding rule of a NAT gateway.
     * @param req DeleteNatGatewayDestinationIpPortTranslationNatRuleRequest
     * @return DeleteNatGatewayDestinationIpPortTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNatGatewayDestinationIpPortTranslationNatRuleResponse DeleteNatGatewayDestinationIpPortTranslationNatRule(DeleteNatGatewayDestinationIpPortTranslationNatRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNatGatewayDestinationIpPortTranslationNatRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteNatGatewayDestinationIpPortTranslationNatRule", DeleteNatGatewayDestinationIpPortTranslationNatRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a SNAT forwarding rule of a NAT gateway.
     * @param req DeleteNatGatewaySourceIpTranslationNatRuleRequest
     * @return DeleteNatGatewaySourceIpTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNatGatewaySourceIpTranslationNatRuleResponse DeleteNatGatewaySourceIpTranslationNatRule(DeleteNatGatewaySourceIpTranslationNatRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNatGatewaySourceIpTranslationNatRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteNatGatewaySourceIpTranslationNatRule", DeleteNatGatewaySourceIpTranslationNatRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a network probe.
     * @param req DeleteNetDetectRequest
     * @return DeleteNetDetectResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNetDetectResponse DeleteNetDetect(DeleteNetDetectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNetDetectResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteNetDetect", DeleteNetDetectResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a network ACL.
     * @param req DeleteNetworkAclRequest
     * @return DeleteNetworkAclResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNetworkAclResponse DeleteNetworkAcl(DeleteNetworkAclRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNetworkAclResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteNetworkAcl", DeleteNetworkAclResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete specified in/outbound rules of the network ACL quintuple. In the `NetworkAclQuintupleEntrySet` parameters, `NetworkAclQuintupleEntryId` is required for `NetworkAclQuintupleEntry`.
     * @param req DeleteNetworkAclQuintupleEntriesRequest
     * @return DeleteNetworkAclQuintupleEntriesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNetworkAclQuintupleEntriesResponse DeleteNetworkAclQuintupleEntries(DeleteNetworkAclQuintupleEntriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNetworkAclQuintupleEntriesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteNetworkAclQuintupleEntries", DeleteNetworkAclQuintupleEntriesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an ENI.
* An ENI cannot be deleted when it’s bound to a CVM.
 * After the deletion, all of its private IP addresses will be released.

This API is completed asynchronously. If you need to query the execution result of an async task, please use the `RequestId` returned by this API to poll the `DescribeVpcTaskResult` API.
     * @param req DeleteNetworkInterfaceRequest
     * @return DeleteNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteNetworkInterfaceResponse DeleteNetworkInterface(DeleteNetworkInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteNetworkInterfaceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteNetworkInterface", DeleteNetworkInterfaceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a route table.
     * @param req DeleteRouteTableRequest
     * @return DeleteRouteTableResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRouteTableResponse DeleteRouteTable(DeleteRouteTableRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRouteTableResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteRouteTable", DeleteRouteTableResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DeleteRoutes) is used to delete routing policies in batches from a route table.
     * @param req DeleteRoutesRequest
     * @return DeleteRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteRoutesResponse DeleteRoutes(DeleteRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteRoutesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteRoutes", DeleteRoutesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DeleteSecurityGroup) is used to delete security groups (SecurityGroup).
* Only security groups under the current account can be deleted.
* A security group cannot be deleted directly if its instance ID is used in the policy of another security group. You need to modify the policy first and then delete the security group.
* A security group cannot be recovered after deletion, please proceed with caution.
     * @param req DeleteSecurityGroupRequest
     * @return DeleteSecurityGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityGroupResponse DeleteSecurityGroup(DeleteSecurityGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSecurityGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteSecurityGroup", DeleteSecurityGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DeleteSecurityGroupPolicies) is used to delete security group policies (SecurityGroupPolicy).
* SecurityGroupPolicySet.Version is used to specify the version of the security group you are operating. If the specified Version number differs from the latest version of the current security group, a failure will be returned. If Version is not specified, the policy of the specified PolicyIndex will be deleted directly.
     * @param req DeleteSecurityGroupPoliciesRequest
     * @return DeleteSecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSecurityGroupPoliciesResponse DeleteSecurityGroupPolicies(DeleteSecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSecurityGroupPoliciesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteSecurityGroupPolicies", DeleteSecurityGroupPoliciesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DeleteServiceTemplate) is used to delete a protocol port template.
     * @param req DeleteServiceTemplateRequest
     * @return DeleteServiceTemplateResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceTemplateResponse DeleteServiceTemplate(DeleteServiceTemplateRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteServiceTemplateResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteServiceTemplate", DeleteServiceTemplateResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DeleteServiceTemplateGroup) is used to delete a protocol port template group.
     * @param req DeleteServiceTemplateGroupRequest
     * @return DeleteServiceTemplateGroupResponse
     * @throws TencentCloudSDKException
     */
    public DeleteServiceTemplateGroupResponse DeleteServiceTemplateGroup(DeleteServiceTemplateGroupRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteServiceTemplateGroupResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteServiceTemplateGroup", DeleteServiceTemplateGroupResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete snapshot policies.
     * @param req DeleteSnapshotPoliciesRequest
     * @return DeleteSnapshotPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSnapshotPoliciesResponse DeleteSnapshotPolicies(DeleteSnapshotPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSnapshotPoliciesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteSnapshotPolicies", DeleteSnapshotPoliciesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a subnet.
* Remove all resources in the subnet before deleting it
     * @param req DeleteSubnetRequest
     * @return DeleteSubnetResponse
     * @throws TencentCloudSDKException
     */
    public DeleteSubnetResponse DeleteSubnet(DeleteSubnetRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteSubnetResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteSubnet", DeleteSubnetResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete traffic packages. Note that only non-valid traffic packages can be deleted. 
     * @param req DeleteTrafficPackagesRequest
     * @return DeleteTrafficPackagesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteTrafficPackagesResponse DeleteTrafficPackages(DeleteTrafficPackagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteTrafficPackagesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteTrafficPackages", DeleteTrafficPackagesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DeleteVpc) is used to delete VPCs.
* Before deleting a VPC, ensure that the VPC contains no resources, including CVMs, cloud databases, NoSQL databases, VPN gateways, direct connect gateways, load balancers, peering connections, and basic network devices that are linked to the VPC.
* The deletion of VPCs is irreversible. Proceed with caution.
     * @param req DeleteVpcRequest
     * @return DeleteVpcResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpcResponse DeleteVpc(DeleteVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteVpcResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteVpc", DeleteVpcResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an endpoint.
     * @param req DeleteVpcEndPointRequest
     * @return DeleteVpcEndPointResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpcEndPointResponse DeleteVpcEndPoint(DeleteVpcEndPointRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteVpcEndPointResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteVpcEndPoint", DeleteVpcEndPointResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete an endpoint service.


     * @param req DeleteVpcEndPointServiceRequest
     * @return DeleteVpcEndPointServiceResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpcEndPointServiceResponse DeleteVpcEndPointService(DeleteVpcEndPointServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteVpcEndPointServiceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteVpcEndPointService", DeleteVpcEndPointServiceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete the endpoint service allowlist.
     * @param req DeleteVpcEndPointServiceWhiteListRequest
     * @return DeleteVpcEndPointServiceWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpcEndPointServiceWhiteListResponse DeleteVpcEndPointServiceWhiteList(DeleteVpcEndPointServiceWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteVpcEndPointServiceWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteVpcEndPointServiceWhiteList", DeleteVpcEndPointServiceWhiteListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a VPN tunnel.
     * @param req DeleteVpnConnectionRequest
     * @return DeleteVpnConnectionResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpnConnectionResponse DeleteVpnConnection(DeleteVpnConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteVpnConnectionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteVpnConnection", DeleteVpnConnectionResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DeleteVpnGateway) is used to delete a VPN gateway. Currently, only deletion of pay-as-you-go IPSEC gateway instances in running status is supported.
     * @param req DeleteVpnGatewayRequest
     * @return DeleteVpnGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpnGatewayResponse DeleteVpnGateway(DeleteVpnGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteVpnGatewayResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteVpnGateway", DeleteVpnGatewayResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete routes of a VPN gateway. 
     * @param req DeleteVpnGatewayRoutesRequest
     * @return DeleteVpnGatewayRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DeleteVpnGatewayRoutesResponse DeleteVpnGatewayRoutes(DeleteVpnGatewayRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DeleteVpnGatewayRoutesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DeleteVpnGatewayRoutes", DeleteVpnGatewayRoutesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeAccountAttributes) is used to query your account attributes.
     * @param req DescribeAccountAttributesRequest
     * @return DescribeAccountAttributesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAccountAttributesResponse DescribeAccountAttributes(DescribeAccountAttributesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAccountAttributesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAccountAttributes", DescribeAccountAttributesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeAddressQuota) is used to query the quota information of your [Elastic IP](https://intl.cloud.tencent.com/document/product/213/1941?from_cn_redirect=1) (EIP) in the current region. For more information, see [EIP product introduction](https://intl.cloud.tencent.com/document/product/213/5733?from_cn_redirect=1).
     * @param req DescribeAddressQuotaRequest
     * @return DescribeAddressQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressQuotaResponse DescribeAddressQuota(DescribeAddressQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAddressQuotaResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAddressQuota", DescribeAddressQuotaResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeAddressTemplateGroups) is used to query an IP address template group.
     * @param req DescribeAddressTemplateGroupsRequest
     * @return DescribeAddressTemplateGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressTemplateGroupsResponse DescribeAddressTemplateGroups(DescribeAddressTemplateGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAddressTemplateGroupsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAddressTemplateGroups", DescribeAddressTemplateGroupsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeAddressTemplates) is used to query an IP address template.
     * @param req DescribeAddressTemplatesRequest
     * @return DescribeAddressTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressTemplatesResponse DescribeAddressTemplates(DescribeAddressTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAddressTemplatesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAddressTemplates", DescribeAddressTemplatesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeAddresses) is used to query the information of one or multiple [Elastic IPs](https://intl.cloud.tencent.com/document/product/213/1941?from_cn_redirect=1).
* If the parameter is empty, a number (as specified by the `Limit`, the default value is 20) of EIPs will be returned.
     * @param req DescribeAddressesRequest
     * @return DescribeAddressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAddressesResponse DescribeAddresses(DescribeAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAddressesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAddresses", DescribeAddressesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of secondary CIDR blocks.
     * @param req DescribeAssistantCidrRequest
     * @return DescribeAssistantCidrResponse
     * @throws TencentCloudSDKException
     */
    public DescribeAssistantCidrResponse DescribeAssistantCidr(DescribeAssistantCidrRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeAssistantCidrResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeAssistantCidr", DescribeAssistantCidrResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the current billable usage of a pay-as-you-go bandwidth package.
     * @param req DescribeBandwidthPackageBillUsageRequest
     * @return DescribeBandwidthPackageBillUsageResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBandwidthPackageBillUsageResponse DescribeBandwidthPackageBillUsage(DescribeBandwidthPackageBillUsageRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBandwidthPackageBillUsageResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBandwidthPackageBillUsage", DescribeBandwidthPackageBillUsageResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the maximum and used number of bandwidth packages under the account in the current region.
     * @param req DescribeBandwidthPackageQuotaRequest
     * @return DescribeBandwidthPackageQuotaResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBandwidthPackageQuotaResponse DescribeBandwidthPackageQuota(DescribeBandwidthPackageQuotaRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBandwidthPackageQuotaResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBandwidthPackageQuota", DescribeBandwidthPackageQuotaResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query resources in a bandwidth package based on the unique package ID. You can filter the result by specifying conditions and paginate the query results.

     * @param req DescribeBandwidthPackageResourcesRequest
     * @return DescribeBandwidthPackageResourcesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBandwidthPackageResourcesResponse DescribeBandwidthPackageResources(DescribeBandwidthPackageResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBandwidthPackageResourcesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBandwidthPackageResources", DescribeBandwidthPackageResourcesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query bandwidth package information, including the unique ID of the bandwidth package, the type, the billing mode, the name, and the resource information.
     * @param req DescribeBandwidthPackagesRequest
     * @return DescribeBandwidthPackagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeBandwidthPackagesResponse DescribeBandwidthPackages(DescribeBandwidthPackagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeBandwidthPackagesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeBandwidthPackages", DescribeBandwidthPackagesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeCcnAttachedInstances) is used to query the network instances associated with the CCN instance.
     * @param req DescribeCcnAttachedInstancesRequest
     * @return DescribeCcnAttachedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcnAttachedInstancesResponse DescribeCcnAttachedInstances(DescribeCcnAttachedInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCcnAttachedInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCcnAttachedInstances", DescribeCcnAttachedInstancesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the outbound bandwidth caps of all regions connected with a CCN instance. The API only returns regions included in the associated network instances.
     * @param req DescribeCcnRegionBandwidthLimitsRequest
     * @return DescribeCcnRegionBandwidthLimitsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcnRegionBandwidthLimitsResponse DescribeCcnRegionBandwidthLimits(DescribeCcnRegionBandwidthLimitsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCcnRegionBandwidthLimitsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCcnRegionBandwidthLimits", DescribeCcnRegionBandwidthLimitsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeCcnRoutes) is used to query routes that have been added to a CCN.
     * @param req DescribeCcnRoutesRequest
     * @return DescribeCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcnRoutesResponse DescribeCcnRoutes(DescribeCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCcnRoutesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCcnRoutes", DescribeCcnRoutesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeCcns) is used to query the CCN list.
     * @param req DescribeCcnsRequest
     * @return DescribeCcnsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCcnsResponse DescribeCcns(DescribeCcnsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCcnsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCcns", DescribeCcnsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeClassicLinkInstances) is used to query the Classiclink instances list.
     * @param req DescribeClassicLinkInstancesRequest
     * @return DescribeClassicLinkInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeClassicLinkInstancesResponse DescribeClassicLinkInstances(DescribeClassicLinkInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeClassicLinkInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeClassicLinkInstances", DescribeClassicLinkInstancesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the compliance review requests created by the user. 
A service provider can query all review requests created by any `APPID` under its account. Other users can only query their own review requests.
     * @param req DescribeCrossBorderComplianceRequest
     * @return DescribeCrossBorderComplianceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCrossBorderComplianceResponse DescribeCrossBorderCompliance(DescribeCrossBorderComplianceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCrossBorderComplianceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCrossBorderCompliance", DescribeCrossBorderComplianceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeCustomerGatewayVendors) is used to query the information of supported customer gateway vendors.
     * @param req DescribeCustomerGatewayVendorsRequest
     * @return DescribeCustomerGatewayVendorsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomerGatewayVendorsResponse DescribeCustomerGatewayVendors(DescribeCustomerGatewayVendorsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomerGatewayVendorsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCustomerGatewayVendors", DescribeCustomerGatewayVendorsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeCustomerGateways) is used to query the customer gateway list.
     * @param req DescribeCustomerGatewaysRequest
     * @return DescribeCustomerGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeCustomerGatewaysResponse DescribeCustomerGateways(DescribeCustomerGatewaysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeCustomerGatewaysResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeCustomerGateways", DescribeCustomerGatewaysResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeDirectConnectGatewayCcnRoutes) is used to query the CCN routes (IDC IP range) of the Direct Connect gateway.
     * @param req DescribeDirectConnectGatewayCcnRoutesRequest
     * @return DescribeDirectConnectGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDirectConnectGatewayCcnRoutesResponse DescribeDirectConnectGatewayCcnRoutes(DescribeDirectConnectGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDirectConnectGatewayCcnRoutesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeDirectConnectGatewayCcnRoutes", DescribeDirectConnectGatewayCcnRoutesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query direct connect gateways.
     * @param req DescribeDirectConnectGatewaysRequest
     * @return DescribeDirectConnectGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeDirectConnectGatewaysResponse DescribeDirectConnectGateways(DescribeDirectConnectGatewaysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeDirectConnectGatewaysResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeDirectConnectGateways", DescribeDirectConnectGatewaysResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the information of a flow log.
     * @param req DescribeFlowLogRequest
     * @return DescribeFlowLogResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowLogResponse DescribeFlowLog(DescribeFlowLogRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowLogResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeFlowLog", DescribeFlowLogResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query all the flow logs of the current account.
     * @param req DescribeFlowLogsRequest
     * @return DescribeFlowLogsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeFlowLogsResponse DescribeFlowLogs(DescribeFlowLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeFlowLogsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeFlowLogs", DescribeFlowLogsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the traffic monitoring details of the gateway.
* You can only use this API to query a single gateway instance, which means you must pass in only one of `VpnId`, `DirectConnectGatewayId`, `PeeringConnectionId`, or `NatId`.
* If the gateway has traffic, but no data is returned when this API is called, please check whether gateway traffic monitoring has been enabled in the corresponding gateway details page in the console.
     * @param req DescribeGatewayFlowMonitorDetailRequest
     * @return DescribeGatewayFlowMonitorDetailResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayFlowMonitorDetailResponse DescribeGatewayFlowMonitorDetail(DescribeGatewayFlowMonitorDetailRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGatewayFlowMonitorDetailResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeGatewayFlowMonitorDetail", DescribeGatewayFlowMonitorDetailResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the inbound IP bandwidth limit of a gateway.
     * @param req DescribeGatewayFlowQosRequest
     * @return DescribeGatewayFlowQosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeGatewayFlowQosResponse DescribeGatewayFlowQos(DescribeGatewayFlowQosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeGatewayFlowQosResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeGatewayFlowQos", DescribeGatewayFlowQosResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeHaVips) is used to query the list of highly available virtual IPs (HAVIP).
     * @param req DescribeHaVipsRequest
     * @return DescribeHaVipsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeHaVipsResponse DescribeHaVips(DescribeHaVipsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeHaVipsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeHaVips", DescribeHaVipsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to obtain the download link of an IP location database.
<font color="#FF0000">This API will be discontinued soon and is only available for existing users.</font>
     * @param req DescribeIpGeolocationDatabaseUrlRequest
     * @return DescribeIpGeolocationDatabaseUrlResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpGeolocationDatabaseUrlResponse DescribeIpGeolocationDatabaseUrl(DescribeIpGeolocationDatabaseUrlRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIpGeolocationDatabaseUrlResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeIpGeolocationDatabaseUrl", DescribeIpGeolocationDatabaseUrlResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the location and network information of one or more IP addresses.
<font color="#FF0000">This API will be discontinued soon and is only available for existing users.</font>
     * @param req DescribeIpGeolocationInfosRequest
     * @return DescribeIpGeolocationInfosResponse
     * @throws TencentCloudSDKException
     */
    public DescribeIpGeolocationInfosResponse DescribeIpGeolocationInfos(DescribeIpGeolocationInfosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeIpGeolocationInfosResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeIpGeolocationInfos", DescribeIpGeolocationInfosResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query local gateways of a CDC instance.
     * @param req DescribeLocalGatewayRequest
     * @return DescribeLocalGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DescribeLocalGatewayResponse DescribeLocalGateway(DescribeLocalGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeLocalGatewayResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeLocalGateway", DescribeLocalGatewayResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the array of objects of a NAT gateway's port forwarding rules.
     * @param req DescribeNatGatewayDestinationIpPortTranslationNatRulesRequest
     * @return DescribeNatGatewayDestinationIpPortTranslationNatRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatGatewayDestinationIpPortTranslationNatRulesResponse DescribeNatGatewayDestinationIpPortTranslationNatRules(DescribeNatGatewayDestinationIpPortTranslationNatRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNatGatewayDestinationIpPortTranslationNatRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeNatGatewayDestinationIpPortTranslationNatRules", DescribeNatGatewayDestinationIpPortTranslationNatRulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the routes between a NAT gateway and Direct Connect.
     * @param req DescribeNatGatewayDirectConnectGatewayRouteRequest
     * @return DescribeNatGatewayDirectConnectGatewayRouteResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatGatewayDirectConnectGatewayRouteResponse DescribeNatGatewayDirectConnectGatewayRoute(DescribeNatGatewayDirectConnectGatewayRouteRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNatGatewayDirectConnectGatewayRouteResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeNatGatewayDirectConnectGatewayRoute", DescribeNatGatewayDirectConnectGatewayRouteResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the NAT gateway's SNAT forwarding rules.
     * @param req DescribeNatGatewaySourceIpTranslationNatRulesRequest
     * @return DescribeNatGatewaySourceIpTranslationNatRulesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatGatewaySourceIpTranslationNatRulesResponse DescribeNatGatewaySourceIpTranslationNatRules(DescribeNatGatewaySourceIpTranslationNatRulesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNatGatewaySourceIpTranslationNatRulesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeNatGatewaySourceIpTranslationNatRules", DescribeNatGatewaySourceIpTranslationNatRulesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query NAT gateways.
     * @param req DescribeNatGatewaysRequest
     * @return DescribeNatGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNatGatewaysResponse DescribeNatGateways(DescribeNatGatewaysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNatGatewaysResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeNatGateways", DescribeNatGatewaysResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeNetDetectStates) is used to query the list of network detection verification results.
     * @param req DescribeNetDetectStatesRequest
     * @return DescribeNetDetectStatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetDetectStatesResponse DescribeNetDetectStates(DescribeNetDetectStatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetDetectStatesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeNetDetectStates", DescribeNetDetectStatesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeNetDetects) is used to query the list of network detection instances.
     * @param req DescribeNetDetectsRequest
     * @return DescribeNetDetectsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetDetectsResponse DescribeNetDetects(DescribeNetDetectsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetDetectsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeNetDetects", DescribeNetDetectsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the list of in/outbound network ACL quintuple entries.
     * @param req DescribeNetworkAclQuintupleEntriesRequest
     * @return DescribeNetworkAclQuintupleEntriesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkAclQuintupleEntriesResponse DescribeNetworkAclQuintupleEntries(DescribeNetworkAclQuintupleEntriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetworkAclQuintupleEntriesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeNetworkAclQuintupleEntries", DescribeNetworkAclQuintupleEntriesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query a list of network ACLs.
     * @param req DescribeNetworkAclsRequest
     * @return DescribeNetworkAclsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkAclsResponse DescribeNetworkAcls(DescribeNetworkAclsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetworkAclsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeNetworkAcls", DescribeNetworkAclsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeNetworkInterfaceLimit) is used to query the ENI quota based on the ID of CVM instance or ENI. It returns the ENI quota to which the CVM instance can be bound and the IP address quota that can be allocated to the ENI.
     * @param req DescribeNetworkInterfaceLimitRequest
     * @return DescribeNetworkInterfaceLimitResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkInterfaceLimitResponse DescribeNetworkInterfaceLimit(DescribeNetworkInterfaceLimitRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetworkInterfaceLimitResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeNetworkInterfaceLimit", DescribeNetworkInterfaceLimitResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeNetworkInterfaces) is used to query the ENI list.
     * @param req DescribeNetworkInterfacesRequest
     * @return DescribeNetworkInterfacesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeNetworkInterfacesResponse DescribeNetworkInterfaces(DescribeNetworkInterfacesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeNetworkInterfacesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeNetworkInterfaces", DescribeNetworkInterfacesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query route tables.
     * @param req DescribeRouteTablesRequest
     * @return DescribeRouteTablesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeRouteTablesResponse DescribeRouteTables(DescribeRouteTablesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeRouteTablesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeRouteTables", DescribeRouteTablesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeSecurityGroupAssociationStatistics) is used to query statistics on the instances associated with a security group.
     * @param req DescribeSecurityGroupAssociationStatisticsRequest
     * @return DescribeSecurityGroupAssociationStatisticsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupAssociationStatisticsResponse DescribeSecurityGroupAssociationStatistics(DescribeSecurityGroupAssociationStatisticsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityGroupAssociationStatisticsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSecurityGroupAssociationStatistics", DescribeSecurityGroupAssociationStatisticsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeSecurityGroupPolicies) is used to query security group policies.
     * @param req DescribeSecurityGroupPoliciesRequest
     * @return DescribeSecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupPoliciesResponse DescribeSecurityGroupPolicies(DescribeSecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityGroupPoliciesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSecurityGroupPolicies", DescribeSecurityGroupPoliciesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeSecurityGroupReferences) is used to query referred security groups.
     * @param req DescribeSecurityGroupReferencesRequest
     * @return DescribeSecurityGroupReferencesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupReferencesResponse DescribeSecurityGroupReferences(DescribeSecurityGroupReferencesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityGroupReferencesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSecurityGroupReferences", DescribeSecurityGroupReferencesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeSecurityGroups) is used to query security groups.
     * @param req DescribeSecurityGroupsRequest
     * @return DescribeSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSecurityGroupsResponse DescribeSecurityGroups(DescribeSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSecurityGroupsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSecurityGroups", DescribeSecurityGroupsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeServiceTemplateGroups) is used to query a protocol port template group.
     * @param req DescribeServiceTemplateGroupsRequest
     * @return DescribeServiceTemplateGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceTemplateGroupsResponse DescribeServiceTemplateGroups(DescribeServiceTemplateGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceTemplateGroupsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeServiceTemplateGroups", DescribeServiceTemplateGroupsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeServiceTemplates) is used to query protocol port templates.
     * @param req DescribeServiceTemplatesRequest
     * @return DescribeServiceTemplatesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeServiceTemplatesResponse DescribeServiceTemplates(DescribeServiceTemplatesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeServiceTemplatesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeServiceTemplates", DescribeServiceTemplatesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the snapshot file contents.
     * @param req DescribeSgSnapshotFileContentRequest
     * @return DescribeSgSnapshotFileContentResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSgSnapshotFileContentResponse DescribeSgSnapshotFileContent(DescribeSgSnapshotFileContentRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSgSnapshotFileContentResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSgSnapshotFileContent", DescribeSgSnapshotFileContentResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query instances associated with a snapshot policy.
     * @param req DescribeSnapshotAttachedInstancesRequest
     * @return DescribeSnapshotAttachedInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotAttachedInstancesResponse DescribeSnapshotAttachedInstances(DescribeSnapshotAttachedInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotAttachedInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSnapshotAttachedInstances", DescribeSnapshotAttachedInstancesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query snapshot files.
     * @param req DescribeSnapshotFilesRequest
     * @return DescribeSnapshotFilesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotFilesResponse DescribeSnapshotFiles(DescribeSnapshotFilesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotFilesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSnapshotFiles", DescribeSnapshotFilesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query snapshot policies.
     * @param req DescribeSnapshotPoliciesRequest
     * @return DescribeSnapshotPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSnapshotPoliciesResponse DescribeSnapshotPolicies(DescribeSnapshotPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSnapshotPoliciesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSnapshotPolicies", DescribeSnapshotPoliciesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the subnet resource.
     * @param req DescribeSubnetResourceDashboardRequest
     * @return DescribeSubnetResourceDashboardResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubnetResourceDashboardResponse DescribeSubnetResourceDashboard(DescribeSubnetResourceDashboardRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubnetResourceDashboardResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSubnetResourceDashboard", DescribeSubnetResourceDashboardResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeSubnets) is used to query the list of subnets.
     * @param req DescribeSubnetsRequest
     * @return DescribeSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeSubnetsResponse DescribeSubnets(DescribeSubnetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeSubnetsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeSubnets", DescribeSubnetsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the EIP async job execution results.
     * @param req DescribeTaskResultRequest
     * @return DescribeTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTaskResultResponse DescribeTaskResult(DescribeTaskResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTaskResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeTaskResult", DescribeTaskResultResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the details of shared traffic packages.
     * @param req DescribeTrafficPackagesRequest
     * @return DescribeTrafficPackagesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeTrafficPackagesResponse DescribeTrafficPackages(DescribeTrafficPackagesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeTrafficPackagesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeTrafficPackages", DescribeTrafficPackagesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the IP usage of a subnet or VPC.
If the IP is occupied, the resource type and ID associated with the are is returned. If the IP is not used, it returns null.
     * @param req DescribeUsedIpAddressRequest
     * @return DescribeUsedIpAddressResponse
     * @throws TencentCloudSDKException
     */
    public DescribeUsedIpAddressResponse DescribeUsedIpAddress(DescribeUsedIpAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeUsedIpAddressResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeUsedIpAddress", DescribeUsedIpAddressResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the endpoint list.
     * @param req DescribeVpcEndPointRequest
     * @return DescribeVpcEndPointResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcEndPointResponse DescribeVpcEndPoint(DescribeVpcEndPointRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcEndPointResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVpcEndPoint", DescribeVpcEndPointResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the endpoint service list.
     * @param req DescribeVpcEndPointServiceRequest
     * @return DescribeVpcEndPointServiceResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcEndPointServiceResponse DescribeVpcEndPointService(DescribeVpcEndPointServiceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcEndPointServiceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVpcEndPointService", DescribeVpcEndPointServiceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the endpoint service allowlist.
     * @param req DescribeVpcEndPointServiceWhiteListRequest
     * @return DescribeVpcEndPointServiceWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcEndPointServiceWhiteListResponse DescribeVpcEndPointServiceWhiteList(DescribeVpcEndPointServiceWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcEndPointServiceWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVpcEndPointServiceWhiteList", DescribeVpcEndPointServiceWhiteListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     * This API (DescribeVpcInstances) is used to query a list of VCM instances on VPC.
     * @param req DescribeVpcInstancesRequest
     * @return DescribeVpcInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcInstancesResponse DescribeVpcInstances(DescribeVpcInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVpcInstances", DescribeVpcInstancesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeVpcIpv6Addresses) is used to query `VPC` `IPv6` information.
This API is used to query only the information of `IPv6` addresses that are already in use. When querying IPs that have not yet been used, this API will not report an error, but the IPs will not appear in the returned results.
     * @param req DescribeVpcIpv6AddressesRequest
     * @return DescribeVpcIpv6AddressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcIpv6AddressesResponse DescribeVpcIpv6Addresses(DescribeVpcIpv6AddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcIpv6AddressesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVpcIpv6Addresses", DescribeVpcIpv6AddressesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeVpcPrivateIpAddresses) is used to query the private IP information of a VPC.<br />
This API is used to query only the information of IP addresses that are already in use. When querying IPs that have not yet been used, this API will not report an error, but the IPs will not appear in the returned results.
     * @param req DescribeVpcPrivateIpAddressesRequest
     * @return DescribeVpcPrivateIpAddressesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcPrivateIpAddressesResponse DescribeVpcPrivateIpAddresses(DescribeVpcPrivateIpAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcPrivateIpAddressesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVpcPrivateIpAddresses", DescribeVpcPrivateIpAddressesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *View VPC resources.
     * @param req DescribeVpcResourceDashboardRequest
     * @return DescribeVpcResourceDashboardResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcResourceDashboardResponse DescribeVpcResourceDashboard(DescribeVpcResourceDashboardRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcResourceDashboardResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVpcResourceDashboard", DescribeVpcResourceDashboardResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the execution result of a VPC task.
     * @param req DescribeVpcTaskResultRequest
     * @return DescribeVpcTaskResultResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcTaskResultResponse DescribeVpcTaskResult(DescribeVpcTaskResultRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcTaskResultResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVpcTaskResult", DescribeVpcTaskResultResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeVpcs) is used to query the VPC list.
     * @param req DescribeVpcsRequest
     * @return DescribeVpcsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpcsResponse DescribeVpcs(DescribeVpcsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpcsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVpcs", DescribeVpcsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to used to query the list of VPN tunnels.
     * @param req DescribeVpnConnectionsRequest
     * @return DescribeVpnConnectionsResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpnConnectionsResponse DescribeVpnConnections(DescribeVpnConnectionsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpnConnectionsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVpnConnections", DescribeVpnConnectionsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query VPN gateway-based CCN routes.
     * @param req DescribeVpnGatewayCcnRoutesRequest
     * @return DescribeVpnGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpnGatewayCcnRoutesResponse DescribeVpnGatewayCcnRoutes(DescribeVpnGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpnGatewayCcnRoutesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVpnGatewayCcnRoutes", DescribeVpnGatewayCcnRoutesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query VPN gateway routes.
     * @param req DescribeVpnGatewayRoutesRequest
     * @return DescribeVpnGatewayRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpnGatewayRoutesResponse DescribeVpnGatewayRoutes(DescribeVpnGatewayRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpnGatewayRoutesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVpnGatewayRoutes", DescribeVpnGatewayRoutesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DescribeVpnGateways) is used to query the VPN gateway list.
     * @param req DescribeVpnGatewaysRequest
     * @return DescribeVpnGatewaysResponse
     * @throws TencentCloudSDKException
     */
    public DescribeVpnGatewaysResponse DescribeVpnGateways(DescribeVpnGatewaysRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DescribeVpnGatewaysResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DescribeVpnGateways", DescribeVpnGatewaysResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DetachCcnInstances) is used to unbind a specified network instance from a CCN instance.<br />
After unbinding the network instance, the corresponding routing policy will also be deleted.
     * @param req DetachCcnInstancesRequest
     * @return DetachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DetachCcnInstancesResponse DetachCcnInstances(DetachCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachCcnInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DetachCcnInstances", DetachCcnInstancesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a Classiclink.
>?This API is async. You can call the [`DescribeVpcTaskResult`](https://intl.cloud.tencent.com/document/api/215/59037?from_cn_redirect=1) API to query the task result. When the task is completed, you can continue other tasks.
>
     * @param req DetachClassicLinkVpcRequest
     * @return DetachClassicLinkVpcResponse
     * @throws TencentCloudSDKException
     */
    public DetachClassicLinkVpcResponse DetachClassicLinkVpc(DetachClassicLinkVpcRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachClassicLinkVpcResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DetachClassicLinkVpc", DetachClassicLinkVpcResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to unbind an ENI from a CVM.
This API is completed asynchronously. If you need to query the execution result of an async task, please use the `RequestId` returned by this API to poll the `DescribeVpcTaskResult` API.
     * @param req DetachNetworkInterfaceRequest
     * @return DetachNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public DetachNetworkInterfaceResponse DetachNetworkInterface(DetachNetworkInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachNetworkInterfaceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DetachNetworkInterface", DetachNetworkInterfaceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to disassociate a snapshot policy with instances.
     * @param req DetachSnapshotInstancesRequest
     * @return DetachSnapshotInstancesResponse
     * @throws TencentCloudSDKException
     */
    public DetachSnapshotInstancesResponse DetachSnapshotInstances(DetachSnapshotInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DetachSnapshotInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DetachSnapshotInstances", DetachSnapshotInstancesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DisableCcnRoutes) is used to disable CCN routes that are already enabled.
     * @param req DisableCcnRoutesRequest
     * @return DisableCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public DisableCcnRoutesResponse DisableCcnRoutes(DisableCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableCcnRoutesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DisableCcnRoutes", DisableCcnRoutesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to disable flow log.
     * @param req DisableFlowLogsRequest
     * @return DisableFlowLogsResponse
     * @throws TencentCloudSDKException
     */
    public DisableFlowLogsResponse DisableFlowLogs(DisableFlowLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableFlowLogsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DisableFlowLogs", DisableFlowLogsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to disable gateway traffic monitor.
     * @param req DisableGatewayFlowMonitorRequest
     * @return DisableGatewayFlowMonitorResponse
     * @throws TencentCloudSDKException
     */
    public DisableGatewayFlowMonitorResponse DisableGatewayFlowMonitor(DisableGatewayFlowMonitorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableGatewayFlowMonitorResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DisableGatewayFlowMonitor", DisableGatewayFlowMonitorResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to disable specified snapshot policies.
     * @param req DisableSnapshotPoliciesRequest
     * @return DisableSnapshotPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public DisableSnapshotPoliciesResponse DisableSnapshotPolicies(DisableSnapshotPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisableSnapshotPoliciesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DisableSnapshotPolicies", DisableSnapshotPoliciesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to unbind an [Elastic IP](https://intl.cloud.tencent.com/document/product/213/1941?from_cn_redirect=1) (EIP for short).
* This API supports unbinding an EIP from CVM instances and ENIs.
* This API does not support unbinding an EIP from a NAT Gateway. To unbind an EIP from a NAT Gateway, use the [`DisassociateNatGatewayAddress`](https://intl.cloud.tencent.com/document/api/215/36716?from_cn_redirect=1) API.
* Only EIPs in BIND or BIND_ENI status can be unbound.
* Blocked EIPs cannot be unbound.
     * @param req DisassociateAddressRequest
     * @return DisassociateAddressResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateAddressResponse DisassociateAddress(DisassociateAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateAddressResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DisassociateAddress", DisassociateAddressResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to unbind a direct connect gateway from a NAT Gateway. After unbinding, the direct connect gateway cannot access internet through the NAT Gateway.
     * @param req DisassociateDirectConnectGatewayNatGatewayRequest
     * @return DisassociateDirectConnectGatewayNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateDirectConnectGatewayNatGatewayResponse DisassociateDirectConnectGatewayNatGateway(DisassociateDirectConnectGatewayNatGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateDirectConnectGatewayNatGatewayResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DisassociateDirectConnectGatewayNatGateway", DisassociateDirectConnectGatewayNatGatewayResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to unbind an EIP from a NAT gateway.
     * @param req DisassociateNatGatewayAddressRequest
     * @return DisassociateNatGatewayAddressResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateNatGatewayAddressResponse DisassociateNatGatewayAddress(DisassociateNatGatewayAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateNatGatewayAddressResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DisassociateNatGatewayAddress", DisassociateNatGatewayAddressResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to disassociate a network ACL from subnets in a VPC instance.
     * @param req DisassociateNetworkAclSubnetsRequest
     * @return DisassociateNetworkAclSubnetsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateNetworkAclSubnetsResponse DisassociateNetworkAclSubnets(DisassociateNetworkAclSubnetsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateNetworkAclSubnetsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DisassociateNetworkAclSubnets", DisassociateNetworkAclSubnetsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (DisassociateNetworkInterfaceSecurityGroups) is used to detach (or fully detach if possible) a security group from an ENI.
     * @param req DisassociateNetworkInterfaceSecurityGroupsRequest
     * @return DisassociateNetworkInterfaceSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateNetworkInterfaceSecurityGroupsResponse DisassociateNetworkInterfaceSecurityGroups(DisassociateNetworkInterfaceSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateNetworkInterfaceSecurityGroupsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DisassociateNetworkInterfaceSecurityGroups", DisassociateNetworkInterfaceSecurityGroupsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to unbind an endpoint from a security group.
     * @param req DisassociateVpcEndPointSecurityGroupsRequest
     * @return DisassociateVpcEndPointSecurityGroupsResponse
     * @throws TencentCloudSDKException
     */
    public DisassociateVpcEndPointSecurityGroupsResponse DisassociateVpcEndPointSecurityGroups(DisassociateVpcEndPointSecurityGroupsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DisassociateVpcEndPointSecurityGroupsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DisassociateVpcEndPointSecurityGroups", DisassociateVpcEndPointSecurityGroupsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to download VPN tunnel configurations.
     * @param req DownloadCustomerGatewayConfigurationRequest
     * @return DownloadCustomerGatewayConfigurationResponse
     * @throws TencentCloudSDKException
     */
    public DownloadCustomerGatewayConfigurationResponse DownloadCustomerGatewayConfiguration(DownloadCustomerGatewayConfigurationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<DownloadCustomerGatewayConfigurationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "DownloadCustomerGatewayConfiguration", DownloadCustomerGatewayConfigurationResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (EnableCcnRoutes) is used to enable CCN routes that are already added.<br />
This API is used to verify whether there will be conflict with an existing route after a CCN route is enabled. If there is a conflict, the route will not be enabled, and the process will fail. When a conflict occurs, you must disable the conflicting route before you can enable the desired route.
     * @param req EnableCcnRoutesRequest
     * @return EnableCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public EnableCcnRoutesResponse EnableCcnRoutes(EnableCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableCcnRoutesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "EnableCcnRoutes", EnableCcnRoutesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to enable flow log.
     * @param req EnableFlowLogsRequest
     * @return EnableFlowLogsResponse
     * @throws TencentCloudSDKException
     */
    public EnableFlowLogsResponse EnableFlowLogs(EnableFlowLogsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableFlowLogsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "EnableFlowLogs", EnableFlowLogsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to enable gateway traffic monitor.
     * @param req EnableGatewayFlowMonitorRequest
     * @return EnableGatewayFlowMonitorResponse
     * @throws TencentCloudSDKException
     */
    public EnableGatewayFlowMonitorResponse EnableGatewayFlowMonitor(EnableGatewayFlowMonitorRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableGatewayFlowMonitorResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "EnableGatewayFlowMonitor", EnableGatewayFlowMonitorResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to enable specified snapshot policies. 
     * @param req EnableSnapshotPoliciesRequest
     * @return EnableSnapshotPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public EnableSnapshotPoliciesResponse EnableSnapshotPolicies(EnableSnapshotPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableSnapshotPoliciesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "EnableSnapshotPolicies", EnableSnapshotPoliciesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to determine whether to accept the request of connecting with an endpoint.
     * @param req EnableVpcEndPointConnectRequest
     * @return EnableVpcEndPointConnectResponse
     * @throws TencentCloudSDKException
     */
    public EnableVpcEndPointConnectResponse EnableVpcEndPointConnect(EnableVpcEndPointConnectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<EnableVpcEndPointConnectResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "EnableVpcEndPointConnect", EnableVpcEndPointConnectResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to get a pair of VPN tunnel health check addresses. 
     * @param req GenerateVpnConnectionDefaultHealthCheckIpRequest
     * @return GenerateVpnConnectionDefaultHealthCheckIpResponse
     * @throws TencentCloudSDKException
     */
    public GenerateVpnConnectionDefaultHealthCheckIpResponse GenerateVpnConnectionDefaultHealthCheckIp(GenerateVpnConnectionDefaultHealthCheckIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GenerateVpnConnectionDefaultHealthCheckIpResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "GenerateVpnConnectionDefaultHealthCheckIp", GenerateVpnConnectionDefaultHealthCheckIpResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the bandwidth limits of a CCN instance. Monthly-subscribed CCNs only support Inter-region Bandwidth Limits, while the pay-as-you-go CCNs support both the Inter-region Bandwidth Limits and Region Outbound Bandwidth Limits. 
     * @param req GetCcnRegionBandwidthLimitsRequest
     * @return GetCcnRegionBandwidthLimitsResponse
     * @throws TencentCloudSDKException
     */
    public GetCcnRegionBandwidthLimitsResponse GetCcnRegionBandwidthLimits(GetCcnRegionBandwidthLimitsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<GetCcnRegionBandwidthLimitsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "GetCcnRegionBandwidthLimits", GetCcnRegionBandwidthLimitsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to bind an EIP to an HAVIP. <br />
This API is completed asynchronously. If you need to query the execution result of an async task, please use the `RequestId` returned by this API to poll the `DescribeVpcTaskResult` API.
     * @param req HaVipAssociateAddressIpRequest
     * @return HaVipAssociateAddressIpResponse
     * @throws TencentCloudSDKException
     */
    public HaVipAssociateAddressIpResponse HaVipAssociateAddressIp(HaVipAssociateAddressIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<HaVipAssociateAddressIpResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "HaVipAssociateAddressIp", HaVipAssociateAddressIpResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to unbind an EIP from an HAVIP. <br />
This API is completed asynchronously. If you need to query the execution result of an async task, please use the `RequestId` returned by this API to poll the `DescribeVpcTaskResult` API.
     * @param req HaVipDisassociateAddressIpRequest
     * @return HaVipDisassociateAddressIpResponse
     * @throws TencentCloudSDKException
     */
    public HaVipDisassociateAddressIpResponse HaVipDisassociateAddressIp(HaVipDisassociateAddressIpRequest req) throws TencentCloudSDKException{
        JsonResponseModel<HaVipDisassociateAddressIpResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "HaVipDisassociateAddressIp", HaVipDisassociateAddressIpResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to query the price of creating a direct connect gateway.
     * @param req InquirePriceCreateDirectConnectGatewayRequest
     * @return InquirePriceCreateDirectConnectGatewayResponse
     * @throws TencentCloudSDKException
     */
    public InquirePriceCreateDirectConnectGatewayResponse InquirePriceCreateDirectConnectGateway(InquirePriceCreateDirectConnectGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquirePriceCreateDirectConnectGatewayResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "InquirePriceCreateDirectConnectGateway", InquirePriceCreateDirectConnectGatewayResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (InquiryPriceRenewVpnGateway) is used to query the price for VPN gateway renewal. Currently, only querying prices for IPSEC-type gateways is supported.
     * @param req InquiryPriceRenewVpnGatewayRequest
     * @return InquiryPriceRenewVpnGatewayResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceRenewVpnGatewayResponse InquiryPriceRenewVpnGateway(InquiryPriceRenewVpnGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceRenewVpnGatewayResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "InquiryPriceRenewVpnGateway", InquiryPriceRenewVpnGatewayResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (InquiryPriceResetVpnGatewayInternetMaxBandwidth) is used to query the price for adjusting the bandwidth cap of a VPN gateway.
     * @param req InquiryPriceResetVpnGatewayInternetMaxBandwidthRequest
     * @return InquiryPriceResetVpnGatewayInternetMaxBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public InquiryPriceResetVpnGatewayInternetMaxBandwidthResponse InquiryPriceResetVpnGatewayInternetMaxBandwidth(InquiryPriceResetVpnGatewayInternetMaxBandwidthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<InquiryPriceResetVpnGatewayInternetMaxBandwidthResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "InquiryPriceResetVpnGatewayInternetMaxBandwidth", InquiryPriceResetVpnGatewayInternetMaxBandwidthResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to migrate ENIs.
This API is completed asynchronously. If you need to query the execution result of an async task, please use the `RequestId` returned by this API to poll the `DescribeVpcTaskResult` API.
     * @param req MigrateNetworkInterfaceRequest
     * @return MigrateNetworkInterfaceResponse
     * @throws TencentCloudSDKException
     */
    public MigrateNetworkInterfaceResponse MigrateNetworkInterface(MigrateNetworkInterfaceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MigrateNetworkInterfaceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "MigrateNetworkInterface", MigrateNetworkInterfaceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to migrate the private IPs between ENIs. 
* Note that primary IPs cannot be migrated. 
* The source and destination ENI must be within the same subnet.  

This API is completed asynchronously. If you need to query the execution result of an async task, please use the `RequestId` returned by this API to poll the `DescribeVpcTaskResult` API.
     * @param req MigratePrivateIpAddressRequest
     * @return MigratePrivateIpAddressResponse
     * @throws TencentCloudSDKException
     */
    public MigratePrivateIpAddressResponse MigratePrivateIpAddress(MigratePrivateIpAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<MigratePrivateIpAddressResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "MigratePrivateIpAddress", MigratePrivateIpAddressResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (ModifyAddressAttribute) is used to modify the name of an [Elastic IP](https://intl.cloud.tencent.com/document/product/213/1941?from_cn_redirect=1).
     * @param req ModifyAddressAttributeRequest
     * @return ModifyAddressAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressAttributeResponse ModifyAddressAttribute(ModifyAddressAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAddressAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyAddressAttribute", ModifyAddressAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to adjust the network billing mode of an EIP. Please note that it's available to users whose network fees are billed on IPs but not CVMs.
* The network billing mode can be switched between `BANDWIDTH_PREPAID_BY_MONTH` and `TRAFFIC_POSTPAID_BY_HOUR`.
* The network billing mode for each EIP be changed for up to twice.
     * @param req ModifyAddressInternetChargeTypeRequest
     * @return ModifyAddressInternetChargeTypeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressInternetChargeTypeResponse ModifyAddressInternetChargeType(ModifyAddressInternetChargeTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAddressInternetChargeTypeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyAddressInternetChargeType", ModifyAddressInternetChargeTypeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (ModifyAddressTemplateAttribute) is used to modify an IP address template.
     * @param req ModifyAddressTemplateAttributeRequest
     * @return ModifyAddressTemplateAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressTemplateAttributeResponse ModifyAddressTemplateAttribute(ModifyAddressTemplateAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAddressTemplateAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyAddressTemplateAttribute", ModifyAddressTemplateAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (ModifyAddressTemplateGroupAttribute) is used to modify an IP address template group.
     * @param req ModifyAddressTemplateGroupAttributeRequest
     * @return ModifyAddressTemplateGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressTemplateGroupAttributeResponse ModifyAddressTemplateGroupAttribute(ModifyAddressTemplateGroupAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAddressTemplateGroupAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyAddressTemplateGroupAttribute", ModifyAddressTemplateGroupAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to adjust the bandwidth of [Elastic IP](https://intl.cloud.tencent.com/document/product/213/1941?from_cn_redirect=1), including EIP billed on a pay-as-you-go, monthly subscription, and bandwidth package basis.
     * @param req ModifyAddressesBandwidthRequest
     * @return ModifyAddressesBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAddressesBandwidthResponse ModifyAddressesBandwidth(ModifyAddressesBandwidthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAddressesBandwidthResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyAddressesBandwidth", ModifyAddressesBandwidthResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to batch modify (add or delete) secondary CIDR blocks.
     * @param req ModifyAssistantCidrRequest
     * @return ModifyAssistantCidrResponse
     * @throws TencentCloudSDKException
     */
    public ModifyAssistantCidrResponse ModifyAssistantCidr(ModifyAssistantCidrRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyAssistantCidrResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyAssistantCidr", ModifyAssistantCidrResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the attributes of a bandwidth package, including the bandwidth package name, and so on.
     * @param req ModifyBandwidthPackageAttributeRequest
     * @return ModifyBandwidthPackageAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyBandwidthPackageAttributeResponse ModifyBandwidthPackageAttribute(ModifyBandwidthPackageAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyBandwidthPackageAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyBandwidthPackageAttribute", ModifyBandwidthPackageAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify CCN-associated instance attributes. Currently, only the `description` can be modified.
     * @param req ModifyCcnAttachedInstancesAttributeRequest
     * @return ModifyCcnAttachedInstancesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCcnAttachedInstancesAttributeResponse ModifyCcnAttachedInstancesAttribute(ModifyCcnAttachedInstancesAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCcnAttachedInstancesAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyCcnAttachedInstancesAttribute", ModifyCcnAttachedInstancesAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (ModifyCcnAttribute) is used to modify CCN attributes.
     * @param req ModifyCcnAttributeRequest
     * @return ModifyCcnAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCcnAttributeResponse ModifyCcnAttribute(ModifyCcnAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCcnAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyCcnAttribute", ModifyCcnAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the bandwidth limit policy of a postpaid CCN instance.
     * @param req ModifyCcnRegionBandwidthLimitsTypeRequest
     * @return ModifyCcnRegionBandwidthLimitsTypeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCcnRegionBandwidthLimitsTypeResponse ModifyCcnRegionBandwidthLimitsType(ModifyCcnRegionBandwidthLimitsTypeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCcnRegionBandwidthLimitsTypeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyCcnRegionBandwidthLimitsType", ModifyCcnRegionBandwidthLimitsTypeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (ModifyCustomerGatewayAttribute) is used to modify the customer gateway information.
     * @param req ModifyCustomerGatewayAttributeRequest
     * @return ModifyCustomerGatewayAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyCustomerGatewayAttributeResponse ModifyCustomerGatewayAttribute(ModifyCustomerGatewayAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyCustomerGatewayAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyCustomerGatewayAttribute", ModifyCustomerGatewayAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the attributes of a direct connect gateway.

     * @param req ModifyDirectConnectGatewayAttributeRequest
     * @return ModifyDirectConnectGatewayAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyDirectConnectGatewayAttributeResponse ModifyDirectConnectGatewayAttribute(ModifyDirectConnectGatewayAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyDirectConnectGatewayAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyDirectConnectGatewayAttribute", ModifyDirectConnectGatewayAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the attributes of a flow log.
     * @param req ModifyFlowLogAttributeRequest
     * @return ModifyFlowLogAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyFlowLogAttributeResponse ModifyFlowLogAttribute(ModifyFlowLogAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyFlowLogAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyFlowLogAttribute", ModifyFlowLogAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to adjust the bandwidth limit of a gateway.
     * @param req ModifyGatewayFlowQosRequest
     * @return ModifyGatewayFlowQosResponse
     * @throws TencentCloudSDKException
     */
    public ModifyGatewayFlowQosResponse ModifyGatewayFlowQos(ModifyGatewayFlowQosRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyGatewayFlowQosResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyGatewayFlowQos", ModifyGatewayFlowQosResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (ModifyHaVipAttribute) is used to modify HAVIP attributes.
     * @param req ModifyHaVipAttributeRequest
     * @return ModifyHaVipAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyHaVipAttributeResponse ModifyHaVipAttribute(ModifyHaVipAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyHaVipAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyHaVipAttribute", ModifyHaVipAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (ModifyIpv6AddressesAttribute) is used to modify the private IPv6 address attributes of an ENI.
     * @param req ModifyIpv6AddressesAttributeRequest
     * @return ModifyIpv6AddressesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyIpv6AddressesAttributeResponse ModifyIpv6AddressesAttribute(ModifyIpv6AddressesAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyIpv6AddressesAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyIpv6AddressesAttribute", ModifyIpv6AddressesAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the local gateway of a CDC instance.
     * @param req ModifyLocalGatewayRequest
     * @return ModifyLocalGatewayResponse
     * @throws TencentCloudSDKException
     */
    public ModifyLocalGatewayResponse ModifyLocalGateway(ModifyLocalGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyLocalGatewayResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyLocalGateway", ModifyLocalGatewayResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the attributes of a NAT gateway.
     * @param req ModifyNatGatewayAttributeRequest
     * @return ModifyNatGatewayAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatGatewayAttributeResponse ModifyNatGatewayAttribute(ModifyNatGatewayAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNatGatewayAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyNatGatewayAttribute", ModifyNatGatewayAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the port forwarding rule of a NAT gateway.
     * @param req ModifyNatGatewayDestinationIpPortTranslationNatRuleRequest
     * @return ModifyNatGatewayDestinationIpPortTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatGatewayDestinationIpPortTranslationNatRuleResponse ModifyNatGatewayDestinationIpPortTranslationNatRule(ModifyNatGatewayDestinationIpPortTranslationNatRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNatGatewayDestinationIpPortTranslationNatRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyNatGatewayDestinationIpPortTranslationNatRule", ModifyNatGatewayDestinationIpPortTranslationNatRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify a NAT gateway's SNAT forwarding rules.
     * @param req ModifyNatGatewaySourceIpTranslationNatRuleRequest
     * @return ModifyNatGatewaySourceIpTranslationNatRuleResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNatGatewaySourceIpTranslationNatRuleResponse ModifyNatGatewaySourceIpTranslationNatRule(ModifyNatGatewaySourceIpTranslationNatRuleRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNatGatewaySourceIpTranslationNatRuleResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyNatGatewaySourceIpTranslationNatRule", ModifyNatGatewaySourceIpTranslationNatRuleResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (ModifyNetDetect) is used to modify network detection parameters.
     * @param req ModifyNetDetectRequest
     * @return ModifyNetDetectResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetDetectResponse ModifyNetDetect(ModifyNetDetectRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNetDetectResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyNetDetect", ModifyNetDetectResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the attributes of a network ACL.
     * @param req ModifyNetworkAclAttributeRequest
     * @return ModifyNetworkAclAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetworkAclAttributeResponse ModifyNetworkAclAttribute(ModifyNetworkAclAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNetworkAclAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyNetworkAclAttribute", ModifyNetworkAclAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify (add or delete) the inbound and outbound rules of a network ACL. In `NetworkAclEntrySet` parameters,
* Passing in the new inbound/outbound rules will reset the original rules.
* Passing in the inbound rules will only reset the original inbound rules and not affect the original outbound rules, and vice versa.
     * @param req ModifyNetworkAclEntriesRequest
     * @return ModifyNetworkAclEntriesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetworkAclEntriesResponse ModifyNetworkAclEntries(ModifyNetworkAclEntriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNetworkAclEntriesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyNetworkAclEntries", ModifyNetworkAclEntriesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the in/outbound rules of the network ACL quintuple. In the `NetworkAclQuintupleEntrySet` parameters, `NetworkAclQuintupleEntryId` is required for `NetworkAclQuintupleEntry`.
     * @param req ModifyNetworkAclQuintupleEntriesRequest
     * @return ModifyNetworkAclQuintupleEntriesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetworkAclQuintupleEntriesResponse ModifyNetworkAclQuintupleEntries(ModifyNetworkAclQuintupleEntriesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNetworkAclQuintupleEntriesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyNetworkAclQuintupleEntries", ModifyNetworkAclQuintupleEntriesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (ModifyNetworkInterfaceAttribute) is used to modify ENI attributes.
     * @param req ModifyNetworkInterfaceAttributeRequest
     * @return ModifyNetworkInterfaceAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyNetworkInterfaceAttributeResponse ModifyNetworkInterfaceAttribute(ModifyNetworkInterfaceAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyNetworkInterfaceAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyNetworkInterfaceAttribute", ModifyNetworkInterfaceAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (ModifyPrivateIpAddressesAttribute) is used to modify the private IP attributes of an ENI.
     * @param req ModifyPrivateIpAddressesAttributeRequest
     * @return ModifyPrivateIpAddressesAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyPrivateIpAddressesAttributeResponse ModifyPrivateIpAddressesAttribute(ModifyPrivateIpAddressesAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyPrivateIpAddressesAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyPrivateIpAddressesAttribute", ModifyPrivateIpAddressesAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (ModifyRouteTableAttribute) is used to modify the attributes of a route table.
     * @param req ModifyRouteTableAttributeRequest
     * @return ModifyRouteTableAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyRouteTableAttributeResponse ModifyRouteTableAttribute(ModifyRouteTableAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyRouteTableAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyRouteTableAttribute", ModifyRouteTableAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (ModifySecurityGroupAttribute) is used to modify the attributes of a security group (SecurityGroupPolicy).
     * @param req ModifySecurityGroupAttributeRequest
     * @return ModifySecurityGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupAttributeResponse ModifySecurityGroupAttribute(ModifySecurityGroupAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecurityGroupAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifySecurityGroupAttribute", ModifySecurityGroupAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to reset the `Egress` and `Ingress` rules (SecurityGroupPolicy) of a security group.

<ul>
<li>This API does not support custom indexes <code>PolicyIndex</code>. </li>
<li>For <code>SecurityGroupPolicySet</code> parameter,<ul> <ul>
	<li>If <code>SecurityGroupPolicySet.Version</code> is set to `0`, all policies will be cleared, and <code>Egress</code> and <code>Ingress</code> will be ignored. </li>
	<li>If <code>SecurityGroupPolicySet.Version</code> is not set to `0`, add <code>Egress</code> and <code>Ingress</code> policies: <ul>
		<li><code>Protocol</code>: <code>TCP</code>, <code>UDP</code>, <code>ICMP</code>, <code>ICMPV6</code>, <code>GRE</code>, or <code>ALL</code>. </li>
		<li><code>CidrBlock</code>: a CIDR block in the correct format. In the classic network, even if the CIDR block specified in <code>CidrBlock</code> contains the Tencent Cloud private IPs that are not using for CVMs under your Tencent Cloud account, it does not mean this policy allows you to access those resources. The network isolation policies between tenants take priority over the private network policies in security groups. </li>
		<li><code>Ipv6CidrBlock</code>: an IPv6 CIDR block in the correct format. In the classic network, even if the CIDR block specified in <code>Ipv6CidrBlock</code> contains the Tencent Cloud private IPv6 addresses that are not using for CVMs under your Tencent Cloud account, it does not mean this policy allows you to access those resources. The network isolation policies between tenants take priority over the private network policies in security groups. </li>
		<li><code>SecurityGroupId</code>: ID of the security group. It can be the ID of a security group to be modified, or the ID of another security group in the same project. All private IPs of all CVMs under the security group will be covered. If this field is used, the policy will automatically change according to the CVM associated with the group ID while being used to match network messages. You don't need to change it manually. </li>
		<li><code>Port</code>: a single port number such as 80, or a port range in the format of '8000-8010'.  You may use this field only if the <code>Protocol</code> field takes the value <code>TCP</code> or <code>UDP</code>. </li>
		<li><code>Action</code>: only allows <code>ACCEPT</code> or <code>DROP</code>. </li>
		<li><code>CidrBlock</code>, <code>Ipv6CidrBlock</code>, <code>SecurityGroupId</code>, and <code>AddressTemplate</code> are mutually exclusive. <code>Protocol</code> + <code>Port</code> and <code>ServiceTemplate</code> are mutually exclusive.</li> </li>
</ul></li></ul></li>
</ul>
     * @param req ModifySecurityGroupPoliciesRequest
     * @return ModifySecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ModifySecurityGroupPoliciesResponse ModifySecurityGroupPolicies(ModifySecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySecurityGroupPoliciesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifySecurityGroupPolicies", ModifySecurityGroupPoliciesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (ModifyServiceTemplateAttribute) is used to modify a protocol port template.
     * @param req ModifyServiceTemplateAttributeRequest
     * @return ModifyServiceTemplateAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceTemplateAttributeResponse ModifyServiceTemplateAttribute(ModifyServiceTemplateAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyServiceTemplateAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyServiceTemplateAttribute", ModifyServiceTemplateAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (ModifyServiceTemplateGroupAttribute) is used to modify a protocol port template group.
     * @param req ModifyServiceTemplateGroupAttributeRequest
     * @return ModifyServiceTemplateGroupAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyServiceTemplateGroupAttributeResponse ModifyServiceTemplateGroupAttribute(ModifyServiceTemplateGroupAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyServiceTemplateGroupAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyServiceTemplateGroupAttribute", ModifyServiceTemplateGroupAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify specified snapshot policies.
     * @param req ModifySnapshotPoliciesRequest
     * @return ModifySnapshotPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ModifySnapshotPoliciesResponse ModifySnapshotPolicies(ModifySnapshotPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySnapshotPoliciesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifySnapshotPolicies", ModifySnapshotPoliciesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (ModifySubnetAttribute) is used to modify subnet attributes.
     * @param req ModifySubnetAttributeRequest
     * @return ModifySubnetAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifySubnetAttributeResponse ModifySubnetAttribute(ModifySubnetAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifySubnetAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifySubnetAttribute", ModifySubnetAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (ModifyVpcAttribute) is used to modify VPC attributes.
     * @param req ModifyVpcAttributeRequest
     * @return ModifyVpcAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpcAttributeResponse ModifyVpcAttribute(ModifyVpcAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVpcAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyVpcAttribute", ModifyVpcAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify endpoint attributes.
     * @param req ModifyVpcEndPointAttributeRequest
     * @return ModifyVpcEndPointAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpcEndPointAttributeResponse ModifyVpcEndPointAttribute(ModifyVpcEndPointAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVpcEndPointAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyVpcEndPointAttribute", ModifyVpcEndPointAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the VPC endpoint service attributes.


     * @param req ModifyVpcEndPointServiceAttributeRequest
     * @return ModifyVpcEndPointServiceAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpcEndPointServiceAttributeResponse ModifyVpcEndPointServiceAttribute(ModifyVpcEndPointServiceAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVpcEndPointServiceAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyVpcEndPointServiceAttribute", ModifyVpcEndPointServiceAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify the attributes of the endpoint service allowlist.
     * @param req ModifyVpcEndPointServiceWhiteListRequest
     * @return ModifyVpcEndPointServiceWhiteListResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpcEndPointServiceWhiteListResponse ModifyVpcEndPointServiceWhiteList(ModifyVpcEndPointServiceWhiteListRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVpcEndPointServiceWhiteListResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyVpcEndPointServiceWhiteList", ModifyVpcEndPointServiceWhiteListResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (ModifyVpnConnectionAttribute) is used to modify VPN tunnels.
     * @param req ModifyVpnConnectionAttributeRequest
     * @return ModifyVpnConnectionAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpnConnectionAttributeResponse ModifyVpnConnectionAttribute(ModifyVpnConnectionAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVpnConnectionAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyVpnConnectionAttribute", ModifyVpnConnectionAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (ModifyVpnGatewayAttribute) is used to modify the attributes of VPN gateways.
     * @param req ModifyVpnGatewayAttributeRequest
     * @return ModifyVpnGatewayAttributeResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpnGatewayAttributeResponse ModifyVpnGatewayAttribute(ModifyVpnGatewayAttributeRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVpnGatewayAttributeResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyVpnGatewayAttribute", ModifyVpnGatewayAttributeResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify VPN gateway-based CCN routes.
     * @param req ModifyVpnGatewayCcnRoutesRequest
     * @return ModifyVpnGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpnGatewayCcnRoutesResponse ModifyVpnGatewayCcnRoutes(ModifyVpnGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVpnGatewayCcnRoutesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyVpnGatewayCcnRoutes", ModifyVpnGatewayCcnRoutesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to modify VPN gateway routes.
     * @param req ModifyVpnGatewayRoutesRequest
     * @return ModifyVpnGatewayRoutesResponse
     * @throws TencentCloudSDKException
     */
    public ModifyVpnGatewayRoutesResponse ModifyVpnGatewayRoutes(ModifyVpnGatewayRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ModifyVpnGatewayRoutesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ModifyVpnGatewayRoutes", ModifyVpnGatewayRoutesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to publish a route to CCN. This can also be done by clicking "Publish to CCN" in the operation column on the page of route table list.
     * @param req NotifyRoutesRequest
     * @return NotifyRoutesResponse
     * @throws TencentCloudSDKException
     */
    public NotifyRoutesResponse NotifyRoutes(NotifyRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<NotifyRoutesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "NotifyRoutes", NotifyRoutesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to refresh the route between a NAT gateway and  Direct Connect and update the associated route table.
     * @param req RefreshDirectConnectGatewayRouteToNatGatewayRequest
     * @return RefreshDirectConnectGatewayRouteToNatGatewayResponse
     * @throws TencentCloudSDKException
     */
    public RefreshDirectConnectGatewayRouteToNatGatewayResponse RefreshDirectConnectGatewayRouteToNatGateway(RefreshDirectConnectGatewayRouteToNatGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RefreshDirectConnectGatewayRouteToNatGatewayResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "RefreshDirectConnectGatewayRouteToNatGateway", RefreshDirectConnectGatewayRouteToNatGatewayResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (RejectAttachCcnInstances) is used to reject association operations when instances are associated across accounts for the CCN owner.

     * @param req RejectAttachCcnInstancesRequest
     * @return RejectAttachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public RejectAttachCcnInstancesResponse RejectAttachCcnInstances(RejectAttachCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RejectAttachCcnInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "RejectAttachCcnInstances", RejectAttachCcnInstancesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (ReleaseAddresses) is used to release one or multiple [Elastic IPs](https://intl.cloud.tencent.com/document/product/213/1941?from_cn_redirect=1).
* This operation is irreversible. Once you release an EIP, the IP address associated with the EIP no longer belongs to you.
* Only EIPs in UNBIND status can be released.
     * @param req ReleaseAddressesRequest
     * @return ReleaseAddressesResponse
     * @throws TencentCloudSDKException
     */
    public ReleaseAddressesResponse ReleaseAddresses(ReleaseAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReleaseAddressesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ReleaseAddresses", ReleaseAddressesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to delete a bandwidth package resource, including [Elastic IP](https://intl.cloud.tencent.com/document/product/213/1941?from_cn_redirect=1), [Cloud Load Balancer](https://intl.cloud.tencent.com/document/product/214/517?from_cn_redirect=1), and so on.
     * @param req RemoveBandwidthPackageResourcesRequest
     * @return RemoveBandwidthPackageResourcesResponse
     * @throws TencentCloudSDKException
     */
    public RemoveBandwidthPackageResourcesResponse RemoveBandwidthPackageResources(RemoveBandwidthPackageResourcesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RemoveBandwidthPackageResourcesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "RemoveBandwidthPackageResources", RemoveBandwidthPackageResourcesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (RenewVpnGateway) is used to renew prepaid (monthly subscription) VPN gateways. Currently, only IPSEC gateways are supported.
     * @param req RenewVpnGatewayRequest
     * @return RenewVpnGatewayResponse
     * @throws TencentCloudSDKException
     */
    public RenewVpnGatewayResponse RenewVpnGateway(RenewVpnGatewayRequest req) throws TencentCloudSDKException{
        JsonResponseModel<RenewVpnGatewayResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "RenewVpnGateway", RenewVpnGatewayResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (ReplaceDirectConnectGatewayCcnRoutes) is used to modify the specified route according to the route ID. Batch modification is supported.
     * @param req ReplaceDirectConnectGatewayCcnRoutesRequest
     * @return ReplaceDirectConnectGatewayCcnRoutesResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceDirectConnectGatewayCcnRoutesResponse ReplaceDirectConnectGatewayCcnRoutes(ReplaceDirectConnectGatewayCcnRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReplaceDirectConnectGatewayCcnRoutesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ReplaceDirectConnectGatewayCcnRoutes", ReplaceDirectConnectGatewayCcnRoutesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (ReplaceRouteTableAssociation) is used to modify the route table associated with a subnet.
* A subnet can only be associated with one route table.
     * @param req ReplaceRouteTableAssociationRequest
     * @return ReplaceRouteTableAssociationResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceRouteTableAssociationResponse ReplaceRouteTableAssociation(ReplaceRouteTableAssociationRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReplaceRouteTableAssociationResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ReplaceRouteTableAssociation", ReplaceRouteTableAssociationResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (ReplaceRoutes) is used to modify a specified routing policy by its ID (RouteId). Batch modification is supported.
     * @param req ReplaceRoutesRequest
     * @return ReplaceRoutesResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceRoutesResponse ReplaceRoutes(ReplaceRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReplaceRoutesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ReplaceRoutes", ReplaceRoutesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to batch modify security group policies.
Policies to modify must be in the same direction. `PolicyIndex` must be specified.
     * @param req ReplaceSecurityGroupPoliciesRequest
     * @return ReplaceSecurityGroupPoliciesResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceSecurityGroupPoliciesResponse ReplaceSecurityGroupPolicies(ReplaceSecurityGroupPoliciesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReplaceSecurityGroupPoliciesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ReplaceSecurityGroupPolicies", ReplaceSecurityGroupPoliciesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (ReplaceSecurityGroupPolicy) is used to replace a single security group policy (SecurityGroupPolicy).
Only one policy in a single direction can be replaced in each request, and the PolicyIndex parameter must be specified.
     * @param req ReplaceSecurityGroupPolicyRequest
     * @return ReplaceSecurityGroupPolicyResponse
     * @throws TencentCloudSDKException
     */
    public ReplaceSecurityGroupPolicyResponse ReplaceSecurityGroupPolicy(ReplaceSecurityGroupPolicyRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReplaceSecurityGroupPolicyResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ReplaceSecurityGroupPolicy", ReplaceSecurityGroupPolicyResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (ResetAttachCcnInstances) is used to re-apply for the association operation when the application for cross-account instance association expires.
     * @param req ResetAttachCcnInstancesRequest
     * @return ResetAttachCcnInstancesResponse
     * @throws TencentCloudSDKException
     */
    public ResetAttachCcnInstancesResponse ResetAttachCcnInstances(ResetAttachCcnInstancesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetAttachCcnInstancesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ResetAttachCcnInstances", ResetAttachCcnInstancesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to adjust concurrent connection cap for the NAT gateway.
     * @param req ResetNatGatewayConnectionRequest
     * @return ResetNatGatewayConnectionResponse
     * @throws TencentCloudSDKException
     */
    public ResetNatGatewayConnectionResponse ResetNatGatewayConnection(ResetNatGatewayConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetNatGatewayConnectionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ResetNatGatewayConnection", ResetNatGatewayConnectionResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (ResetRoutes) is used to reset the name of a route table and all its routing policies.<br />
Note: When this API is called, all routing policies in the current route table are deleted before new routing policies are saved, which may incur network interruption.
     * @param req ResetRoutesRequest
     * @return ResetRoutesResponse
     * @throws TencentCloudSDKException
     */
    public ResetRoutesResponse ResetRoutes(ResetRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetRoutesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ResetRoutes", ResetRoutesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *The API is used to reset a VPN tunnel.
     * @param req ResetVpnConnectionRequest
     * @return ResetVpnConnectionResponse
     * @throws TencentCloudSDKException
     */
    public ResetVpnConnectionResponse ResetVpnConnection(ResetVpnConnectionRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetVpnConnectionResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ResetVpnConnection", ResetVpnConnectionResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to adjust the bandwidth cap of a VPN gateway. The adjustment of the VPN gateway bandwidth is limited to [5,100] Mbps and [200,1000] Mbps. 
     * @param req ResetVpnGatewayInternetMaxBandwidthRequest
     * @return ResetVpnGatewayInternetMaxBandwidthResponse
     * @throws TencentCloudSDKException
     */
    public ResetVpnGatewayInternetMaxBandwidthResponse ResetVpnGatewayInternetMaxBandwidth(ResetVpnGatewayInternetMaxBandwidthRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResetVpnGatewayInternetMaxBandwidthResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ResetVpnGatewayInternetMaxBandwidth", ResetVpnGatewayInternetMaxBandwidthResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to restore security group policies with a backup.
     * @param req ResumeSnapshotInstanceRequest
     * @return ResumeSnapshotInstanceResponse
     * @throws TencentCloudSDKException
     */
    public ResumeSnapshotInstanceResponse ResumeSnapshotInstance(ResumeSnapshotInstanceRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ResumeSnapshotInstanceResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ResumeSnapshotInstance", ResumeSnapshotInstanceResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to unbind and release public IPs. 
Note: Starting from Dec 15, 2022, CAM authorization is required for a sub-account to call this API. For more details, see [Authorization Guide](https://intl.cloud.tencent.com/document/product/598/34545?from_cn_redirect=1).
     * @param req ReturnNormalAddressesRequest
     * @return ReturnNormalAddressesResponse
     * @throws TencentCloudSDKException
     */
    public ReturnNormalAddressesResponse ReturnNormalAddresses(ReturnNormalAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<ReturnNormalAddressesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "ReturnNormalAddresses", ReturnNormalAddressesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (SetCcnRegionBandwidthLimits) is used to set the outbound bandwidth cap for CCNs in each region. This API can only set the outbound bandwidth cap for regions in the network instances that have already been associated.
     * @param req SetCcnRegionBandwidthLimitsRequest
     * @return SetCcnRegionBandwidthLimitsResponse
     * @throws TencentCloudSDKException
     */
    public SetCcnRegionBandwidthLimitsResponse SetCcnRegionBandwidthLimits(SetCcnRegionBandwidthLimitsRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetCcnRegionBandwidthLimitsResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "SetCcnRegionBandwidthLimits", SetCcnRegionBandwidthLimitsResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used set the auto-renewal configuration of a VPN gateway.
     * @param req SetVpnGatewaysRenewFlagRequest
     * @return SetVpnGatewaysRenewFlagResponse
     * @throws TencentCloudSDKException
     */
    public SetVpnGatewaysRenewFlagResponse SetVpnGatewaysRenewFlag(SetVpnGatewaysRenewFlagRequest req) throws TencentCloudSDKException{
        JsonResponseModel<SetVpnGatewaysRenewFlagResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "SetVpnGatewaysRenewFlag", SetVpnGatewaysRenewFlagResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to convert a common public IP into an [Elastic IP](https://intl.cloud.tencent.com/document/product/213/1941?from_cn_redirect=1) (EIP for short).
* Tencent Cloud limits the number of times that a user can unbind EIPs and reassign public IPs in each region per day. For more information, see product introduction of [Elastic IP](https://intl.cloud.tencent.com/document/product/213/5733?from_cn_redirect=1). The preceding quota can be obtained through the API [DescribeAddressQuota](https://intl.cloud.tencent.com/document/product/215/16701).
     * @param req TransformAddressRequest
     * @return TransformAddressResponse
     * @throws TencentCloudSDKException
     */
    public TransformAddressResponse TransformAddress(TransformAddressRequest req) throws TencentCloudSDKException{
        JsonResponseModel<TransformAddressResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "TransformAddress", TransformAddressResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to release the IPv6 addresses of an ENI. <br />
This API is completed asynchronously. If you need to query the execution result of an async task, please use the `RequestId` returned by this API to poll the `DescribeVpcTaskResult` API.
     * @param req UnassignIpv6AddressesRequest
     * @return UnassignIpv6AddressesResponse
     * @throws TencentCloudSDKException
     */
    public UnassignIpv6AddressesResponse UnassignIpv6Addresses(UnassignIpv6AddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnassignIpv6AddressesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UnassignIpv6Addresses", UnassignIpv6AddressesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (UnassignIpv6CidrBlock) is used to release IPv6 IP ranges.
If the IP range still has occupied IPs that are not yet repossessed, the IP range cannot be released.
     * @param req UnassignIpv6CidrBlockRequest
     * @return UnassignIpv6CidrBlockResponse
     * @throws TencentCloudSDKException
     */
    public UnassignIpv6CidrBlockResponse UnassignIpv6CidrBlock(UnassignIpv6CidrBlockRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnassignIpv6CidrBlockResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UnassignIpv6CidrBlock", UnassignIpv6CidrBlockResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API (UnassignIpv6SubnetCidrBlock) is used to release IPv6 subnet IP ranges.
If the subnet IP range still has occupied IPs that are not yet repossessed, the subnet IP range cannot be released.
     * @param req UnassignIpv6SubnetCidrBlockRequest
     * @return UnassignIpv6SubnetCidrBlockResponse
     * @throws TencentCloudSDKException
     */
    public UnassignIpv6SubnetCidrBlockResponse UnassignIpv6SubnetCidrBlock(UnassignIpv6SubnetCidrBlockRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnassignIpv6SubnetCidrBlockResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UnassignIpv6SubnetCidrBlock", UnassignIpv6SubnetCidrBlockResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to return the private IP addresses of an ENI.
* If a secondary private IP of an ENI is returned, the EIP will be automatically unassociated as well. The primary private IP of the ENI cannot be returned.

This API is completed asynchronously. If you need to query the execution result of an async task, please use the `RequestId` returned by this API to poll the `DescribeVpcTaskResult` API.
     * @param req UnassignPrivateIpAddressesRequest
     * @return UnassignPrivateIpAddressesResponse
     * @throws TencentCloudSDKException
     */
    public UnassignPrivateIpAddressesResponse UnassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<UnassignPrivateIpAddressesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "UnassignPrivateIpAddresses", UnassignPrivateIpAddressesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

    /**
     *This API is used to withdraw a route from CCN. 
     * @param req WithdrawNotifyRoutesRequest
     * @return WithdrawNotifyRoutesResponse
     * @throws TencentCloudSDKException
     */
    public WithdrawNotifyRoutesResponse WithdrawNotifyRoutes(WithdrawNotifyRoutesRequest req) throws TencentCloudSDKException{
        JsonResponseModel<WithdrawNotifyRoutesResponse> rsp = null;
        String rspStr = "";
        req.setSkipSign(false);
        try {
                return this.internalRequest(req, "WithdrawNotifyRoutes", WithdrawNotifyRoutesResponse.class);
        } catch (JsonSyntaxException e) {
            throw new TencentCloudSDKException("response message: " + rspStr + ".\n Error message: " + e.getMessage());
        }
    }

}
