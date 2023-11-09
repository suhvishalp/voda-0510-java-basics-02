drop table if exists transactiondetail ;
drop table  if exists  beneficiaries;
drop table  if exists  reward;
drop table  if exists  account;
drop table if exists customers;

CREATE TABLE `account` (                                 
           `accountNumber` int(20) NOT NULL AUTO_INCREMENT,    
           `name` varchar(50) DEFAULT NULL,                       
           `isactive` tinyint(1) DEFAULT NULL,                    
           `city` varchar(50) DEFAULT NULL,                       
           `country` varchar(50) DEFAULT NULL,                    
           `balance` int(11) DEFAULT NULL,                        
           `emailaddress` varchar(50) DEFAULT NULL,               
           PRIMARY KEY (`accountNumber`)                          
         );

CREATE TABLE `beneficiaries` (                                                                            
                 `ssn` int(20) NOT NULL AUTO_INCREMENT,                                                               
                 `name` varchar(50) DEFAULT NULL,                                                                        
                 `accountnumber` int(20) NOT NULL,                                                                    
                 PRIMARY KEY (`ssn`),                                                                                    
                 KEY `accountnumber` (`accountnumber`),                                                                  
                 CONSTRAINT `beneficiaries_ibfk_1` FOREIGN KEY (`accountnumber`) REFERENCES `account` (`accountNumber`)  
               );


CREATE TABLE `reward` (                                                                            
          `rewardConfirmationNumber` int(20) NOT NULL AUTO_INCREMENT,                                   
          `rewardAmount` int(11) DEFAULT NULL,                                                             
          `accountNumber` int(20) DEFAULT NULL,                                                         
          PRIMARY KEY (`rewardConfirmationNumber`),                                                        
          KEY `accountNumber` (`accountNumber`),                                                           
          CONSTRAINT `reward_ibfk_1` FOREIGN KEY (`accountNumber`) REFERENCES `account` (`accountNumber`)  
        );


CREATE TABLE `transactiondetail` (                                                                            
                     `transactionId` int(20) NOT NULL AUTO_INCREMENT,                                                         
                     `accountNumber` int(20) DEFAULT NULL,                                                                    
                     `transactionDate` date DEFAULT NULL,                                                                        
                     `amount` int(11) DEFAULT NULL,                                                                              
                     `txtype` varchar(10) DEFAULT NULL,                                                                            
                     PRIMARY KEY (`transactionId`),                                                                              
                     KEY `accountNumber` (`accountNumber`),                                                                      
                     CONSTRAINT `transactiondetail_ibfk_1` FOREIGN KEY (`accountNumber`) REFERENCES `account` (`accountNumber`)  
                   );
  CREATE TABLE `customers` (              
             `customerId` int(11) NOT NULL,        
             `name` varchar(50) DEFAULT NULL,      
             `city` varchar(50) DEFAULT NULL,      
             `country` varchar(50) DEFAULT NULL,   
             PRIMARY KEY (`customerId`)            
           );
