/*================================================================================
Copyright (c) 2012 Steve Jin. All Rights Reserved.

Redistribution and use in source and binary forms, with or without modification, 
are permitted provided that the following conditions are met:

* Redistributions of source code must retain the above copyright notice, 
this list of conditions and the following disclaimer.

* Redistributions in binary form must reproduce the above copyright notice, 
this list of conditions and the following disclaimer in the documentation 
and/or other materials provided with the distribution.

* Neither the name of VMware, Inc. nor the names of its contributors may be used
to endorse or promote products derived from this software without specific prior 
written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
IN NO EVENT SHALL VMWARE, INC. OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, 
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT 
LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
POSSIBILITY OF SUCH DAMAGE.
================================================================================*/

package com.vmware.vim25;

/**
* @author Steve Jin (http://www.doublecloud.org)
* @version 5.1
*/

@SuppressWarnings("all")
public class NetDnsConfigSpec extends DynamicData {
  public Boolean dhcp;
  public String hostName;
  public String domainName;
  public String[] ipAddress;
  public String[] searchDomain;

  public Boolean getDhcp() {
    return this.dhcp;
  }

  public String getHostName() {
    return this.hostName;
  }

  public String getDomainName() {
    return this.domainName;
  }

  public String[] getIpAddress() {
    return this.ipAddress;
  }

  public String[] getSearchDomain() {
    return this.searchDomain;
  }

  public void setDhcp(Boolean dhcp) {
    this.dhcp=dhcp;
  }

  public void setHostName(String hostName) {
    this.hostName=hostName;
  }

  public void setDomainName(String domainName) {
    this.domainName=domainName;
  }

  public void setIpAddress(String[] ipAddress) {
    this.ipAddress=ipAddress;
  }

  public void setSearchDomain(String[] searchDomain) {
    this.searchDomain=searchDomain;
  }
}