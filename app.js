const btn=document.querySelector('.btn');
const output=document.querySelector('#output-textarea');

btn.addEventListener('click',generateHash);

function generateHash(){
  const data=document.querySelector('input').value;
  const option=document.querySelector('select').selectedIndex;
  let api;
  if(option==0){
    api=`../java/MD5.java.getMd5(${input})`
  }else if(option==1){
    api=`../java/MD5.java.SHA1(${input})`
  }else{
    api=`../java/MD5.java.SHA256(${input})`
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