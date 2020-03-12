// FIXME-begin
function build_sentence(x, y, z)
{
    return (x + " (buddy of " + y + ")" + z);
}    

function mycurry(f)
{
    return function curryficator(...args) 
    {
        if (args.length >= f.length) 
        {
            return f.apply(this, args);
        } 
        else 
        {
            return function(...argsbis) 
            {
            return curryficator.apply(this, args.concat(argsbis));
            }
        }
    };
}
// FIXME-end

const curried = mycurry(build_sentence);
console.log(curried("Tigrou")("Spider")(" was here!"))
console.log(curried("Spider")("Tigrou")(" was also here!"))
console.log(curried("Tigrou", "Spider", " are in a boat... "))
console.log(curried(1)(2, 3))