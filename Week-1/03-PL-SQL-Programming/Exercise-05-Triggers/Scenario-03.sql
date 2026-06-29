CREATE OR REPLACE TRIGGER CheckTransactionRules
BEFORE INSERT
ON Transactions
FOR EACH ROW
DECLARE
    balance NUMBER;
BEGIN

    SELECT Balance
    INTO balance
    FROM Accounts
    WHERE AccountID = :NEW.AccountID;

    IF :NEW.TransactionType = 'Withdrawal'
       AND :NEW.Amount > balance THEN
        RAISE_APPLICATION_ERROR(-20010,'Insufficient Balance');
    END IF;

    IF :NEW.TransactionType = 'Deposit'
       AND :NEW.Amount <= 0 THEN
        RAISE_APPLICATION_ERROR(-20011,'Deposit must be positive');
    END IF;

END;
/