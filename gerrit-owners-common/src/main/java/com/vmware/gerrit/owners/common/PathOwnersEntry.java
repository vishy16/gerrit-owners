/*
 * Copyright (c) 2013 VMware, Inc. All Rights Reserved.
 */
package com.vmware.gerrit.owners.common;

import com.google.gerrit.reviewdb.client.Account;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Path Owners Entry.
 * <p/>
 * Used internally by PathOwners to represent and compute the owners at a specific path.
 */
class PathOwnersEntry {
  private String ownersPath;
  private Set<Account.Id> owners;

  public PathOwnersEntry() {
    owners = new HashSet<Account.Id>();
  }

  public String getOwnersPath() {
    return ownersPath;
  }

  public void setOwnersPath(String ownersPath) {
    this.ownersPath = ownersPath;
  }

  public Set<Account.Id> getOwners() {
    return owners;
  }

  public void addOwners(Collection<Account.Id> owners) {
    this.owners.addAll(owners);
  }
}
