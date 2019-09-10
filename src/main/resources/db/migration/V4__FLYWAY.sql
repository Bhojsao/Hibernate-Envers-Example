CREATE TABLE  PARCEL_AUD 
   (	
	REV NUMBER(10,0) NOT NULL, 
	REVTYPE NUMBER(3,0), 
	PARCEL_ID NUMBER(10,0) NOT NULL, 
	PARCEL_NAME VARCHAR2(255 CHAR), 
	PARCEL_DESC VARCHAR2(255 CHAR),
	CURRENT_LOCATION VARCHAR2(255 CHAR), 
	ORIGIN VARCHAR2(255 CHAR), 
	DESTINATION VARCHAR2(255 CHAR), 		
	STATE VARCHAR2(255 CHAR), 
	CREATED_BY VARCHAR2(255 CHAR), 
	CREATED_DATE TIMESTAMP (6),
	LAST_MODIFIED_BY VARCHAR2(255 CHAR), 
	LAST_MODIFIED_DATE TIMESTAMP (6),
	PRIMARY KEY (PARCEL_ID, REV) , 
	CONSTRAINT PARCEL_AUD_FK FOREIGN KEY (REV)
	REFERENCES  CUSTOM_REVISION_INFO (REV) 
   );