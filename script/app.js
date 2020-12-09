const btn=document.querySelector('.btn');
const output=document.querySelector('#output-textarea');

btn.addEventListener('click',generateHash);

function generateHash(){
  const data=document.querySelector('input').value;
  const option=document.querySelector('select').selectedIndex;
  let api;
  if(option==0){
    api=`https://api.hashify.net/hash/md5/hex?value=${data}`;
  }else if(option==1){
    api=`https://api.hashify.net/hash/sha1/hex?value=${data}`
  }else{
    api=`https://api.hashify.net/hash/sha256/hex?value=${data}`
  }
  fetch(api)
  .then(response=>{
    return response.text();
  }).then(data=>{
    console.log(JSON.parse(data));
    output.innerHTML=`${JSON.parse(data).Digest}`
  });
}

output.addEventListener('click',()=>{
  output.select();
})