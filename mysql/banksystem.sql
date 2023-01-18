use banksystem;
create table bank(bank_id int primary key auto_increment, bank_name varchar(255) not null,bank_address varchar(255) not null,bank_code varchar(255) not null);
create table customer(customer_id int primary key auto_increment,customer_name varchar(255) not null,customer_email varchar(255) not null,customer_password varchar(255) not null,customer_phno bigint not null,customer_card bigint not null);
create table account(account_id int primary key auto_increment,account_number bigint unique not null,account_balance float not null,account_type varchar(255) not null,bank_id int not null,customer_id int ,foreign key(customer_id) references customer(customer_id));
alter table account add bank_id int;
alter table account add constraint bank_id foreign key(bank_id) references bank(bank_id);
create table transaction(transaction_id int primary key auto_increment,transaction_date date not null,transaction_amount float not null,transaction_type varchar(255) not null,current_balance float not null,account_id,foreign key(account_id) references account(account_id));

create table atm(atm_id int primary key auto_increment,transaction_id int not null,deposite Boolean,withdraw Boolean,checkbalance Boolean,foreign key(transaction_id) references transaction(transaction_id));


insert into bank values(1,"Axis","Bangalore","Axis4455");
insert into customer(customer_name,customer_email,customer_password,customer_phno,customer_card) values("Ram","ramsah@gmail.com,"ram1234",9870654);