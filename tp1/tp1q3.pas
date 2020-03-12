//fpc 3.0.0
program TP1Q3;

// FIXME-begin

type
    TProc = procedure;

function two : string;
begin
    writeln('two');
end;

function three : string;
begin
    writeln('three');
end;

procedure one(a,b : string);
begin
    writeln('one');
end;
// FIXME-end

begin
    one(two(), three());
    writeln('Pascal!');
end.