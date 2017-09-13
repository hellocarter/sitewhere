package com.sitewhere.user.persistence.mongodb;

import org.bson.Document;

import com.mongodb.client.MongoCollection;
import com.sitewhere.mongodb.BaseMongoClient;

/**
 * Mongo client for interacting with user management object model.
 * 
 * @author Derek
 */
public class UserManagementMongoClient extends BaseMongoClient implements IUserManagementMongoClient {

    /** Injected name used for users collection */
    private String usersCollectionName = IUserManagementMongoClient.DEFAULT_USERS_COLLECTION_NAME;

    /** Injected name used for authorities collection */
    private String authoritiesCollectionName = IUserManagementMongoClient.DEFAULT_AUTHORITIES_COLLECTION_NAME;

    /*
     * (non-Javadoc)
     * 
     * @see
     * com.sitewhere.mongodb.IGlobalManagementMongoClient#getUsersCollection()
     */
    @Override
    public MongoCollection<Document> getUsersCollection() {
	return getGlobalDatabase().getCollection(getUsersCollectionName());
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.sitewhere.mongodb.IGlobalManagementMongoClient#
     * getAuthoritiesCollection()
     */
    @Override
    public MongoCollection<Document> getAuthoritiesCollection() {
	return getGlobalDatabase().getCollection(getAuthoritiesCollectionName());
    }

    public String getUsersCollectionName() {
	return usersCollectionName;
    }

    public void setUsersCollectionName(String usersCollectionName) {
	this.usersCollectionName = usersCollectionName;
    }

    public String getAuthoritiesCollectionName() {
	return authoritiesCollectionName;
    }

    public void setAuthoritiesCollectionName(String authoritiesCollectionName) {
	this.authoritiesCollectionName = authoritiesCollectionName;
    }
}