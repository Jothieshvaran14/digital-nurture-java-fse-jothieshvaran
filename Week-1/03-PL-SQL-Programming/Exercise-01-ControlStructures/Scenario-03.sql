SET SERVEROUTPUT ON;

BEGIN
    FOR l IN (
        SELECT c.Name,
               loanid,
               EndDate
        FROM Loans l
        JOIN Customers c
        ON l.CustomerID=c.CustomerID
        WHERE EndDate<=SYSDATE+30
    )
    LOOP
        DBMS_OUTPUT.PUT_LINE(
            'Reminder sent to '
            ||l.Name||
            ' for Loan '
            ||l.LoanID
        );
    END LOOP;
END;
/