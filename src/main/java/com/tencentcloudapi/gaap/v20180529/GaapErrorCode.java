package com.tencentcloudapi.gaap.v20180529;
public enum GaapErrorCode {
    // Not an organizational customer.
     AUTHFAILURE_NOTENTERPRISEAUTHORIZATION("AuthFailure.NotEnterpriseAuthorization"),
     
    // Operation failed.
     FAILEDOPERATION("FailedOperation"),
     
    // Unable to create this connection: insufficient account balance.
     FAILEDOPERATION_ACCOUNTBALANCEINSUFFICIENT("FailedOperation.AccountBalanceInsufficient"),
     
    // The operation is being performed. Do not perform it again.
     FAILEDOPERATION_ACTIONISDOING("FailedOperation.ActionIsDoing"),
     
    // Too many attempts. Please try again later.
     FAILEDOPERATION_ACTIONOPERATETOOQUICKLY("FailedOperation.ActionOperateTooQuickly"),
     
    // Unable to operate in batches: the connections belong to different groups.
     FAILEDOPERATION_BELONGDIFFERENTGROUP("FailedOperation.BelongDifferentGroup"),
     
    // Unable to operate: the certificate is occupied.
     FAILEDOPERATION_CERTIFICATEISUSING("FailedOperation.CertificateIsUsing"),
     
    // Unable to delete: the connection group contains groups.
     FAILEDOPERATION_DELETEPROXYGROUPPROXYREMAINED("FailedOperation.DeleteProxyGroupProxyRemained"),
     
    // The domain name is used by a listener.
     FAILEDOPERATION_DOMAINALREADYEXISTED("FailedOperation.DomainAlreadyExisted"),
     
    // Operation unavailable: the domain name is not running.
     FAILEDOPERATION_DOMAINSTATUSNOTINRUNNING("FailedOperation.DomainStatusNotInRunning"),
     
    // Repeated request. Please check the value of ClientToken.
     FAILEDOPERATION_DUPLICATEDREQUEST("FailedOperation.DuplicatedRequest"),
     
    // Unable to operate: the connection group is not running.
     FAILEDOPERATION_GROUPSTATUSNOTINRUNING("FailedOperation.GroupStatusNotInRuning"),
     
    // Unable to operate: the connection is not running.
     FAILEDOPERATION_INSTANCESTATUSNOTINRUNING("FailedOperation.InstanceStatusNotInRuning"),
     
    // Invalid listener protocol.
     FAILEDOPERATION_INVALIDLISTENERPROTOCOL("FailedOperation.InvalidListenerProtocol"),
     
    // Limit on the number of listeners exceeded.
     FAILEDOPERATION_LIMITNUMOFLISTENER("FailedOperation.LimitNumofListener"),
     
    // The number of connections in the connection group exceeded the limit.
     FAILEDOPERATION_LIMITNUMOFPROXIESINGROUP("FailedOperation.LimitNumofProxiesInGroup"),
     
    // Limit on the number of forwarding rules exceeded.
     FAILEDOPERATION_LIMITNUMOFRULES("FailedOperation.LimitNumofRules"),
     
    // Limit on the number of bound origin servers exceeded.
     FAILEDOPERATION_LIMITREALSERVERNUM("FailedOperation.LimitRealServerNum"),
     
    // The listener is in operation. Do not repeat the operation.
     FAILEDOPERATION_LISTENERHASTASK("FailedOperation.ListenerHasTask"),
     
    // The listener does not support this operation in current status.
     FAILEDOPERATION_LISTENERSTATUSERROR("FailedOperation.ListenerStatusError"),
     
    // Only connections of Version 2.0 are supported.
     FAILEDOPERATION_NOTSUPPORTOLDVERSIONPROXY("FailedOperation.NotSupportOldVersionProxy"),
     
    // This operation is not supported for connection groups.
     FAILEDOPERATION_NOTSUPPORTPROXYGROUP("FailedOperation.NotSupportProxyGroup"),
     
    // The configuration change is not supported.
     FAILEDOPERATION_NOTSUPPORTSCALAR("FailedOperation.NotSupportScalar"),
     
    // Limit on the number of ports for a single operation exceeded.
     FAILEDOPERATION_OPERATELIMITNUMOFLISTENER("FailedOperation.OperateLimitNumofListener"),
     
    // The security policy has been disabled. Do not repeat the operation.
     FAILEDOPERATION_PROXYSECURITYALREADYCLOSE("FailedOperation.ProxySecurityAlreadyClose"),
     
    // The security policy has been enabled. Do not repeat the operation.
     FAILEDOPERATION_PROXYSECURITYALREADYOPEN("FailedOperation.ProxySecurityAlreadyOpen"),
     
    // Failed to add the rule: default connection access rules cannot be denied.
     FAILEDOPERATION_PROXYSECURITYPOLICYDEFAULTRULE("FailedOperation.ProxySecurityPolicyDefaultRule"),
     
    // Failed to add rules: repeated security protection access rules.
     FAILEDOPERATION_PROXYSECURITYPOLICYDUPLICATEDRULE("FailedOperation.ProxySecurityPolicyDuplicatedRule"),
     
    // The security policy already exists. Do not create it again.
     FAILEDOPERATION_PROXYSECURITYPOLICYEXISTED("FailedOperation.ProxySecurityPolicyExisted"),
     
    // The line is sold out or the resource is insufficient. Please submit a ticket.
     FAILEDOPERATION_PROXYSELLOUT("FailedOperation.ProxySellOut"),
     
    // Unable to add listeners: the connection is not running.
     FAILEDOPERATION_PROXYSTATUSNOTINRUNING("FailedOperation.ProxyStatusNotInRuning"),
     
    // This version of connection is not supported.
     FAILEDOPERATION_PROXYVERSIONNOTSUPPORT("FailedOperation.ProxyVersionNotSupport"),
     
    // Failed to delete: it’s bound to an origin server.
     FAILEDOPERATION_REALSERVERALREADYBOUND("FailedOperation.RealServerAlreadyBound"),
     
    // The origin server do not belong to this project.
     FAILEDOPERATION_REALSERVERNOTINPROJECT("FailedOperation.RealServerNotInProject"),
     
    // This resource is not accessible.
     FAILEDOPERATION_RESOURCECANNOTACCESS("FailedOperation.ResourceCanNotAccess"),
     
    // The resource is being upgraded.
     FAILEDOPERATION_RESOURCEUPGRADING("FailedOperation.ResourceUpgrading"),
     
    // Rule already exists.
     FAILEDOPERATION_RULEALREADYEXISTED("FailedOperation.RuleAlreadyExisted"),
     
    // Unverified user.
     FAILEDOPERATION_USERNOTAUTHENTICATED("FailedOperation.UserNotAuthenticated"),
     
    // Internal error.
     INTERNALERROR("InternalError"),
     
    // Incorrect parameter.
     INVALIDPARAMETER("InvalidParameter"),
     
    // Incorrect parameter value.
     INVALIDPARAMETERVALUE("InvalidParameterValue"),
     
    // The domain name is blocked for ICP issues.
     INVALIDPARAMETERVALUE_DOMAININICPBLACKLIST("InvalidParameterValue.DomainInIcpBlacklist"),
     
    // The domain name does not have an ICP filing.
     INVALIDPARAMETERVALUE_DOMAINNOTREGISTER("InvalidParameterValue.DomainNotRegister"),
     
    // The `RealServer` already exists.
     INVALIDPARAMETERVALUE_DUPLICATERS("InvalidParameterValue.DuplicateRS"),
     
    // Listener port already exists.
     INVALIDPARAMETERVALUE_DUPLICATEDLISTENERPORT("InvalidParameterValue.DuplicatedListenerPort"),
     
    // The header is blocklisted.
     INVALIDPARAMETERVALUE_HITBLACKLIST("InvalidParameterValue.HitBlacklist"),
     
    // The bandwidth value is not in the range.
     INVALIDPARAMETERVALUE_INVALIDBANDWIDTH("InvalidParameterValue.InvalidBandwidth"),
     
    // Failed to resolve. Please check the format of certificate content.
     INVALIDPARAMETERVALUE_INVALIDCERTIFICATECONTENT("InvalidParameterValue.InvalidCertificateContent"),
     
    // Certificate unavailable.
     INVALIDPARAMETERVALUE_INVALIDCERTIFICATEID("InvalidParameterValue.InvalidCertificateId"),
     
    // Failed to resolve. Please check the format of certificate key.
     INVALIDPARAMETERVALUE_INVALIDCERTIFICATEKEY("InvalidParameterValue.InvalidCertificateKey"),
     
    // The number of concurrences is not in the range.
     INVALIDPARAMETERVALUE_INVALIDCONCURRENCY("InvalidParameterValue.InvalidConcurrency"),
     
    // The listener port is not available.
     INVALIDPARAMETERVALUE_INVALIDLISTENERPORT("InvalidParameterValue.InvalidListenerPort"),
     
    // The tag is not found or you have no access permission to it.
     INVALIDPARAMETERVALUE_INVALIDTAGS("InvalidParameterValue.InvalidTags"),
     
    // The project does not belong to this user.
     INVALIDPARAMETERVALUE_PROJECTIDNOTBELONG("InvalidParameterValue.ProjectIdNotBelong"),
     
    // The origin server does not belong to this user.
     INVALIDPARAMETERVALUE_REALSERVERNOTBELONG("InvalidParameterValue.RealServerNotBelong"),
     
    // The acceleration region is not found or you have no access permission to it.
     INVALIDPARAMETERVALUE_UNKNOWNACCESSREGION("InvalidParameterValue.UnknownAccessRegion"),
     
    // The origin server region is not found or you have no access permission to it.
     INVALIDPARAMETERVALUE_UNKNOWNDESTREGION("InvalidParameterValue.UnknownDestRegion"),
     
    // The quota limit should not be exceeded.
     LIMITEXCEEDED("LimitExceeded"),
     
    // Missing parameter.
     MISSINGPARAMETER("MissingParameter"),
     
    // The resource does not exist.
     RESOURCENOTFOUND("ResourceNotFound"),
     
    // The resource is unavailable.
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // Restricted resources found in your account. Check your inbox and email for details.
     RESOURCEUNAVAILABLE_ACCOUNTVIOLATION("ResourceUnavailable.AccountViolation"),
     
    // Unauthorized operation.
     UNAUTHORIZEDOPERATION("UnauthorizedOperation"),
     
    // Unknown parameter.
     UNKNOWNPARAMETER("UnknownParameter"),
     
    // Unsupported operation
     UNSUPPORTEDOPERATION("UnsupportedOperation");
     
    private String value;
    private GaapErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

